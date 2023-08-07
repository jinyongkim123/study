import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int d = gcd(a, b); //최대 공약수
        System.out.println(d);
        System.out.println(a*b/d);

        }

        public static int gcd(int a, int b){
            while(b!=0){
                int tmp = a%b; // 나머지 구하기
                a = b;
                b = tmp;
            }
            return a;
        }
}



