import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <= b; i++){
            if(sosu(i) != 0){
                System.out.println(sosu(i));
            }
        }


    }
    // 소수 판별 함수
    static int sosu(int num) {
        if (num <= 1) {
            return 0;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return num;
    }
}
