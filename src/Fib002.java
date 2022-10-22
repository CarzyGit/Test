import java.util.HashMap;
import java.util.Map;

public class Fib002 {

    public static Map<Integer, Integer> cache = new HashMap<>();

    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }

        // todo: 使用递归的动态规划，求第 n 个斐波那契数
        if (n<=2){
            return 1;
        }

        if (!cache.containsKey(n)) {
            cache.put(n, fib(n - 1) + fib(n - 2));
        }
        return cache.get(n);

    }

    public static void main(String[] args) {
        System.out.println(fib(1) == 1);
        System.out.println(fib(2) == 1);
        System.out.println(fib(20) == 6765);
    }

}