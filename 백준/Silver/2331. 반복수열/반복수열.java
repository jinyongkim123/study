import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    static int answer = 0;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int p = sc.nextInt();

        list.add(Integer.parseInt(a));
        dfs(a, p);
        System.out.println(answer);

    }

    public static void dfs(String a, int p) {
        //D[n-1]의 각 자리의 숫자를 p번 곱한 수들의 합 구하기
        int total = 0;
        for (char c : a.toCharArray()) {
            int tmp = 1;
            for (int i = 0; i < p; i++) {
                tmp *= c - '0';
            }
            total += tmp;
        }

        // 반복 수열을 발견하면
        if(list.contains(total)){
            //반복 수열의 처음 인덱스 값 리턴
            answer = list.indexOf(total);
        }
        else {
            list.add(total);
            dfs(String.valueOf(total), p);
        }
    }

}
