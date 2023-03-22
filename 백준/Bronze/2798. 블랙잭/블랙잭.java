import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int ctotal = stdIn.nextInt();
        int cnumber = stdIn.nextInt();
        int[] ary = new int[ctotal];

        int result = 0;

        for (int i = 0; i < ctotal; i++) {
            ary[i] = stdIn.nextInt();
        }

        for (int i = 0; i < ctotal - 2; i++) {

            for (int j = i + 1; j < ctotal; j++) {

                for (int k = j + 1; k < ctotal; k++) {
                    int temp = ary[i] + ary[j] + ary[k];

                    if(result<temp && temp <= cnumber){
                        result = temp;
                    }

                }
            }
        }
        System.out.println(result);
    }
}