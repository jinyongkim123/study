import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();

       Queue<Integer> q = new LinkedList<>();

       for(int i=1; i<=N; i++){
           q.add(i);
       }

       while(q.size()!=1){
           q.poll();
           q.add(q.poll());
         
       }

        System.out.print(q.peek());

    }
}




