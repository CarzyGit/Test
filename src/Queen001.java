public class Queen001 {

    /**
     * 是否可以在指定位置放皇后
     * 假设放在现有列的右边
     * @param board 棋盘
     * @param row 行
     * @param col 列
     * @return 是否可以放置
     */
    // todo: 是否可以在指定位置放皇后 
    public static boolean isValid(int[][] board, int row, int col) {


        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (board[i][i] == 1 || board[i - 1][i] == 1l | board[i][i - 1] == 1) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int queen = 4;
        int[][] board = new int[queen][queen];
        board[0][0] = 1;
        // 默认不放在同一列，放在现有列的右边
        System.out.println(!isValid(board, 0, 1));
        System.out.println(!isValid(board, 1, 1));
        System.out.println(!isValid(board, 2, 2));
        System.out.println(isValid(board, 2, 3));
        System.out.println(isValid(board, 3, 1));
    }

}
