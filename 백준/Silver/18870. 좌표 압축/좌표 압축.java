import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] ary = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<n; i++){
            ary[i] = Integer.parseInt(st.nextToken());
        }
        int[] temp = ary.clone();

        Arrays.sort(temp);

        Map<Integer, Integer> map = new HashMap<>();

        int idx = 0;
        for(int num : temp){
            if(!map.containsKey(num)){ //map에 num에 대한 값이 들어있지 않다면은
                map.put(num, idx++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int num : ary){
            sb.append(map.get(num)).append(" ");
        }
        System.out.println(sb);





    }
}