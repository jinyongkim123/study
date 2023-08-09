import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //StringTokenizer st = new StringTokenizer(br.readLine());

        Scanner sc = new Scanner(System.in);
        int res = 0;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();

            res += gcd(a);
        }
        System.out.println(res);
    }

    public static int gcd(int x){
        if(x <= 1){
            return 0;
        }
        for(int i = 2; i*i<=x; i++){
            if(x % i == 0){
                return 0;
            }
        }
        return 1;
    }

}



