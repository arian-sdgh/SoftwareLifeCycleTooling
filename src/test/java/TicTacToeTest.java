import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class TicTacToeTest {

    // Hilfsmethode, um ein Test-Board zu erstellen
    private char[][] createBoard(char[][] boardConfig) {
        return boardConfig;
    }

    @Test
    public void testPlayerXWinsRow() {
        char[][] board = createBoard(new char[][]{
                {'X', 'X', 'X'},
                {' ', 'O', ' '},
                {'O', ' ', ' '}
        });
        assertTrue(TicTacToe.checkWin(board, 'X'), "Player X should win the row");
    }

    @Test
    public void testPlayerOWinsDiagonal() {
        char[][] board = createBoard(new char[][]{
                {'O', 'X', ' '},
                {' ', 'O', 'X'},
                {' ', ' ', 'O'}
        });
        assertTrue(TicTacToe.checkWin(board, 'O'), "Player O should win the diagonal");
    }

    @Test
    public void testNoWinner() {
        char[][] board = createBoard(new char[][]{
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'O', 'X', 'O'}
        });

    public void testSwitchPlayer_XtoO() {
        assertEquals('O', TicTacToe.switchPlayer('X'));
    }
    public void testSwitchPlayer_OtoX() {
        assertEquals('X', TicTacToe.switchPlayer('O'));
    }

        // Nutze assertAll, um alle Assertions in einer Methode zu gruppieren
        assertAll("Check no winner",
                () -> assertFalse(TicTacToe.checkWin(board, 'X'), "Player X should not win"),
                () -> assertFalse(TicTacToe.checkWin(board, 'O'), "Player O should not win")
        );
    }
}
