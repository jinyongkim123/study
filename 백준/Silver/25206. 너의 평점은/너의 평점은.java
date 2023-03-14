import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);

        double ttcdt = 0;
        double add = 0;
        for (int i = 0; i < 20; i++) {
            String subject = stdIn.next();
            double credit = stdIn.nextDouble();
            String grade = stdIn.next();

            double res = 0;

            switch (grade) {
                case "A+":
                    ttcdt += credit * 4.5;
                    add+=credit;
                    break;
                case "A0":
                    ttcdt += credit * 4.0;
                    add+=credit;
                    break;
                case "B+":
                    ttcdt += credit * 3.5;
                    add+=credit;
                    break;
                case "B0":
                    ttcdt += credit * 3.0;
                    add+=credit;
                    break;
                case "C+":
                    ttcdt += credit * 2.5;
                    add+=credit;
                    break;
                case "C0":
                    ttcdt += credit * 2.0;
                    add+=credit;
                    break;
                case "D+":
                    ttcdt += credit * 1.5;
                    add+=credit;
                    break;
                case "D0":
                    ttcdt += credit * 1.0;
                    add+=credit;
                    break;
                case "F":
                    ttcdt += credit * 0.0;
                    add+=credit;
                    break;
                case "P":
                    continue;
            }
        }
        System.out.println(ttcdt/add);

    }
}



