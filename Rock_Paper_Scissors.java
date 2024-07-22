import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int time = 0; // time variable to play 3 times in total
        int userwins = 0; //  user wins counter
        int computerwins = 0; // computer wins counter
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while (time < 3) { // Loop to run the game 3 times
            System.out.println("Rock, Paper, and Scissors game!");
            System.out.println("Enter your choice for Rock=3, Paper=4, Scissors=5:"); // User's choice
            int userChoice = sc.nextInt();

            // Generate computer's choice
            int computerChoice = random.nextInt(3); // 0, 1, or 2
            if (computerChoice == 0) {
                System.out.println("Computer chose: Rock");
            } else if (computerChoice == 1) {
                System.out.println("Computer chose: Paper");
            } else if (computerChoice == 2) {
                System.out.println("Computer chose: Scissors");
            }

            // Compare user and computer choices
            if ((userChoice == 3 && computerChoice == 2) ||
                    (userChoice == 4 && computerChoice == 0) ||
                    (userChoice == 5 && computerChoice == 1)) {
                System.out.println("User wins this round!");
                userwins++;
            } else if ((userChoice == 5 && computerChoice == 0) ||
                    (userChoice == 3 && computerChoice == 1) ||
                    (userChoice == 4 && computerChoice == 2)) {
                System.out.println("Computer wins this round!");
                computerwins++;
            } else {
                System.out.println("It's a tie this round!");
            }

            time++;
            System.out.println(); //for space
        }

        // Final winner after 3 rounds
        if (userwins > computerwins) {
            System.out.println("User wins with a score of " + userwins);
        } else if (userwins < computerwins) {
            System.out.println("Computer wins with a score of " + computerwins);
        } else {
            System.out.println("It's a tie overall!");
        }


    }
}
