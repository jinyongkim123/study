import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] strAry = br.readLine().split(" ");

        // strAry 문자열을 정수형으로 바꿔줄 배열
        int[] A = new int[strAry.length];

        // 각 숫자들의 등장 빈도 수를 저장할 배열
        int[] F = new int[1000000];

        // 문자열들 정수로 바꿔주고 F배열에 등장 빈도 수 저장
        for (int i = 0; i < strAry.length; i++) {
            A[i] = Integer.parseInt(strAry[i]);
            F[A[i] -1] += 1;
        }

        //스택 선언
        Stack<Integer> stk = new Stack<>();

        // 반복문 수행
        for (int i = 0; i < A.length; i++) {
            //스택이 비어있지 않고(저장 된 인덱스가 없고) F배열을 비교하여서 현재의 배열이 더 클경우 A배열의 데이터를 현재 값으로 변경
            //반복
            while (!stk.isEmpty() && F[A[stk.peek()] - 1] < F[A[i] - 1]) {
                A[stk.pop()] = A[i];
            }
            stk.push(i);
        }

        //그 외의 경우 -1 저장
        while(!stk.isEmpty()){
            A[stk.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<A.length; i++){
            sb.append(A[i] + " ");
        }

        System.out.println(sb);
    }

}