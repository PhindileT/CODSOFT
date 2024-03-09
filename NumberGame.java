
package numbergame;

import java.util.Random;
import java.util.Scanner;
public class NumberGame {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean playAgain = true;
        int totalAttempts = 0;
        int roundsWon = 0;

        while (playAgain) {
            int generatedNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            int attempts = 0;

            System.out.println("Welcome to Guess the Number game!");
            System.out.println("I have generated a number between 1 and 100. Try to guess it!");

            while (attempts < 5) { // Limit attempts to 5
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the number " + generatedNumber + " correctly in " + attempts + " attempts!");
                    totalAttempts += attempts;
                    roundsWon++;
                    break;
                } else if (guess < generatedNumber) { 
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts == 5) {
                System.out.println("Sorry, you have used all your attempts. The number was: " + generatedNumber);
                totalAttempts += attempts;
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();

            if (!playChoice.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Game Over!");
        System.out.println("Total rounds won: " + roundsWon);
        System.out.println("Total attempts taken: " + totalAttempts);
    }
        
    }
    

