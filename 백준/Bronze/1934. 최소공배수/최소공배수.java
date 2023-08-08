import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            int res = gcd(a, b);

            System.out.println(a*b/res);
        }
    }

    public static int gcd(int x, int y){
        while(y!=0){
            int tmp = x%y;
            x = y;
            y = tmp;
        }
        return x;
    }

}



