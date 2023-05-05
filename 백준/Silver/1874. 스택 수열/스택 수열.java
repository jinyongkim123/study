import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int start = 0;

        while(N-- > 0){
            int input = Integer.parseInt(br.readLine());

            if(input > start){ //start + 1 부터 입력받은 value 까지 push를 한다.
                for(int i=start+1; i<=input; i++){
                    stack.push(i);
                    sb.append('+').append('\n'); //+ 저장
                }
                start = input;//다음 push할 때의 오름차순을 유지하기 위한 변수 초기화
            }
            else if(stack.peek() != input){
                System.out.println("NO");
                return; //System.exit(0);으로 대체 가능
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }

}