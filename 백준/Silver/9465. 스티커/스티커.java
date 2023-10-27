import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i<t; i++){   //테스트 케이스
            int max = 0;
            int n = sc.nextInt();

            int[][] arr = new int[2][n+1];
            int[][] dp = new int[2][n+1];
            for(int h = 0; h<2; h++){
                for(int y = 1; y<=n; y++){
                    arr[h][y] = sc.nextInt();
                }
            }

            dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];

            for(int s = 2; s<=n; s++){
                dp[0][s] = Math.max(dp[1][s-1], dp[1][s-2])+arr[0][s];
                dp[1][s] = Math.max(dp[0][s-1], dp[0][s-2])+arr[1][s];
            }

            System.out.println(Math.max(dp[0][n],dp[1][n]));
        }
    }
}
