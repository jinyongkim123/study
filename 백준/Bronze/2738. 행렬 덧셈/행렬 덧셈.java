import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        int[][] ary1 = new int[a][b];
        int[][] ary2 = new int[a][b];

        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                ary1[i][j] = stdIn.nextInt();
            }
        }

        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                ary2[i][j] = stdIn.nextInt();
                ary1[i][j]+=ary2[i][j];
            }
        }

        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(ary1[i][j]+" ");
            }
            System.out.println();
        }
    }
}




