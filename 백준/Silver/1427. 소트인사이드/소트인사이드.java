import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int[] ary2 = new int[n.length()];

        for (int i = 0; i < ary2.length; i++) {
            //Character.getNumericValue()메서드와 charAt()메서드를 이용해 문자열을 숫자 배열로 변환
            ary2[i] = Character.getNumericValue(n.charAt(i));
        }
        //선택정렬
        for (int i = 0; i < ary2.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < ary2.length; j++) {
                if (ary2[index] < ary2[j]) {
                    index = j;
                }
            }
           int temp = ary2[i];
            ary2[i] = ary2[index];
            ary2[index] = temp;
        }

        for(int i=0; i<ary2.length; i++){
            System.out.print(ary2[i]);
        }
    }


}
