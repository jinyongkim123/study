import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int[] ary = new int[n.length()];

        for (int i = 0; i < ary.length; i++) {
            //Character.getNumericValue()메서드와 charAt()메서드를 이용해 문자열을 숫자 배열로 변환
            ary[i] = Character.getNumericValue(n.charAt(i));
        }
        //버블 정렬

        for(int i=ary.length - 1; i>=0; i--){
            for(int j = 0 ; j<i; j++){
                if(ary[j] < ary[j+1]){
                    int temp = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = temp;
                }
            }
        }

        for(int i=0; i<ary.length; i++){
            System.out.print(ary[i]);
        }
    }


}
