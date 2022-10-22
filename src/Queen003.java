import java.util.ArrayList;
import java.util.List;

public class Queen003 {

    /**
     * 放置 n 个皇后的所有方案
     * solution = <1, 0, 3, 2>
     */
    public static List<int[]> solutions = new ArrayList<>();

    /**
     * 放置 n 个皇后，并得到所有可能的放置方案
     * @param board 棋盘
     * @param col 当前列
     */
    // todo: 放置 n 个皇后，并得到所有可能的放置方案
    public static void nQueen(int[][] board, int col, int[] solution) {


    }

    public static void main(String[] args) {
        int queen = 4;
        int[][] board = new int[queen][queen];
        nQueen(board, 0, new int[queen]);
        System.out.println(solutions.size() == 2);

        for (int[] s : solutions) {
            int[][] b = new int[queen][queen];
            for (int i = 0; i < s.length; i++) {
                b[i][s[i]] = 1;
            }
            Queen000.printBoard(b, b.length);
            System.out.println();
        }
    }
}