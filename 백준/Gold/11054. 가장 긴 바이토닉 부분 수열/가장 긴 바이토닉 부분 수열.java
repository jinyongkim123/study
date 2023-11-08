import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp1 = new int[N];
        int[] dp2 = new int[N];
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            dp1[i] = 1;
            dp2[i] = 1;
        }
        //왼쪽에서부터 i까지 증가하는 수열
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp1[i] <= dp1[j] + 1) {
                    dp1[i] = dp1[j] + 1;
                }
            }
        }
        //오른쪽으로부터  i까지 증가하는 수열
        for (int i = N - 1; i >= 0; i--) {
            for (int j = N-1 ; j > i; j--) {
                if (arr[i] > arr[j] && dp2[i] <= dp2[j] + 1) {
                    dp2[i] = dp2[j] + 1;
                }
            }
        }


        int result = 0;
        for (int i = 0; i < N; i++) {
            result = Math.max(dp1[i]+dp2[i]-1, result);
        }
        System.out.println(result);
    }
}
