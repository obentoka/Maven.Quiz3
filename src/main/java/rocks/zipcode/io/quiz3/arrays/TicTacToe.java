package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        board = new String[0][0];
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[board.length];
        for (int i = 0; i < column.length; i++) {
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        for (int i = 1; i < row.length; i++) {
            if(!row[i].equals(row[i-1]))
                return false;
        }
        return true;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        for (int i = 1; i < column.length; i++) {
            if(!column[i].equals(column[i-1]))
                return false;
        }
        return true;
    }

    public String getWinner() {
        for (int i = 0; i < board.length; i++) {
            if(isRowHomogenous(i)){
                return board[i][i];
            }
            if(isColumnHomogeneous(i)){
                return board[i][i];
            }
        }
        if(board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]))
            return board[0][0];
        if(board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]))
            return board[0][2];
        return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
