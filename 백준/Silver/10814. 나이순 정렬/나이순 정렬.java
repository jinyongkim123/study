import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
    //Member 클래스를 정적 내부 클래스로 작성
    private static class Member{
        int age;
        String name;
        
        Member(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
    
    public static void main(String[] args) throws IOException {

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int n = Integer.parseInt(br.readLine());
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        //회원 정보를 저장할 ArrayList 생성
        ArrayList<Member> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            int age = sc.nextInt();
            String name = sc.next();
            list.add(new Member(age, name));
        }
        
        //Comparator를 람다식으로 작성
        Collections.sort(list, ((o1, o2) -> o1.age-o2.age));
        
        StringBuilder sb = new StringBuilder();
        for(Member member : list){
            sb.append(member.age).append(" ").append(member.name).append("\n");
        }

        System.out.print(sb.toString());
        
    }
}