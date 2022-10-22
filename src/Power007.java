/**
 * @author wlkq
 * @date 2022-07-16 14:09
 */

 public class Power007 {

        public static void matrixJoin(int[][] child, int[][] parent, int rowStart, int colStart) {

            int rows = child.length;
            int cols = child[0].length;

            // todo: 得到双亲矩阵对应位置的元素
            for (int row = 0, parentRow = rowStart; row < rows; row++, parentRow++) {
                for (int col = 0,parentCol=colStart; col < cols; parentCol++,col++) {
                    parent[parentRow][parentCol]=child[row][col];
                    
                }



            }

        }

        public static void main(String[] args) {
            int[][] child = new int[][] {{1, -2}, {5, 0}};
            int[][] parentExpect = new int[][] {{0, 0, 0}, {0, 1, -2}, {0, 5, 0}};

            int[][] result = new int[3][3];
            matrixJoin(child, result, 1, 1);

            System.out.println(result[0][0] == parentExpect[0][0]);
            System.out.println(result[1][1] == parentExpect[1][1]);
            System.out.println(result[2][1] == parentExpect[2][1]);
        }

    }

