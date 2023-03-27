import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int[] ary = new int[N];

        for (int i = 0; i < N; i++) {
            ary[i] = stdIn.nextInt();
        }

        //버블정렬
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ary[j] > ary[j + 1]) {
                    int temp = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = temp;
                }
            }
        }

        for(int i=0; i<ary.length; i++){
            System.out.println(ary[i]);
        }

    }
}