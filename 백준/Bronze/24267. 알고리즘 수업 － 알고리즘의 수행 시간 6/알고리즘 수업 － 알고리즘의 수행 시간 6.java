import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        
     /*   int sum = 0;
        int cnt = 0;
        for (int i = 1; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                for (int k = j + 1; k <= n; k++) {
                    sum = sum + i * j * k;
                    cnt++;
                }
            }
        }
        */
       // System.out.println(cnt);
        System.out.println(n*(n-1)*(n-2)/6);
        System.out.println('3');
    }
}



