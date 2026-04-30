
// public class Soduku_Solve {

//     public static void printSolution(int[][] board) {

//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println(" ");
//         }
//     }

//     public static boolean isSafe(int[][] board, int row, int col, int number) {
//         //row&column
//         for (int i = 0; i < board.length; i++) {
//             if (board[i][col] == number + 0) {
//                 return false;
//             }
//             if (board[row][i] == number + 0) {
//                 return false;
//             }
//         }

//         //grid
//         int sr = (row / 3) * 3;
//         int sc = (col / 3) * 3;

//         for (int i = sr; i < sr + 3; i++) {
//             for (int j = sc; j < sc + 3; j++) {
//                 if (board[i][j] == number + 0) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

//     public static boolean helper(int[][] board, int row, int col) {
//         if (row == board.length) {
//             printSolution(board);
//             return true;
//         }
//         int newrow = 0;
//         int newcol = 0;
//         if (col != board.length - 1) {
//             newrow = row;
//             newcol = col + 1;
//         } else {
//             newcol = col;
//             newrow = row + 1;
//         }
//         if (board[row][col] != 0) {
//             if (helper(board, newrow, newcol)) {
//                 return true;
//             } else {
//                 for (int i = 1; i <= 9; i++) {
//                     if (isSafe(board, row, col, i)) {
//                         board[row][col] = i + 0;
//                         if (helper(board, newrow, newcol)) {
//                             return true;
//                         } else {
//                             board[row][col] = 0;
//                         }
//                     }
//                 }
//             }
//         }
//         return false;
//     }

//     public static void solveSoduko(int[][] board) {
//         helper(board, 0, 0);
//         printSolution(board);
//         System.out.println("After Solve");
//     }

//     public static void main(String[] args) {
//         int[][] board = {
//             {5, 3, 0, 0, 7, 0, 0, 0, 0},
//             {6, 0, 0, 1, 9, 5, 0, 0, 0},
//             {0, 9, 8, 0, 0, 0, 0, 6, 0},
//             {8, 0, 0, 0, 6, 0, 0, 0, 3},
//             {4, 0, 0, 8, 0, 3, 0, 0, 1},
//             {7, 0, 0, 0, 2, 0, 0, 0, 6},
//             {0, 6, 0, 0, 0, 0, 2, 8, 0},
//             {0, 0, 0, 4, 1, 9, 0, 0, 5},
//             {0, 0, 0, 0, 8, 0, 0, 7, 9}
//         };
//         solveSoduko(board);
//     }
// }


public class Soduku_Solve {

    public static void printSolution(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] board, int row, int col, int number) {
        // Check row and column
        for (int i = 0; i < board.length; i++) {
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

    public static boolean helper(int[][] board, int row, int col) {
        // Base Case: If we've reached the end of the board
        if (row == board.length) {
            return true;
        }

        // Calculate next cell coordinates
        int nextRow = (col == board.length - 1) ? row + 1 : row;
        int nextCol = (col == board.length - 1) ? 0 : col + 1;

        // If current cell is already filled, move to next
        if (board[row][col] != 0) {
            return helper(board, nextRow, nextCol);
        }

        // Try placing numbers 1-9
        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, i)) {
                board[row][col] = i;
                if (helper(board, nextRow, nextCol)) {
                    return true;
                }
                // Backtrack
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static void solveSoduko(int[][] board) {
        if (helper(board, 0, 0)) {
            System.out.println("--- Solution Found ---");
            printSolution(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        solveSoduko(board);
    }
}