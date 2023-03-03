import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        int max = 0;
        char[][] ary = new char[5][15];
        String stc = "";

        for (int i = 0; i < ary.length; i++) {
            String st = stdIn.next();
            if (max < st.length())
                max = st.length();
            for (int j = 0; j < st.length(); j++) {
                ary[i][j] = st.charAt(j);
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (ary[j][i] == '\0')
                    continue;
                stc += ary[j][i];
            }
        }

        System.out.println(stc);


    }
}




