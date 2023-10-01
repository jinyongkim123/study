import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        while(stdIn.hasNextLine()){
            String s = stdIn.nextLine();
            System.out.println(s);
        }

    }
}
