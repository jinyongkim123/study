import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();

        int[] basket = new int[N+1];
        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }
        for (int a = 0; a < M; a++) {
            int i = stdIn.nextInt();
            int j = stdIn.nextInt();

            while (i < j) {
                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;
                i++;
                j--;

            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}




