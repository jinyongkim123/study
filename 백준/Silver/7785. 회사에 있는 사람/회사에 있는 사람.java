import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        HashSet<String> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());

        for(int i =0; i<n; i++){
            String[] accessRecord = br.readLine().split(" ");
            String name = accessRecord[0];
            String stat = accessRecord[1];

            if(stat.equals("enter"))
                set.add(name);
            else if (stat.equals("leave"))
                set.remove(name);
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        for(String name : list){
            System.out.println(name);
        }



    }
}