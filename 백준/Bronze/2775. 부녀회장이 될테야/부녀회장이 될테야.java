import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int k = 0, n = 0;
        int t = stdIn.nextInt();
        for (int i = 0; i < t; i++) {
            int[][] ary = new int[15][15];

            for (int a = 0; a < 15; a++) {
                ary[a][1] = 1;
                ary[0][a] = a;
            }

            for (int floor = 1; floor < 15; floor++) {
                for (int room = 2; room < 15; room++) {
                    ary[floor][room] = ary[floor][room - 1] + ary[floor - 1][room];
                }
            }

            k = stdIn.nextInt();
            n = stdIn.nextInt();
            System.out.println(ary[k][n]);


        }

    }
}