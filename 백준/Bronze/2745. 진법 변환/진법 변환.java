import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int n = Integer.parseInt(br.readLine());

        Scanner sc = new Scanner(System.in);
        String n = sc.next();   // 주어진 수
        int b = sc.nextInt();   // 기존 진법
        int answer = 0;     // 새로운 진법으로 변환한 결과

        //문자열 n의 각 자리 수를 기존 진법으로 계산하여 10진수로 변환하는 과정 진행
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);   //문자열 n의 i번째 자리 수
            int num;    //문자열 n의 i번째 자리 수에 대응하는 10진수 값

            if (Character.isDigit(c)) {   //숫자인 경우
                num = c - '0'; //문자열 '0'의 10진수 값인 48을 빼면 숫자 값을 얻을 수 있음
            } else {//알파벳인 경우
                num = c - 'A' + 10; //A부터 순서대로 10진수 값이 10부터 35까지
            }

            answer += num * Math.pow(b, n.length() - i - 1);
        }
        System.out.println(answer); //역순으로 저장되었으므로 뒤집어서 출력
    }
}