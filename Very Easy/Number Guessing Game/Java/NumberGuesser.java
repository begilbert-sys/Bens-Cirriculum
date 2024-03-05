import java.util.Random;
import java.util.Scanner;
public class NumberGuesser {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int randomNum = random.nextInt(100);
        while (true) {
            System.out.println();
            System.out.print("Guess a number:");
            int guess = input.nextInt();
            if (guess > randomNum) {
                System.out.print("Too high!");
            }
            else if (guess < randomNum) {
                System.out.print("Too low!");
            }
            else {
                System.out.print("You got it!");
                break;
            }
        }
        input.close();
    }
}
