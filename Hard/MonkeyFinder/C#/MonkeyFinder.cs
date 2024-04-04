using System;
public class Board {
    private string[,] board;
    private int rows, columns;
    private int monkeyRow, monkeyColumn;
    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        Random random = new Random();
        monkeyRow = random.Next(rows);
        monkeyColumn = random.Next(columns);

        board = new string[rows, columns];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                board[row,col] = "⬛";
            }
        }
        
    }

    public void display() {
        Console.WriteLine(" 0 1 2 3 4 5 6 7 8 9");
        for (int row = 0; row < rows; row++) {
            Console.Write(row);
            for (int col = 0; col < columns; col++) {
                Console.Write(board[row,col]);
            }
            Console.WriteLine();
        }
    }

    private double distanceToMonkey(int row, int column) {
        double yDiffSquared = (row - monkeyRow) * (row - monkeyRow);
        double xDiffSquared = (column - monkeyColumn) * (column - monkeyColumn);
        return Math.Sqrt(xDiffSquared + yDiffSquared);
    }

    public double guessSquare(int row, int column) {
        double distance = distanceToMonkey(row, column);
        string newTile;
        if (distance == 0) {
            newTile = "🐵";
        }
        else if (distance == 1) {
            newTile = "🟦";
        }
        else if (distance < 3) {
            newTile = "🟩";
        }
        else if (distance < 5) {
            newTile = "🟨";
        }
        else if (distance < 7) {
            newTile = "🟧";
        }
        else {
            newTile = "🟥";
        }
        board[row,column] = newTile;
        return distance;
    }
}
public class MonkeyFinder {
    public static void Main() {
        Board game = new Board(10, 10);
        while (true) {
            Console.Clear();
            game.display();
            Console.Write("Guess a row: ");
            int row = Convert.ToInt32(Console.ReadLine());
            Console.Write("Guess a column: ");
            int col = Convert.ToInt32(Console.ReadLine());
            double d = game.guessSquare(row, col);
            if (d == 0) {
                Console.Clear();
                game.display();
                Console.WriteLine("Monkey Found!");
                break;
            }
        }
    }
}