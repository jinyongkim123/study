import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int M = stdIn.nextInt();
        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = stdIn.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int count1 = 0;
                int count2 = 0;
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if ((k + l) % 2 == 0) {
                            if (board[k][l] != 'W') {
                                count1++;
                            } else {
                                count2++;
                            }
                        } else {
                            if (board[k][l] != 'B') {
                                count1++;
                            } else {
                                count2++;
                            }
                        }
                    }
                }
                minCount = Math.min(minCount, Math.min(count1, count2));
            }
        }
        System.out.println(minCount);

    }
}