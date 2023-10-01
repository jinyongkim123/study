import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String str = sc.next();
        int total = 0;

        for(int i = 0; i<str.length(); i++){
            total += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(total);
    }
}
