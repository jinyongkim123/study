import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] ary = new int[1000001];

        ary[1] = 1;
        for(int i = 2; i<b; i++){
            for(int j = 2; i*j <=b; j++){
                ary[i*j] = 1;
            }
        }

        for(int i=a; i<=b; i++){
            if(ary[i] == 0){
                System.out.println(i);
            }
        }

    }

}
