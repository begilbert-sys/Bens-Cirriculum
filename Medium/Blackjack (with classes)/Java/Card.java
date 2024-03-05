// NOTE: this could be a record, but I just define it as a class to make things simpler
public class Card {
    public static final String[] Values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public static final String[] Suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
    public final String value;
    public final String suit;

    public static boolean isValidValue(String value) {
        for (String v : Values) {
            if (v.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidSuit(String suit) {
        for (String s : Suits) {
            if (s.equals(suit)) {
                return true;
            }
        }
        return false;
    }

    public Card(String value, String suit) {
        if (!isValidValue(value)) {
            throw new IllegalArgumentException("\"" + value + "\" is not a valid card value");
        }
        if (!isValidSuit(suit)) {
            throw new IllegalArgumentException("\"" + suit + "\" is not a valid card suit");
        }
        this.value = value;
        this.suit = suit;
    }

    public String toString() {
        return value + " of " + suit;
    }

    public int getIntValue() {
        if (value.equals("Ace")) {
            return 11;
        } else if (value.equals("Jack") || value.equals("Queen") || value.equals("King")) {
            return 10;
        } else {
            return Integer.parseInt(value);
        }
    }
}
