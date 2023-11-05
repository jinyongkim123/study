import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N+1];
        int[] arr = new int[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }
        dp[1] = arr[1];

        int result = dp[1];
        for (int i = 2; i <= N; i++) {
            dp[i] = arr[i];
            for (int j = 1; j < i; j++) {
                if(arr[i] > arr[j])
                    dp[i] = Math.max(dp[i], dp[j] + arr[i]);
            }
            result = Math.max(result, dp[i]);

        }

        System.out.println(result);
    }
}
