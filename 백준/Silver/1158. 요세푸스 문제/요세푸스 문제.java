import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i=1; i<=n; i++){
            queue.offer(i);
        }

        sb.append("<");
        while(queue.size() != 1){
            for(int i=1; i<k; i++){
                queue.add(queue.poll());
            }
        sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append(">");

        System.out.println(sb);


    }

}