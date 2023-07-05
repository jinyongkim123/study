import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String data = br.readLine();
        double[] ary = new double[num];

        for(int i=0; i<num; i++){
            ary[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>();

        double result = 0;
        for(int i =0; i<data.length(); i++){
            if('A' <= data.charAt(i) && data.charAt(i) <= 'Z'){
                stack.push(ary[data.charAt(i) - 'A']);
            }else{
                if(!stack.isEmpty()){
                    double first = stack.pop();
                    double second = stack.pop();
                    switch(data.charAt(i)){
                        case '+':
                            result = second + first;
                            stack.push(result);
                            continue;
                        case '-':
                            result = second - first;
                            stack.push(result);
                            continue;
                        case '*':
                            result = second * first;
                            stack.push(result);
                            continue;
                        case '/':
                            result = second / first;
                            stack.push(result);
                            continue;
                    }
                }
            }
        }

        System.out.printf("%.2f", stack.pop());

        br.close();
    }

}