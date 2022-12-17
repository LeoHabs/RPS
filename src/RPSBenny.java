import java.util.Scanner;

public class RPSBenny {
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_CLEAR_BACKGROUND = "\u001B[49m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_GREEN_TEXT = "\u001B[32m";
    public static final String ANSI_CLEAR_TEXT = "\u001B[39m";


    public static int start(int startingOption) {
        if (startingOption == 0) {
            System.out.println("Type rock, paper or scissors. Don't mind for caps, we got you covered!If you want you can use r,p and s as short for...you know... rock,paper...");
            System.out.println("In the case you are dumb enough to not choose any of the ONLY THREE OPTIONS, we will pick...idk...rock! For you...i guess :/");
            System.out.println("At the start of the game you can choose how many rounds you want to play!");
            System.out.println(("Note: If you choose to play an even number of rounds, a draw may occur, because, you know...math and stuff..."));
            return 1;
        } else {
            return 1;
        }
    }

    public static String cpuTranslator(int cpuChoice) {
        String cpuString = "";
        switch (cpuChoice) {
            case 0:
                cpuString = "paper";
                break;
            case 1:
                cpuString = "scissors";
                break;
            case 2:
                cpuString = "rock";
                break;
        }
        return cpuString;
    }

    public static int userTranslator(String userInput) {
        int userChoice = 0;
        String userString = "";
        switch (userInput) {
            case "paper":
            case "p":
                userString = "paper";
                userChoice = 0;
                break;
            case "scissors":
            case "s":
                userString = "scissors";
                userChoice = 1;
                break;
            case "rock":
            case "r":
                userString = "rock";
                userChoice = 2;
                break;
            default:
                userString = "*lets say it was rock...*";
                System.out.println("Wait...You chose " + userInput + " wtf?|O.O|");
                System.out.println("Ok,yeah you kinda dumb...|o.o||");
                System.out.println("So rock it is...Damn bro... |-.-'|");
                userChoice = 2;
        }
        return userChoice;
    }

    public static void result(int userScore, int cpuScore) {
        if (userScore > cpuScore) {
            System.out.println(ANSI_GREEN_BACKGROUND+"You won " + userScore + " : " + cpuScore+ANSI_CLEAR_BACKGROUND);
            System.out.println("You know,not implying i knew you were dumb from the start, but i kind let you win...yeah...|o.-|");
        } else if (userScore < cpuScore) {
            System.out.println(ANSI_RED_BACKGROUND+"You lost " + userScore + " : " + cpuScore + ANSI_CLEAR_BACKGROUND);
            System.out.println("Not flexing or anything, but i didn't even used 1% processor capacity with you. Hey, sucks to suck am i right?|O.O|");

        } else {
            System.out.println(ANSI_YELLOW_BACKGROUND + userScore + " : " + cpuScore +ANSI_CLEAR_BACKGROUND);
            System.out.println(ANSI_GREEN_TEXT+"\033[3mBenny left the chat\033[0m");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_GREEN_BACKGROUND+"      ______________________________________________      "+ANSI_CLEAR_BACKGROUND);
        System.out.println(ANSI_GREEN_BACKGROUND+"------Welcome to rock,paper,scissors |O.O| Im Benny!------"+ANSI_CLEAR_BACKGROUND);
        System.out.println(ANSI_GREEN_BACKGROUND+"      ----------------------------------------------      "+ANSI_CLEAR_BACKGROUND);
        System.out.println("If you wish for instructions, type 0!");
        System.out.println("If you want to play right away press 1!");

        int gameOn = start(scanner.nextInt());
        int roundsChosen = 1;

        while (gameOn == 1) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Choose how many rounds you want to play |O.O|");
            roundsChosen = scanner.nextInt();
            int initialRounds = roundsChosen;
            int userScore = 0;
            int cpuScore = 0;

            System.out.println("Good luck human! |OuO| Beep boop");

            while (roundsChosen > -1) {
                int cpuChoice = (int) Math.floor(Math.random() * 2);

                System.out.println("ROCK,PAPER,SCISSORS!!");
                String userString = scanner.next().toLowerCase();


                System.out.println("You chose " + userString);
                System.out.println("Benny chose " + cpuTranslator(cpuChoice));


                switch (userTranslator(userString)) {
                    case 0:
                        if (cpuChoice == 0) {
                            System.out.println(ANSI_YELLOW_BACKGROUND+"It's a tie i guess @|0.0|"+ANSI_CLEAR_BACKGROUND);

                        } else if (cpuChoice == 1) {
                            cpuScore++;
                            System.out.println(ANSI_RED_BACKGROUND+"I win!!Im still warming up tho! |OuO|"+ANSI_CLEAR_BACKGROUND);
                            roundsChosen--;
                        } else {
                            userScore++;
                            System.out.println(ANSI_GREEN_BACKGROUND+"You win...|u.u|"+ANSI_CLEAR_BACKGROUND);
                            roundsChosen--;
                        }
                        break;
                    case 1:
                        if (cpuChoice == 0) {
                            userScore++;
                            System.out.println(ANSI_GREEN_BACKGROUND+"You win...|u.u|"+ANSI_CLEAR_BACKGROUND);
                            roundsChosen--;
                        } else if (cpuChoice == 1) {
                            System.out.println(ANSI_YELLOW_BACKGROUND+"It's a tie i guess @|0.0|"+ANSI_CLEAR_BACKGROUND);

                        } else {
                            cpuScore++;
                            System.out.println(ANSI_RED_BACKGROUND+"I win!!Keep it coming! |O0O|"+ANSI_CLEAR_BACKGROUND);
                            roundsChosen--;
                        }
                        break;
                    case 2:
                        if (cpuChoice == 0) {
                            cpuScore++;
                            System.out.println(ANSI_RED_BACKGROUND+"I win!!Im in your head now BOY, or girl! |OuO| *The BennyCompany® doesn't take responsibility for any misogynistic comments Benny may produce :)!"+ANSI_CLEAR_BACKGROUND);
                            roundsChosen--;
                        } else if (cpuChoice == 1) {
                            userScore++;
                            System.out.println(ANSI_GREEN_BACKGROUND+"You win...|u.u|"+ANSI_CLEAR_BACKGROUND);
                            roundsChosen--;

                        } else {
                            System.out.println(ANSI_YELLOW_BACKGROUND+"It's a tie i guess @|0m0|"+ANSI_CLEAR_BACKGROUND);
                        }

                }
                System.out.println("The score is:");
                System.out.println("Benny:" + cpuScore);
                System.out.println("You:" + userScore);
                System.out.println(ANSI_GREEN_TEXT+"---------------------------------------------"+ANSI_CLEAR_TEXT);
                if (userScore > initialRounds / 2 || cpuScore > initialRounds / 2) {
                    break;
                }
            }
            result(userScore,cpuScore);
            System.out.println("If you want to play again press 1! Else, just leave i guess...");
            gameOn = scanner.nextInt();
            if (gameOn != 1) {
                System.out.println("See yahhhhh!");
            }
        }

    }
}



