import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] dp = new int[num + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[0][i] = 1;
        }

        for(int i = 1; i<=num; i++){
            for(int j = 0; j<=9; j++){
                for(int k = j; k<=9; k++){
                    dp[i][j] += dp[i-1][k]%10007;
                }
            }
        }
        System.out.println(dp[num][0] % 10007);
    }
}

/*
*   num == 2라면?
*   오르막 수가 되려면은
*   1) 첫 부분이 0인 경우
*       0123456789 ----- 10가지
*   2) 첫 부분이 1인 경우
*       123456789 ----- 9가지
* ---------- 8가지 7가지 6...5...4...3...2... 1부터 10가지 합의 총 갯수는? 55
*
*   num == 3이라면?
*   오르막 수가 되려면
*   1) 00인 경우 셋째 자리는
*        0123456789 10가지 가능
*        --그러면 일단 55가지로 가능
*   2) 01인 경우면? 셋째 자리는
*       123456789까지 가능  그러면 그대로 쭉 가면 45가지*/