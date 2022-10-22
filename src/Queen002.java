public class Queen002 {

    /**
     * 计算是否可以放置 n 个皇后
     * @param board 棋盘
     * @param col 当前列
     * @return 是否可以放置 n 个皇后
     */
    // todo: 计算是否可以放置 n 个皇后
    public static boolean nQueen(int[][] board, int col) {
        int n = board.length;

        // 达成可行解的条件，col超过棋盘最大列数，递归终止
        if (col >= n) {
            return true;
        }

        for (int i = 0; i < n; i++) {

            // todo: 是否满足约束条件，皇后能不能放置在当前位置
            if () {
                // todo: 标记已放置皇后的格子

                // todo: 搜索下一个符合条件的格子
                if (nQueen()) {
                    return true;
                }

                // todo: 回溯，重置格子的占用状态

            }
        }

        return false;
        
    }

    public static void main(String[] args) {
        int queen = 4;
        int[][] board = new int[queen][queen];
        System.out.println(nQueen(board, 0));

        System.out.println();
        Queen000.printBoard(board, queen);
    }
}