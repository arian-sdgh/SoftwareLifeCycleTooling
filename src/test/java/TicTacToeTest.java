import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class TicTacToeTest {

    @Test
    public void testPlayerXWinsRow() {
        char[][] board = {
                {'X', 'X', 'X'},
                {' ', 'O', ' '},
                {'O', ' ', ' '}
        };
        assertTrue(TicTacToe.checkWin(board, 'X'));
    }

    @Test
    public void testPlayerOWinsDiagonal() {
        char[][] board = {
                {'O', 'X', ' '},
                {' ', 'O', 'X'},
                {' ', ' ', 'O'}
        };
        assertTrue(TicTacToe.checkWin(board, 'O'));
    }

    @Test
    public void testNoWinner() {
        char[][] board = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'O', 'X', 'O'}
        };
        assertFalse(TicTacToe.checkWin(board, 'X'));
        assertFalse(TicTacToe.checkWin(board, 'O'));
    }
}