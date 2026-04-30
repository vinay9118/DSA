public class Soduku_Solve2{

    public static void printSolution(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char[][] board, int row, int col, char number) {
        for (int i = 0; i < board.length; i++) {
            // Check row and column
            if (board[i][col] == number) return false;
            if (board[row][i] == number) return false;
        }

        // Check 3x3 Grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == number) return false;
            }
        }
        return true;
    }

    public static boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }

        int nextRow = (col == board.length - 1) ? row + 1 : row;
        int nextCol = (col == board.length - 1) ? 0 : col + 1;

        // In char arrays, we usually use '.' or '0' for empty spaces
        if (board[row][col] != '.') {
            return helper(board, nextRow, nextCol);
        }

        for (int i = 1; i <= 9; i++) {
            char numChar = (char)(i + '0'); // Converts int 1 to char '1'
            if (isSafe(board, row, col, numChar)) {
                board[row][col] = numChar;
                if (helper(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = '.'; // Backtrack
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example with '.' representing empty cells
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        if (helper(board, 0, 0)) {
            printSolution(board);
        } else {
            System.out.println("No solution.");
        }
    }
}