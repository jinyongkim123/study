import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        
        int[] q = new int[2*N];
        
       for(int i=1; i<=N; i++){
           q[i] = i;
       }
       int st = 1;
       int fin = N;
       
       while(N-- > 1){
           st++;
           q[fin+1] = q[st];
           fin++;
           st++;
       }

        System.out.println(q[st]);
    }
}




