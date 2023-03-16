import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {


    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        int t = stdIn.nextInt();

        for (int i = 0; i < t; i++) {
            int a = stdIn.nextInt();

            int[] prime = new int[a + 1];

            prime[1] = 1;

            for (int j = 2; j <= a; j++) {
                for (int k = 2; j * k <= a; k++) {
                    prime[j * k] = 1;
                }
            }

            int p = a / 2;
            int q = a / 2;

            while (true) {
                if (prime[p] == 0 && prime[q] == 0) {
                    System.out.print(p + " " + q + "\n");
                    break;
                }
                p--;
                q++;
            }
        }

    }
}



