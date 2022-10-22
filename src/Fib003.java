public class Fib003 {

    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }

        // todo: 使用迭代的动态规划，求第 n 个斐波那契数
        if (n<=2){
            return 1;
        }

        int ans=0;
        int q1=1;
        int q2=1;

        for (int i = 0; i <n-2; i++) {
            ans=q1+q2;
            q1=q2;
            q2=ans;

        }

        return ans;

        
    }

    public static void main(String[] args) {
        System.out.println(fib(1) == 1);
        System.out.println(fib(2) == 1);
        System.out.println(fib(20) == 6765);
    }

}