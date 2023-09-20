import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int max = 0;

        int n = sc.nextInt();

        int[] seq = new int[n];

        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            seq[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (seq[i] > seq[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
            if (max < dp[i]) {
                max = dp[i];
            }
        }

        int[] lis = new int[max]; // 가장 긴 부분 수열을 저장할 배열
        int lisIndex = max - 1; // lis 배열의 인덱스

        // 역추적을 통해 가장 긴 부분 수열을 구성
        for (int i = n - 1; i >= 0; i--) {
            if (dp[i] == max) {
                lis[lisIndex] = seq[i];
                lisIndex--;
                max--;
            }
        }

        for (int i = 0; i < lis.length; i++) {
            sb.append(lis[i] + " ");
        }

        System.out.println(lis.length);
        System.out.println(sb);
    }
}
