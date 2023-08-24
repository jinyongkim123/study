import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean[] isComposite;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        isComposite = new boolean[1000001];
        Prime(1000000);

        for(int t = 0; t<T; t++){
            int n = Integer.parseInt(br.readLine());//짝수 입력
            int cnt = 0;

            for(int i = 2; i<=n/2; i++){
                if(!isComposite[i] && !isComposite[n-i]){
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }

    public static void Prime(int x){
        for(int i=2; i*i<=x; i++){
            if(!isComposite[i]){
                for(int j=i*i; j<=x; j+=i){
                    isComposite[j] = true;
                }
            }
        }

    }

}
