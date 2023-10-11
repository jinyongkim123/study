import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[][] dp = new long[num + 1][10]; // [자릿수][자릿값];
        long mod = 1000000000;

        for(int i = 1; i<10; i++){      //첫번째 자릿수는 경우의 수 1개밖에 없음
            dp[1][i] = 1;
        }

        for(int i = 2; i<=num; i++){

            for(int j = 0; j<10; j++){

                if(j == 0){
                    dp[i][0] = dp[i-1][1]%mod;
                } else if (j==9) {
                    dp[i][9] = dp[i-1][8]%mod;
                }else{
                    dp[i][j] = (dp[i-1][j-1]+dp[i-1][j+1])%mod;
                }
            }
        }

        long result = 0;

        for(int i = 0; i<10; i++){
            result += dp[num][i];
        }

        System.out.println(result%mod);




    }
}
