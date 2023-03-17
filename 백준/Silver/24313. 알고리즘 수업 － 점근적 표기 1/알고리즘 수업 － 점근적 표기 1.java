import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        for(int i=n0; i<101; i++){
            int fn = a1*i + a0;
            int gn = i;

            if((fn<=c*gn)&&(c-a1>=0)){
                System.out.println(1);
                break;
            }
            else{
                System.out.println(0);
                break;
            }
        }

    }
}



