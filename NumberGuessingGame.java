import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100. Try to guess it.");

        // Generate a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;

        int playerGuess;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            playerGuess = scanner.nextInt();
            attempts++;

            if (playerGuess == randomNumber) {
                hasGuessedCorrectly = true;
            } else if (playerGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
        scanner.close();
    }
}
