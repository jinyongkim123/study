import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static boolean[] isComposite;
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        // 10진수 N을 B진법으로 변환

        while(n>0){
            int mod = n % b; //나머지
            n /= b; //몫
            
            if(mod >= 10){  //알파벳인 경우
                sb.append((char)(mod-10+'A'));
            }else{
                sb.append(mod);
            }
        }
        System.out.println(sb.reverse().toString());
    }

}
