import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int n = Integer.parseInt(br.readLine());


        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        //회원 정보를 저장할 Member 클래스 생성
        class Member {
            int age;
            String name;

            Member(int age, String name) {
                this.age = age;
                this.name = name;
            }
        }

        //회원정보 저장할 ArrayList 만들기
        ArrayList<Member> list = new ArrayList<>();

        //회원 정보를 저장할 ArrayList 만들기
        for (int i = 0; i < n; i++) {
            int age = stdIn.nextInt();
            String name = stdIn.next();
            list.add(new Member(age, name));
        }

        //나이순 오름차순 정렬
        Collections.sort(list, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.age - o2.age;
            }
        });

        for (Member member : list) {
            System.out.println(member.age + " " + member.name);
        }
    }
}