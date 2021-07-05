package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;

    }
    public Boolean isInFavorOfX() {
        int counterX = 0;
        int counterO = 0;
        int counterEmpty = 0;
        char inFavorOfX = 'X';
        char inFavorOfO = 'O';

        // [row][column]
        for (int indexRow = 0; indexRow < matrix.length; indexRow++) {
            for (int indexColumn = 0; indexColumn < matrix[0].length; indexColumn++) {
                if (matrix[indexRow][indexColumn] == inFavorOfX) {
                    counterX += 1;
                } else if (matrix[indexRow][indexColumn] == inFavorOfO) {
                    counterO += 1;
                } else {
                    counterEmpty += 1;
                }
            }

        }
        if (counterX > counterO && counterEmpty > 0) {
            return true;
        } else if (counterX > counterO && counterEmpty == 0) {
            return false;
        } else {
            return false;
        }
    }


    public Boolean isInFavorOfO() {
        int counterX = 0;
        int counterO = 0;
        int counterEmpty = 0;
        char inFavorOfX = 'X';
        char inFavorOfO = 'O';

        // [row][column]
        for (int indexRow = 0; indexRow < matrix.length; indexRow++) {
            for (int indexColumn = 0; indexColumn < matrix[0].length; indexColumn++) {
                if (matrix[indexRow][indexColumn] == inFavorOfX) {
                    counterX += 1;
                } else if (matrix[indexRow][indexColumn] == inFavorOfO) {
                    counterO += 1;
                } else {
                    counterEmpty += 1;
                }
            }

        }
        if (counterO > counterX && counterEmpty > 0) {
            return true;
        } else if (counterO > counterX && counterEmpty == 0) {
            return false;
        } else {
            return false;
        }
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
