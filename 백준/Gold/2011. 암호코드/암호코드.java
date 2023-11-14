import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] dp = new int[str.length() + 1];
        dp[0] = 1;

        for(int i =1; i<dp.length; i++){
            int one = str.charAt(i-1)-'0';
            if(one >= 1 && one<=9){
                dp[i] += dp[i-1];
                dp[i] %= 1000000;
            }

            if(i==1) continue;

            int two = str.charAt(i-2)-'0';
            if(two == 0) continue;

            int v = two*10 + one;
            if(v >= 10 && v <=26){
                dp[i] += dp[i-2];
                dp[i] %= 1000000;
            }
        }
        System.out.println(dp[str.length()]);
    }
}

