import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        for(int i=0; i<m; i++){
            set.add(br.readLine());
        }

        for(int i=0; i<s; i++){
            if(set.contains(br.readLine())){
                cnt++;
            }
        }


        System.out.println(cnt);
    }
}