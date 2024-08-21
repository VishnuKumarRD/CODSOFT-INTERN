import java.util.Scanner;
import java.util.Random;

public class Numbergame {

    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        Random random = new Random();
        int generate_num = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int guessChance = 0;
        int guess_num = 0;
        System.out.println("********************************************");
        System.out.println("    WELCOME TO OUR NUMBER GUESSING GAME!    ");
        System.out.println("********************************************");
        System.out.println("I'm thinking a number between 1 and 100!!! Can you guess mee...?");

        while (guess_num != generate_num) {
            System.out.print("Enter your guess: ");
            guess_num = game.nextInt();
            guessChance++;
            if (guessChance == 10) {
                System.out.println("Oops...!Your guesses is out of chance!");
                System.out.println("Don't worry, Try again!!!");
                System.out.println("***Thankyou for your participation***");
                System.exit(0);
            }

            if (guess_num < generate_num) {
                System.out.println("Too low. Guess again...");
            } else if (guess_num > generate_num) {
                System.out.println("Too high. Guess again...");
            } else {
                System.out.println("Congratulations! You guessed the number in " + guessChance + " guesses.");
            }
        }

        game.close();
    }
}
