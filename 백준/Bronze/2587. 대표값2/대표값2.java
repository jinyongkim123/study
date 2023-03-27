import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[] ary = new int[5];
        int total = 0;
        int middle = 0;

        for (int i = 0; i < 5; i++) {
            ary[i] = stdIn.nextInt();
            total += ary[i];
        }

        //버블정렬
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ary[j] > ary[j + 1]) {
                    int temp = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = temp;
                }
            }
        }

        System.out.println(total / 5);
        System.out.println(ary[2]);


    }
}