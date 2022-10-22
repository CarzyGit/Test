public class Maze001 {

    /**
     * 检查约束条件
     * @param maze 迷宫
     * @param x 当前 x 坐标
     * @param y 当前 y 坐标
     * @param n 最大 x 坐标
     * @param m 最大 y 坐标
     * @return 是否满足约束条件
     */
    // todo: 检查约束条件
    public static boolean isValid(int[][] maze, int x, int y, int n, int m) {

if (x==n&&y==m){
    return true;
}

if (x>n||y>m) {
    return false;
}

if (x>=0&&y>=0&&x<n&&y<m)



}
    }

    /**
     * 检查迷宫是否存在可行路线
     * @param maze 迷宫
     * @param x 当前 x 坐标
     * @param y 当前 y 坐标
     * @param n 最大 x 坐标
     * @param m 最大 y 坐标
     * @return 是否存在可行路线
     */

// todo: 检查迷宫是否存在可行路线
            public static boolean solveMaze(int[][] maze, int x, int y, int n, int m) {
                if(x == n - 1 && y == m - 1){
                    return true ;
                }
                if(isValid(maze , x , y , n , m)){
                    return true ;
                }
                int[] xMove = {1 , -1 , 0 ,0};
                int[] yMove = {0 , 0 , 1 ,-1};
                for(int i = 0 ; i < xMove.length ; i ++) {
                    int nextX = x + xMove[i];
                    int nextY = y + yMove[i];
                    if (isValid(maze, nextX, nextY, n, m)) {
                        maze[nextX][nextY] = -1;
                        if (soLveMaze(maze, nextX, nextY, n, m)) {
                            return true;
                        } else {
                            maze[nextX][nextY] = 0;
                        }
                    }
                }

                return false ;
        
    }

    private static boolean isVaLid(int[][] maze, int x, int y, int n, int m) {
    }

    public static void main(String[] args) {
        int[][] maze = {
                {0, 0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 1, 1, 0, 1},
                {0, 1, 1, 1, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 1},
                {0, 1, 1, 1, 1, 0, 0, 1},
                {1, 1, 0, 0, 0, 1, 0, 1},
                {1, 1, 0, 0, 0, 0, 0, 0}
        };

        int n = maze.length;
        int m = maze[0].length;

        boolean solved = solveMaze(maze, 0, 0, n, m);
        System.out.println(solved);
    }
}

    private static boolean soLveMaze(int[][] maze, int nextX, int nextY, int n, int m) {
    }