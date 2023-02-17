import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        String pwd = stdIn.next();
        int word = stdIn.nextInt();
        String words[] = new String[word];

        for(int i=0; i<word; i++)
            words[i] = stdIn.next();

        for (int i = 0; i < 26; i++) {
            String temp = "";
            for (int j = 0; j < pwd.length(); j++) {
                temp += (char) ((pwd.charAt(j) - 'a' + i) % 26 + 'a');//이해가 되지 않음
            }

            for (int j = 0; j < word; j++) {
                if (temp.contains(words[j])) {
                    System.out.println(temp);
                    return;
                }
            }
        }


    }
}