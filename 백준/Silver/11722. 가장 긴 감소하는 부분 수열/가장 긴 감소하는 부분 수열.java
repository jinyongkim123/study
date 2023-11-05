import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N];
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            dp[i] = 1;
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j] && dp[i] <= dp[j] + 1)
                    dp[i] = dp[j] + 1;
            }
        }

        int res = 0;

        for (int i = 0; i < N; i++) {
            if(dp[i]>res)
                res = dp[i];
        }

        System.out.println(res);
    }
}
