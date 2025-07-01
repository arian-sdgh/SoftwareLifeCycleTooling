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
    void testCheckColumns_withWinningColumn_returnsTrue() {
        char[][] board = {
            {'O', 'X', ' '},
            {'O', 'X', ' '},
            {'O', ' ', ' '}
        };
        assertTrue(TicTacToe.checkColumns(board, 'O'));
    }

    @Test
    void testCheckColumns_withoutWinningColumn_returnsFalse() {
        char[][] board = {
            {'O', 'X', ' '},
            {'X', 'O', ' '},
            {'O', ' ', ' '}
        };
        assertFalse(TicTacToe.checkColumns(board, 'X'));
    }

    @Test
    void testCheckDiagonals_withWinningMainDiagonal_returnsTrue() {
        char[][] board = {
            {'X', 'O', ' '},
            {' ', 'X', 'O'},
            {' ', ' ', 'X'}
        };
        assertTrue(TicTacToe.checkDiagonals(board, 'X'));
    }

    @Test
    void testCheckDiagonals_withoutWinningDiagonal_returnsFalse() {
        char[][] board = {
            {'X', 'O', 'O'},
            {' ', 'O', 'X'},
            {'X', ' ', 'X'}
        };
        assertFalse(TicTacToe.checkDiagonals(board, 'X'));
    }


    @Test
    public void testNoWinner() {
        char[][] board = createBoard(new char[][]{
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'O', 'X', 'O'}
        });


     @Test     
    public void testSwitchPlayer_XtoO() {
        assertEquals('O', TicTacToe.switchPlayer('X'));
    }
     @Test
    public void testSwitchPlayer_OtoX() {
        assertEquals('X', TicTacToe.switchPlayer('O'));
    }


         @Test
      public void testIsBoardFull_fullBoard_returnsTrue() {
        char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
        };
        assertTrue(TicTacToe.isBoardFull(board));
    }
     @Test
   public void testIsBoardFull_notFull_returnsFalse() {
        char[][] board = {
            {'X', 'O', ' '},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
        };
        assertFalse(TicTacToe.isBoardFull(board));
    }

    @Test
    void testIsValidMove_validMove_returnsTrue() {
        char[][] board = {
            {'X', 'O', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        assertTrue(TicTacToe.isValidMove(board, 0, 2));
    }

    @Test
    void testIsValidMove_invalidMove_returnsFalse() {
        char[][] board = {
            {'X', 'O', 'X'},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        assertFalse(TicTacToe.isValidMove(board, 0, 2)); // Feld belegt
    }    
    @Test
    void testCheckRows_withWinningRow_returnsTrue() {
        char[][] board = {
            {'X', 'X', 'X'},
            {' ', 'O', ' '},
            {'O', ' ', ' '}
        };
        assertTrue(TicTacToe.checkRows(board, 'X'));
    }

    @Test
    void testCheckRows_withoutWinningRow_returnsFalse() {
        char[][] board = {
            {'X', 'O', 'X'},
            {' ', 'O', ' '},
            {'O', ' ', ' '}
        };
        assertFalse(TicTacToe.checkRows(board, 'X'));
    }    

    // checkWin
    @Test
    void testCheckWin_winInRow_returnsTrue() {
        char[][] board = {
            {'X', 'X', 'X'},
            {'O', ' ', 'O'},
            {' ', ' ', ' '}
        };
        assertTrue(TicTacToe.checkWin(board, 'X'));
    }

    @Test
    void testCheckWin_noWin_returnsFalse() {
        char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
        };
        assertFalse(TicTacToe.checkWin(board, 'O'));
    }    

      main
        // Nutze assertAll, um alle Assertions in einer Methode zu gruppieren
        assertAll("Check no winner",
                () -> assertFalse(TicTacToe.checkWin(board, 'X'), "Player X should not win"),
                () -> assertFalse(TicTacToe.checkWin(board, 'O'), "Player O should not win")
        );
    }
}
