import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 회원 정보를 저장할 Member 클래스를 만듭니다.
        class Member {
            int age;
            String name;

            Member(int age, String name) {
                this.age = age;
                this.name = name;
            }
        }

        // 회원 정보를 저장할 ArrayList를 만듭니다.
        ArrayList<Member> list = new ArrayList<>();

        // 회원 정보를 입력받아 ArrayList에 저장합니다.
        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            list.add(new Member(age, name));
        }

        // 나이순으로 오름차순 정렬합니다.
        Collections.sort(list, new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                return m1.age - m2.age;
            }
        });

        // 정렬된 회원 정보를 출력합니다.
        for (Member member : list) {
            System.out.println(member.age + " " + member.name);
        }
    }
}
