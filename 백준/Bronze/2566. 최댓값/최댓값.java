import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        int[][] ary = new int[9][9];
        int max = 0;
        int a = 0, b = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                ary[i][j] = stdIn.nextInt();
                if (max < ary[i][j]) {
                    max = ary[i][j];
                    a = i;
                    b = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((a+1)+" "+(b+1));
    }
}




