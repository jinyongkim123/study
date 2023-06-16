import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int totalPieces = 0;
        Stack<Character> stack = new Stack<>();

        for( int i=0; i<input.length(); i++){
            char current = input.charAt(i);

            if(current == '('){ //괄호가 ( 이면?
                stack.push(current);
            }else { //괄호가 ) 이면?
                stack.pop();    //어떤 경우든 ) 나오면 스택 팝 해버리기
                if(input.charAt(i-1)=='('){ //근데 이제 ) 괄호 이전 괄호가 ( 이라면?
                    totalPieces += stack.size(); // 스택 사이즈 조각 수에 넣기
                }else { // ) 괄호 이전 괄호가 )이라면?
                    totalPieces++;  //조각 수 +1해주기
                }
            }
        }
        System.out.println(totalPieces);
    }

}