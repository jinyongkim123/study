import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[] dp = new long[N + 1];

        dp[0] = 0; 
        dp[1] = 1; 

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[N]);

    }
}

/* n = 1?
 * 1
 * n = 2
 * 10
 * n=3
 * 100, 101
 * n=4
 * 1000, 1001, 1010
 * n=5
 * 10000, 10001, 10010, 10101, 10100
 * */