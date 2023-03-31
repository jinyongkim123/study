import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) throws IOException {
        //Scanner stdIn = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] ary = new int[n];

        for(int i=0; i<n; i++){
            ary[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ary);

        for(int i=0; i<n; i++){
            sb.append(ary[i]).append('\n');
        }

        System.out.println(sb);
    }
}
