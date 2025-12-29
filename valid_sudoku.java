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