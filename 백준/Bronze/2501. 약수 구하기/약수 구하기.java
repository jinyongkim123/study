import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        int cnt = 0;
        int res = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }

            if(cnt == k){
                res = i;
                break;
            }
        }

        System.out.println(res);





    }
}



