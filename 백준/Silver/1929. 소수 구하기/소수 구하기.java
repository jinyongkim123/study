import java.util.Scanner;

public class Main {
    // 개선된 소수 판별 함수
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(); // 시작 숫자
        int n = scanner.nextInt(); // 끝 숫자

        if (m <= 2) {
            System.out.println(2);
            m = 3;
        }
        if (m % 2 == 0) {
            m++;
        }

        for (int i = m; i <= n; i += 2) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
