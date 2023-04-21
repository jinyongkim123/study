import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        int cnt = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++){
            String name = sc.next();
            map.put(name, map.getOrDefault(name, 0)+1); //빈도 저장
        }

        List<String> answerList = new ArrayList<>();
        for(int i=0; i<m; i++){
            String name = sc.next();
            if(map.containsKey(name)){
                answerList.add(name);
            }
        }
        
        Collections.sort(answerList);

        System.out.println(answerList.size());
        for(String name : answerList){
            System.out.println(name);
        }
    }
}