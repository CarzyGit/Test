public class Num001 {

    // todo: 检测一个数是否符合丑数的规则
    public static boolean isUglyNum(int num) {


                while(num % 2 == 0){
                    num /= 2;
                }
                while(num % 3 == 0){
                    num /= 3;
                }
                while(num % 5 == 0){
                    num /= 5;
                }
                return (num == 1) ? true : false;
            }


    public static int getUglyNumber(int index){
        if(index < 0){
            return -1;
        }
        int number = 0;
        int count = 0;
        while(count < index){
            ++number;
            if(isUglyNum(number)){
                ++count;
            }
        }
        return number;
    }



    public static void main(String[] args) {
        System.out.println(isUglyNum(1));
        System.out.println(isUglyNum(2));
        System.out.println(isUglyNum(8));
        System.out.println(isUglyNum(12));
        System.out.println(!isUglyNum(7));
    }
}