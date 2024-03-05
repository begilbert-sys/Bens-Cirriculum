import java.util.Random;
import java.util.Scanner;
public class EightBall {
    public static void main(String[] args) throws Exception {
        String[] positives = {
            "It is certain", 
            "It is decidedly so", 
            "Without a doubt",
            "Yes definitely", 
            "You may rely on it",
            "As I see it, yes",
            "Most likely",
            "Outlook good",
            "Yes",
            "Signs point to yes"
        };

        String[] neutrals = {
            "Reply hazy, try again",
            "Ask again later",
            "Better not tell you now",
            "Cannot predict now",
            "Concentrate and ask again"
        };

        String[] negatives = {
            "Don't count on it",
            "My reply is no",
            "My sources say no",
            "Outlook not so good",
            "Very doubtful"
        };
        /* 
        these are terminal color codes. 
        if you're running the code in a terminal it'll add color to the output
        but if you're running the code elsewhere it might output gibberish, in which case you can remove them 
        */
        final String C_RESET = "\033[0m";
        final String C_BOLD = "\033[1m";
        final String C_GREEN = "\033[1;32m";
        final String C_YELLOW = "\033[1;33m";
        final String C_RED = "\033[1;31m";

        
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println(C_RESET + "---");
            System.out.print(C_BOLD + "What would you like to ask the 8ball? " + C_RESET);
            String text = input.nextLine();
            if (text.equals("quit")) {
                break;
            }
            System.out.println("8ball says: ");
            int selection = random.nextInt(4);
            if (selection == 0) {
                String element = negatives[random.nextInt(negatives.length)];
                System.out.println(C_RED + element);
            }
            else if (selection == 1) {
                String element = neutrals[random.nextInt(neutrals.length)];
                System.out.println(C_YELLOW + element);
            }
            else {
                String element = positives[random.nextInt(positives.length)];
                System.out.println(C_GREEN + element);
            }
        }
        input.close();
    }
}
