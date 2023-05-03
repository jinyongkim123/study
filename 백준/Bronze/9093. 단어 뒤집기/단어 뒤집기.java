import java.io.*;

public class Main {

    public static int[] stack;
    public static int size = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            String[] words = br.readLine().split(" ");
            for(String word : words){
                for(int i=word.length() -1; i>=0; i--){
                    bw.write(word.charAt(i));
                }
                bw.write(" ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}