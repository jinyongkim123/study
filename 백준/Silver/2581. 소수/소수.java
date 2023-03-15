import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        boolean sosu[] = new boolean[num2+1];
        sosu[1] = true;
        for(int i=2;i<Math.sqrt(num2);i++){
            if(sosu[i])
                continue;
            for(int j=i*2;j<=num2;j+=i){
                sosu[j] = true;
            }
        }
        int min=-1;
        int sum = 0;
        for(int i=num1;i<=num2;i++){
            if(!sosu[i]){
                sum +=i;
                if(min==-1){
                    min = i;
                }
            }
        }
        if(min==-1){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
