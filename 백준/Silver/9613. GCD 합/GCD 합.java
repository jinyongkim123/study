import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 0; i<t; i++){

            long result = 0;

            int[] ary = new int[sc.nextInt()];

            for(int j =0; j<ary.length; j++){
                ary[j] = sc.nextInt();
            }

            for(int j = 0; j < ary.length - 1; j++){
                for(int k = j+1; k<ary.length; k++){
                    int a = ary[j];
                    int b = ary[k];

                    int GCD = gcd(Math.max(a,b), Math.min(a,b));

                    result += GCD;
                }
            }

            System.out.println(result);
        }
    }

    public static int gcd(int x, int y) {
        int a = x % y;

        if (a == 0) {
            return y;
        } else {
            return gcd(y, a);
        }
    }
}
