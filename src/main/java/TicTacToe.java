import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char currentPlayer = 'X';
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printBoard(board);
            System.out.println("Spieler " + currentPlayer + " ist dran.");
            System.out.print("Gib Zeile (1-3): ");
            int row = scanner.nextInt() - 1;
            System.out.print("Gib Spalte (1-3): ");
            int col = scanner.nextInt() - 1;

            if (isValidMove(board, row, col)) {
                board[row][col] = currentPlayer;
            } else {
                System.out.println("Feld ist schon belegt. Nochmal versuchen.");
                continue;
            }

            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println("Spieler " + currentPlayer + " hat gewonnen!");
                break;
            }

            if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("Unentschieden!");
                break;
            }

            currentPlayer = switchPlayer(currentPlayer);
        }

        scanner.close();
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    public static boolean checkWin(char[][] board, char currentPlayer) {
    return checkRows(board, currentPlayer) ||
           checkColumns(board, currentPlayer) ||
           checkDiagonals(board, currentPlayer);
}

public static boolean checkRows(char[][] board, char currentPlayer) {
    for (int i = 0; i < 3; i++) {
        if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
            return true;
        }
    }
    return false;
}

public static boolean checkColumns(char[][] board, char currentPlayer) {
    for (int i = 0; i < 3; i++) {
        if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
            return true;
        }
    }
    return false;
}

public static boolean checkDiagonals(char[][] board, char currentPlayer) {
    // Hauptdiagonale
    if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
        return true;
    }
    // Antidiagonale
    if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
        return true;
    }
    return false;
}

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static char switchPlayer(char currentPlayer) {
        return (currentPlayer == 'X') ? 'O' : 'X';
    }
}
