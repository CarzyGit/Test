/**
 * @author wlkq
 * @date 2022-07-15 19:26
 */
public class Test4 {


        public static int power(int a, int exp) {
            if (exp == 0) {
                return 1;
            }
            if (exp == 1) {
                return a;
            }

            int power;
            int m = 0;
            if (exp % 2 == 0) {
               power = power(a, exp / 2);
            } else {
                // todo: 如果指数是奇数
                power=power(a,(exp-1)/2);
                m=power*power*a;
                
            }
            return m;
        }

        public static void main(String[] args) {
            System.out.println(power(2, 0) == 1);
            System.out.println(power(2, 4) == 16);
            System.out.println(power(2, 5) == 32);
        }
    }

