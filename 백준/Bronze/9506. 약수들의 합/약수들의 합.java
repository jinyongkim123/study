import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        while (true) {
            int res = 0;
            int n = stdIn.nextInt();

            if (n == -1) break;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    res += i;
                }
            }

            if (res == n) {
                System.out.print(n + " = 1");
                for (int i = 2; i < n; i++) {
                    if (n % i == 0)
                        System.out.print(" + " + i);
                }
                System.out.println();
            } else if (res != n)
                System.out.println(n + " is NOT perfect.");
        }
    }
}



