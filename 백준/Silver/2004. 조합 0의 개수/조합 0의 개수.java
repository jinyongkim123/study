import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        long count2 = count(n, 2) - count(n - m, 2) - count(m, 2);
        long count5 = count(n, 5) - count(n - m, 5) - count(m, 5);


        System.out.print(Math.min(count2, count5));
    }

    public static long count(long x, long k) {
        long cnt = 0;
        for (long i = k; i <= x; i *= k) {
            cnt += x / i;
        }
        return cnt;

    }
}
