import java.util.ArrayList;
import java.util.List;

public class Num003 {

    // todo: 使用动态规划，得到第 n 个丑数

            public static int getUglyNum(int index){
                if(index <= 0){
                    return 0;
                }
                List<Integer> list = new ArrayList<>();
                list.add(1);
                int m2 = 0, m3 = 0, m5 = 0, i2 = 0, i3 = 0, i5 = 0, min = 0;
                while(list.size() < index){
                    m2 = list.get(i2) * 2;
                    m3 = list.get(i3) * 3;
                    m5 = list.get(i5) * 5;
                    min = Math.min(m2, Math.min(m3, m5));
                    list.add(min);
                    if(min == m2){
                        ++i2;
                    }
                    if(min == m3){
                        ++i3;
                    }
                    if(min == m5){
                        ++i5;
                    }
                }
                return list.get(index-1);
            }






    public static void main(String[] args) {
        System.out.println(getUglyNum(1) == 1);
        System.out.println(getUglyNum(2) == 2);
        System.out.println(getUglyNum(8) == 9);
        System.out.println(getUglyNum(11) == 15);
        System.out.println(getUglyNum(150) == 5832);
    }
}