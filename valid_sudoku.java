// 36. Valid Sudoku
// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
// Note:

// A Sudoku board (partially filled) could be valid but is not necessarily solvable.
// Only the filled cells need to be validated according to the mentioned rules.

class valid_sudoku {
    public boolean isValidSudoku(char[][] board) {
        // no repeat in row
        // no repeat in column
        // no repeat across 1-3:1-3, 1-3:4-6, 1-3:7-9, 4-6:1-3, etc - 9 boxes
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int box_idx = (i/3) * 3 + (j/3);
                    if (rows[i][num] || cols[j][num] || boxes[box_idx][num]) {
                        return false;
                    }
                    rows[i][num] = cols[j][num] = boxes[box_idx][num] = true;
                }
            }
        }
        return true;
    }
}