public class Fib001 {

    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }

        // todo: 使用简单分治，求第 n 个斐波那契数
        if(n<=2){
                return 1;
        }else {
            return fib(n-1)+fib(n-2);
        }
        
    }

    public static void main(String[] args) {
        System.out.println(fib(1) == 1);
        System.out.println(fib(2) == 1);
        System.out.println(fib(20) == 6765);
    }

}