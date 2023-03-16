import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {


    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();

        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                N /= i;
                System.out.println(i);

            }
        }


    }
}



