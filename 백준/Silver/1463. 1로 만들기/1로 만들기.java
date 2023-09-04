import java.util.Scanner;

public class Main {

    static Integer[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;

        System.out.print(recur(N));

    }

    static int recur(int N) {
        if (dp[N] == null) {
            //6으로 나눠진다면?
            if (N % 6 == 0) {
                dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
            }
            //3으로 나눠진다면?
            else if (N % 3 == 0) {
                dp[N] = Math.min(recur(N/3),recur(N-1))+1;
            }
            //2로 나눠진다면?
            else if (N % 2 == 0) {
                dp[N] = Math.min( recur(N/2),recur(N-1))+1;
            }
            //둘다 안 나눠진다면?
            else{
                dp[N] = recur(N - 1) + 1;
            }
        }
        return dp[N];
    }
}
