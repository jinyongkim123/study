import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        String data = br.readLine();
        int[] alpa = new int[26];

        for(int i=0; i<data.length(); i++){
            stk.push(data.charAt(i));
        }

        while(!stk.isEmpty()){
            alpa[stk.pop()-'a']++;
        }

        for(int i=0; i<26; i++){
            System.out.print(alpa[i] + " ");
        }
    }


}