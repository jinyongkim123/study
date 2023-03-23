import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int x=0, y=0;

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int d = stdIn.nextInt();
        int e = stdIn.nextInt();
        int f = stdIn.nextInt();

        for(int i=-999; i<=999; i++){
            for(int j=-999; j<=999; j++){
                if((a*i+b*j==c)&&(d*i+e*j==f)){
                    x=i;
                    y=j;
                    break;
                }
            }
        }
        System.out.print(x+" "+y);

    }
}