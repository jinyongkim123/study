import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        char[] input = br.readLine().toCharArray();

        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 'a' && input[i] <= 'z') {
                if(input[i] >= 'n'){
                    input[i] -= 13;
                }else{
                    input[i] += 13;
                }
            } else if (input[i] >= 'A' && input[i] <= 'Z') {
                if(input[i] >= 'N'){
                    input[i] -= 13;
                }else{
                    input[i] += 13;
                }
            }
        }

        for(int i=0; i<input.length; i++){
            System.out.print(input[i]);
        }

    }
}



