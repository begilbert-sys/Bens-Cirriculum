
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Currencies {
    public static void main(String[] args) throws Exception {

        Map<String, Double> currencies = new HashMap<>();
        currencies.put("USD", 1.0);
        currencies.put("GBP", 0.79);
        currencies.put("EUR", 0.93);
        currencies.put("YEN", 150.22);
        currencies.put("CNY", 7.12);
        currencies.put("MXN", 17.05);
        currencies.put("INR", 82.99);
        System.out.println("Available currencies: ");
        for (String c : currencies.keySet()) {
            System.out.print(c + " ");
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Which currency would you like to choose?: ");
            String currency = input.nextLine();
            if (currency.equals("quit")) {
                break;
            }
            if (!currencies.containsKey(currency)) {
                System.out.println("Unrecognized currency, try again!");
                continue;
            }
            System.out.print("How much money do you have?: ");
            double money = input.nextDouble();
            input.nextLine();

            // Truncate the double 
            double doubleResult = money * currencies.get(currency);
            String result = String.format("%.2f", doubleResult);
            System.out.println("You have " + result + " " + currency);
            System.out.println("---");
        }
        input.close();

    }
}
