import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wine = sc.nextInt();
        int[] dp = new int[wine + 1];
        int[] arr = new int[wine + 1];

        for (int i = 1; i <= wine; i++) {
            arr[i] = sc.nextInt();
        }

        dp[1] = arr[1]; //dp[1] 배열에 arr[1]배열 복사
        if (wine > 1) {     //와인잔이 1잔 이상이라면?
            dp[2] = arr[1] + arr[2];
        }
        for (int i = 3; i <= wine; i++) { //i-1까지 최대값 나온 것과 다른 두가지 경우에
                                        // (현재i로부터 한칸 떨어진 i-2까지 최대값 + 현재i값,
                                        //현재i+(i-1)+(i-1와 한칸 떨어져있는 i-3까지의 최대값))에서 더 큰 값과 비교해서 가장 큰 값을 지정한다.
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));
        }
        System.out.println(dp[wine]);

    }
}
