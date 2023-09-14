import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[][] dp = new long[100001][4];
        dp[1][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int i = 4; i <= 100000; i++) {
            dp[i][1] = dp[i - 1][2] + dp[i - 1][3] % 1000000009;
            dp[i][2] = dp[i - 2][1] + dp[i - 2][3] % 1000000009;
            dp[i][3] = dp[i - 3][1] + dp[i - 3][2] % 1000000009;
        }

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            long res = (dp[num][1] + dp[num][2] + dp[num][3]) % 1000000009;
            System.out.println(res);
        }

    }
}

