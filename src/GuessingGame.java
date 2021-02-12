
import java.util.Scanner;

public class GuessingGame {
    public static void main (String[] args){


            int secretNumber ,attemptNum=0;
            final int Maxattempts=5;
            secretNumber = (int) (Math.random() * 99 + 1);
            Scanner keyboard = new Scanner(System.in);
            int guess;

            do {
                System.out.print("Enter a guess (1-100): ");
                guess = keyboard.nextInt();
                if (guess == secretNumber)

                    System.out.println("You Won !");

                else if (guess < secretNumber)
                    System.out.println("Your guess is lower.");

                else if (guess > secretNumber)

                    System.out.println("Your guess is Higher.");

            } while (guess != secretNumber && ++attemptNum < Maxattempts);
                if (attemptNum == Maxattempts)
                    System.out.println("The number was" + secretNumber);
                    System.out.println("You Lose !!!!!!!!!");

        }

    }