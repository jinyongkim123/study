import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int res = 0;
        for (int i = 1; i < n; i++) {
            int num = i;
            int total =0;

            int sub = i;
            while(num!=0){
                sub+=num%10;
                num/=10;
            }

            if(sub==n){
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
}