import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for(int i=0; i<T; i++){
            System.out.println(solve(in.next()));
        }
    }

    public static String solve(String s){

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);

            if(c == '('){            //여는 괄호일 경우 push
                stack.push(c);
            }else if(stack.empty()){ //닫는 괄호를 입력 받았는데 pop할 원소가 없다면?
                return "NO";
            }else{
                stack.pop();
            }
        }
        if(stack.empty()){
            return "YES";
        }else{
            return "NO";
        }
    }
}