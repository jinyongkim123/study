import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        String input = "";
        int[] cnt;

        while ((input = br.readLine()) != null) {
            cnt = new int[4];
            sb = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                    cnt[0] += 1;
                }
                if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                    cnt[1] += 1;
                }
                if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                    cnt[2] += 1;
                }
                if (input.charAt(i) == ' ') {
                    cnt[3] += 1;
                }
            }
            for(int i : cnt){
                sb.append(i).append(" ");
            }
            System.out.println(sb);
        }
    }
}



