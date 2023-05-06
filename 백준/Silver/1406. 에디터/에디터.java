import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());

        Stack<String> lstk = new Stack<>();
        Stack<String> rstk = new Stack<>();

        //처음 커서는 문자으이 맨 뒤에서 시작하기 때문에 왼쪽 스택에 초기 문자를 모두 넣어줌
        String[] arr = str.split("");
        for(String s : arr){
            lstk.push(s);
        }

        for(int i =0; i<M; i++){
            String command = br.readLine();
            char c = command.charAt(0);

            switch(c){
                case 'L':
                    if(!lstk.isEmpty())
                        rstk.push(lstk.pop());
                    break;
                case 'D':
                    if(!rstk.isEmpty())
                        lstk.push(rstk.pop());
                    break;
                case 'B':
                    if(!lstk.isEmpty())
                        lstk.pop();
                    break;
                case 'P':
                    char t = command.charAt(2);
                    lstk.push(String.valueOf(t));
                    //lstk.push(st.nextToken());
                    break;
                default:
                    break;
            }
        }

        //stack은 LIFO 구조
        //왼쪽 스택에 있는 데이터들을 모두 오른쪽 스택으로 옮긴 후에 오른쪽 스택의 모든 내용 출력

        while(!lstk.isEmpty())
            rstk.push(lstk.pop());

        while(!rstk.isEmpty())
            bw.write(rstk.pop());

        bw.flush();
        bw.close();
    }

}