

import java.util.Arrays;

public class Color001 {

    /**
     * 检查是否可以着色
     * @param graph 图
     * @param n 顶点数
     * @param solution 着色方案
     * @param idx 当前顶点下标
     * @param color 要涂的颜色
     * @return 是否可以着色
     */
    public static boolean isValid(int[][] graph, int n, int[] solution, int idx, int color) {


        for (int i = 0; i < idx; i++) {
            if (graph[idx][i]==1&&solution[i]==color){
                    return false;
            }
        }
        return true;
    }

    /**
     * 找到一个着色方案
     * @param graph 图
     * @param n 顶点数
     * @param m 颜色种类
     * @param solution 着色方案
     * @param idx 当前顶点下标
     * @return 是否找到方案
     */
    public static boolean coloring(int[][] graph, int n, int m, int[] solution, int idx) {

        // 遍历颜色种类
        for (int color = 1; color <= m; color++) {

            

        }

        return false;
    }

    public static void main(String[] args) {

        int[][] graph = {
                {0, 1, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 0, 0, 7},
                {0, 1, 0, 1, 0, 0, 1},
                {0, 0, 1, 0, 1, 1, 0},
                {0, 0, 0, 1, 0, 1, 0},
                {1, 0, 0, 1, 1, 0, 1},
                {1, 1, 1, 0, 0, 1, 0},
        };
        int n = graph.length;
        int m = 3;
        int[] solution = new int[n];

        boolean solved = coloring(graph, n, m, solution, 0);
        if (!solved) {
            System.out.println("not exist");
        } else {
            System.out.println(Arrays.toString(solution));
        }

    }

}
