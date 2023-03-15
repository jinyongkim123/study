import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {


    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        boolean[] prime = new boolean[10001];

        prime[1] = true;

        int total = 0;
        int min = -1;

        int M = stdIn.nextInt();
        int N = stdIn.nextInt();

        for (int i = 2; i <= N; i++) {
            for (int j = 2; i * j <= N; j++) {
                prime[i * j] = true;
            }
        }

        for (int i = M; i <= N; i++) {
            if (!prime[i]) {
                total += i;
                if(min == -1){
                    min = i;
                }
            }
        }

        if(total == 0)
            System.out.println(-1);
        else{
            System.out.println(total);
            System.out.println(min);
        }
    }
}



