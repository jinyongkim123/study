import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        String[] ary = new String[word.length()];

        for(int i=0; i<word.length(); i++){
                ary[i] = word.substring(i, word.length());
        }
        Arrays.sort(ary);

        for(int i =0; i<ary.length; i++){
            System.out.println(ary[i]);
        }

    }
}



