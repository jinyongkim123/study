import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int min = 1000000;
        int max = -1000000;

        for(int i = 0; i<num; i++){
            int a = sc.nextInt();

            if(a>max)
                max = a;
            if(a<min)
                min = a;
        }
        System.out.println(min + " " + max);
    }
}
