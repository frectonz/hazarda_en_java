import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tries = 0;
        Random random = new Random(System.currentTimeMillis());
        int randomNum = random.nextInt(100);

        while (true) {
            System.out.print("Enter guess or (q) to quit: ");

            Scanner scanner = new Scanner(System.in);
            String guess = scanner.next().trim();

            if (guess.equals("q")) {
                break;
            }

            int guessInt;

            try {
                guessInt = Integer.parseInt(guess);
            } catch (NumberFormatException e) {
                System.out.println("Please input a number");
                continue;
            }

            if (guessInt < 0 || guessInt > 100) {
                System.out.println("Input must be between 0 and 100");
                continue;
            } else {
                tries++;
            }

            if (guessInt > randomNum) {
                System.out.println("Try a smaller number");
            } else if (guessInt < randomNum) {
                System.out.println("Try a larger number");
            } else {
                System.out.println("Correct! You got it in " + tries + " tries!");
                break;
            }
        }
    }
}