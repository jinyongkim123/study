import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    static int cnt;
    static Queue<Integer> queue = new LinkedList<>();
    static int[] check;
    static int[] graph;


    public static void bfs(int x) {

        queue.offer(x);
        check[x] = 1; //방문 마킹하고

        // 큐가 빌 때까지 실행
        while (!queue.isEmpty()) {
            int val = queue.poll();

            if (!(check[graph[val]] == 1)) { // 방문 안했으면?
                check[graph[val]] = 1; //방문 마킹 하고
                queue.offer(graph[val]);
            } else { //방문 했으면? 사이클 하나 만들어진거니까
                cnt++;
                break;
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int S = sc.nextInt();

            cnt = 0;
            graph = new int[S + 1];
            check = new int[S + 1];

            for (int j = 1; j <= S; j++) {
                graph[j] = sc.nextInt();
            }

            for (int j = 1; j <= S; j++) {
                if (!(check[j] == 1)) { //방문을 안했다면? 사이클에 있는 아이라 아무것도 안해도 됨.
                    bfs(j);
                }
            }
            System.out.println(cnt);

        }

    }

    /* ---- dfs 버전 ----*/
//    public static void dfs(int x){
//        check[graph[x]] = 1; // 들어왔으니 일단 방문표시
//
//        if(!(check[graph[x]]==1)){//만약 방문을 하지 않았다면?
//            dfs(graph[x]);  //
//        }
//    }
    
    
    /* ---- dfs 버전 ---- */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int T = sc.nextInt();
//
//        for (int i = 0; i < T; i++) {
//            int S = sc.nextInt();
//
//            int cnt = 0;
//            graph = new int[S + 1];
//            check = new int[S + 1];
//
//            for (int j = 1; j <= S; j++) {
//                graph[j] = sc.nextInt();
//            }
//
//            for (int j = 1; j <= S; j++) {
//                if (!(check[j] == 1)) { //방문을 안했다면? 사이클에 있는 아이라 아무것도 안해도 됨.
//                    bfs(j);
//                    cnt++;
//                }
//            }
//            System.out.println(cnt);
//
//        }
//
//    }
}