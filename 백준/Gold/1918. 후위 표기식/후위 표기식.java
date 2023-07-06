import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        String data = br.readLine();
        for (int i = 0; i < data.length(); i++) {
            char now = data.charAt(i);

            switch (now) {
                case '+':
                case '-':
                case '*':
                case '/':
                    while (!stk.isEmpty() && ranking(stk.peek()) <= ranking(now)){
                    sb.append(stk.pop());
                }
                stk.add(now);
                break;
                case '(':
                    stk.add(now);
                    break;
                case ')':
                    while(!stk.isEmpty() && stk.peek() != '('){
                        sb.append(stk.pop());
                    }
                    stk.pop();
                    break;
                default:
                    sb.append(now);
            }
        }
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        System.out.println(sb.toString());
    }

    public static int ranking(char operater) {
        if (operater == '(' || operater == ')') {
            return 2;
        } else if (operater == '*' || operater == '/') {
            return 0;
        } else if (operater == '+' || operater == '-') {
            return 1;
        }
        return -1;
    }

}