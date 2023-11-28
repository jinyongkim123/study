import java.util.*;

// Main 클래스 정의
public class Main {
    static int[] visit;
    static int make[];
    static int cnt;
    static int[] Student;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int S = sc.nextInt();

            Student = new int[S + 1];
            visit = new int[S + 1];
            make = new int[S + 1];
            cnt = 0;


            for (int j = 1; j <= S; j++) {
                Student[j] = sc.nextInt();
            }

            for (int j = 1; j <= S; j++) {
                if(make[j] == 0){
                    dfs(j);
                }
            }

            System.out.println(S-cnt);
        }


    }

    public static void dfs(int x) {
        //이미 방문 했을때!! -> 사이클이 만들어졌다는것은? 팀 편성이 되었다는 것
        if (visit[x] == 1) {
            make[x] = 1;
            cnt++;
        }else{ //방문하지 않았을 때라면 -> 방문처리
            visit[x] = 1;
        }

        //  다음 학생이 팀 결성을 아직 못했을 경우!
        if(make[Student[x]] == 0)
            dfs(Student[x]); // 진입


        //해당 학생 방문 체크 해제, 팀 완성 여부 체크함. (이 때는 팀 구성을 못 하여도 그냥 체크를 해준다고 함.)
        visit[x] = 0;
        make[x] = 1;
    }
}
