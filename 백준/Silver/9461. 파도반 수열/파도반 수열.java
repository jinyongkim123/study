import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] dp = new long[101];

        for(int i =0 ; i<T; i++){
            int N = sc.nextInt();

            dp[0]=1;
            dp[1]=1;
            dp[2]=1;

            for(int j = 3; j<101; j++){
                dp[j] = dp[j-3]+dp[j-2];
            }

            System.out.println(dp[N-1]);
        }
    }
}

