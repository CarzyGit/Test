package Work0719;

/**
 * @author wlkq
 * @date 2022-07-20 17:37
 */
public class W4 {

    static int[] dp=new int[255];
    public static void main(String[] args) {
        System.out.println(test(8));
    }


   static int test( int n){

        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=(dp[i-1]+2*dp[i-2])%100007;
        }

        return dp[n];
    }

}
