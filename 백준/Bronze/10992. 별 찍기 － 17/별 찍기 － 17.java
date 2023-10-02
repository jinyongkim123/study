import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i<num; i++){

            for(int k = 0; k<num-i; k++){
                System.out.print(" ");
            }

            for(int j = 1; j<=2*i-1; j++){
                if(j ==1 || j==2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 0; i<2*num-1; i++){
            System.out.print("*");
        }


    }
}
