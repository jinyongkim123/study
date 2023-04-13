import java.io.IOException;
import java.util.Scanner;

// 진수변환 어렵네...
public class Main {
    public static void main(String[] args) throws IOException {

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int n = Integer.parseInt(br.readLine());

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 주어진 수
        int b = sc.nextInt();   // 기존 진법
        
        StringBuilder sb = new StringBuilder();
        //10진수 N을 B진법으로 변환
        while(n>0){
            int mod = n % b;// 나머지
            n /= b; //몫

            if(mod >= 10){//알파벳인 경우
                sb.append((char)(mod - 10 + 'A'));
            }else {
                sb.append(mod);
            }
        }
        System.out.println(sb.reverse().toString());
    }
}