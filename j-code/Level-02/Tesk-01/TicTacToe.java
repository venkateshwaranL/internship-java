import java.util.*;
public class TicTacToe {
    static char[][] board = new char[3][3];
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean checkWin(char player) {
        for (int i = 0; i < 3; i++)
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;
        for (int i = 0; i < 3; i++)
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;

        return false;
    }

    public static boolean checkDraw() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }

    public static void makeMove(Scanner scan, char player) {
        int row, col;
        while (true) {
            System.out.print("Player " + player + ", enter row (1-3): ");
            row = scan.nextInt() - 1;
            System.out.print("Enter column (1-3): ");
            col = scan.nextInt() - 1;

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = player;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char currentPlayer;
        boolean playAgain;

        do {
            initializeBoard();
            currentPlayer = 'X';
            boolean gameEnded = false;

            System.out.println("Welcome to Tic-Tac-Toe!");
            displayBoard();

            while (!gameEnded) {
                makeMove(scan, currentPlayer);
                displayBoard();

                if (checkWin(currentPlayer)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameEnded = true;
                } else if (checkDraw()) {
                    System.out.println("The game is a draw.");
                    gameEnded = true;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scan.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Thanks for playing!");
        scan.close();
    }
}
