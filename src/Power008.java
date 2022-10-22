public class Power008 {

    public static int[][] matrixAdd(int[][] m1, int[][] m2) {

        int rows = m1.length;
        int cols = m1[0].length;
        int[][] result = new int[rows][cols];

        // todo: 两个矩阵对应位置的元素的和
        

        return result;

    }

    public static int[][] matrixSub(int[][] m1, int[][] m2) {
        // todo: 两个矩阵对应位置的元素的差
        int cols=m1[0].length;
        int rows=m1.length;

        int [][]result=new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                result[row][col]=m1[row][col]-m2[row][col];
                
            }
            
        }





        return result;

    }

    public static void main(String[] args) {
        int[][] matrix1 = new int[][] {{2, 3, -1}, {6, 1, -2}};
        int[][] matrix2 = new int[][] {{4, -5, 1}, {-3, 0, 2}};

        int[][] sum = matrixAdd(matrix1, matrix2);

        System.out.println("sum results:");
        System.out.println(sum[0][0] == 6);
        System.out.println(sum[1][0] == 3);
        System.out.println(sum[1][1] == 1);

        
        int[][] sub = matrixSub(matrix1, matrix2);

        System.out.println("sub results:");
        System.out.println(sub[0][0] == -2);
        System.out.println(sub[1][0] == 9);
        System.out.println(sub[1][1] == 1);

    }

}