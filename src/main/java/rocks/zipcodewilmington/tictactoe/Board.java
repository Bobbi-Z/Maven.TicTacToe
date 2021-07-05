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
        char inFavorOfEmpty = ' ';

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
        int counterX = 0;
        int counterO = 0;
        int counterEmpty = 0;
        char inFavorOfX = 'X';
        char inFavorOfO = 'O';
        char inFavorOfEmpty = ' ';
        if (matrix[0][0] == matrix [0][1] && matrix[0][1] == matrix[0][2]) { //row 1 win
                if (matrix[0][0].charValue() == inFavorOfX){
                    counterX += 1;
                } else if (matrix[0][0].charValue() == inFavorOfO){
                    counterO += 1;
                } else { counterEmpty += 1;
                }
            }else if (matrix[1][0] == matrix [1][1] && matrix[1][1] == matrix[1][2]) { //row 2 win
            if (matrix[1][0].charValue() == inFavorOfX) {
                counterX += 1;
            } else if (matrix[1][0].charValue() == inFavorOfO) {
                counterO += 1;
            } else {
                counterEmpty += 1;
            }
        }else if (matrix[2][0] == matrix [2][1] && matrix[2][1] == matrix[2][2]) { //row 3 win
            if (matrix[2][0].charValue() == inFavorOfX) {
                counterX += 1;
            } else if (matrix[2][0].charValue() == inFavorOfO) {
                counterO += 1;
            } else {
                counterEmpty += 1;
            }
        }else if (matrix[0][0] == matrix [1][0] && matrix[1][0] == matrix[2][0]) { //column 1 win
            if (matrix[0][0].charValue() == inFavorOfX) {
                counterX += 1;
            } else if (matrix[0][0].charValue() == inFavorOfO) {
                counterO += 1;
            } else {
                counterEmpty += 1;
            }
        }else if (matrix[0][1] == matrix [1][1] && matrix[1][1] == matrix[2][1]) { //column 2 win
            if (matrix[0][1].charValue() == inFavorOfX) {
                counterX += 1;
            } else if (matrix[0][1].charValue() == inFavorOfO) {
                counterO += 1;
            } else {
                counterEmpty += 1;
            }
        }else if (matrix[0][2] == matrix [1][2] && matrix[1][2] == matrix[2][2]) { //column 3 win
            if (matrix[0][2].charValue() == inFavorOfX) {
                counterX += 1;
            } else if (matrix[0][2].charValue() == inFavorOfO) {
                counterO += 1;
            } else {
                counterEmpty += 1;
            }
        }else if (matrix[0][0] == matrix [1][1] && matrix[1][1] == matrix[2][2]) { //diagonal top to bottom win
            if (matrix[0][0].charValue() == inFavorOfX) {
                counterX += 1;
            } else if (matrix[0][0].charValue() == inFavorOfO) {
                counterO += 1;
            } else {
                counterEmpty += 1;
            }
        }else if (matrix[2][0] == matrix [1][1] && matrix[1][1] == matrix[0][2]) { //diagonal bottom to top win
            if (matrix[2][0].charValue() == inFavorOfX) {
                counterX += 1;
            } else if (matrix[2][0].charValue() == inFavorOfO) {
                counterO += 1;
            } else {
                counterEmpty += 1;
            }
        }else{
        }
       if (counterX > counterO){
           return String.valueOf(inFavorOfX);
       }else if ( counterO > counterX){
           return String.valueOf(inFavorOfO);
       }else {
           return String.valueOf(inFavorOfEmpty);
       }
    }

}
