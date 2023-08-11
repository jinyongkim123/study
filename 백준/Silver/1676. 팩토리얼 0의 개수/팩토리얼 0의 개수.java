import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        //ex) 10을 입력 할 경우? 10 x 9 x 8 x 7 x 6 x 5 x 4 x 3 x 2 x 1
        //여기서 2 x 5 의 조합이 되는 경우는 맨 앞에 있는 10과 하나하나씩 있는 5와 2가 있다 그러므로 2개
        for (int i = 5; i <= n; i *= 5) {
            count += n / i;
        }

        System.out.println(count);
    }
}
