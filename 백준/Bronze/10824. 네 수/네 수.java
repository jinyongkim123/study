import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sk = new StringTokenizer(br.readLine());

        String[] ary = new String[4];
        for(int i=0; i<4; i++){
            ary[i] = sk.nextToken();
        }

        System.out.println(Long.parseLong(ary[0]+ary[1])+Long.parseLong(ary[2]+ary[3]));
    }
}



