import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {
        //Scanner stdIn = new Scanner(System.in);

        int[] cnt = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            //해당 요소(인덱스) 값 1 증가
            cnt[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder sb = new StringBuilder();


        for(int i=1; i<10001; i++){
            //i 값이 개수가 0이 될 때 까지 출력(빈도 수 의미)
            while(cnt[i]>0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.print(sb);
    }
}
