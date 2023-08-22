import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] ary = {"000","001","010","011","100","101","110","111"};

        String n = br.readLine();
        String res = "";
        for(int i = 0; i<n.length(); i++){
            int a = n.charAt(i) - '0';

            sb.append(ary[a]);
        }
        if(n.equals("0"))
            System.out.println(n);
        else{
            while(sb.charAt(0)=='0')
                sb = new StringBuilder(sb.substring(1));
            System.out.println(sb);
        }
    }

}
