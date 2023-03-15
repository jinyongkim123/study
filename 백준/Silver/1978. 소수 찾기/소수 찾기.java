import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        int cnt = 0;
        int N = stdIn.nextInt();
        for (int i = 0; i < N; i++) {
            int M = stdIn.nextInt();

            if (M == 0 && M == 1)
                break;

            for (int j = 2; j <= M; j++) {
                if (j==M){
                    cnt++;
                }
                if(M%j==0)
                    break;
            }
        }

        System.out.print(cnt);
    }
}



