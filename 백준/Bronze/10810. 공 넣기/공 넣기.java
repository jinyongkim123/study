import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();


        int[] basket = new int[N + 1];

        for (int a = 0; a < M; a++) {
            int i = stdIn.nextInt();
            int j = stdIn.nextInt();
            int k = stdIn.nextInt();

            for (int b = i; b <= j; b++) {
                basket[b] = k;
            }
        }

        for(int i=1; i<basket.length; i++){
            System.out.print(basket[i]+" ");
        }
    }
}




