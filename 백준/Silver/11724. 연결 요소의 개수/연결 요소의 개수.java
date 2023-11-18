import java.util.Scanner;

public class Main {

    static int node[][] = new int[1001][1001]; // 인접행렬 배열
    static int check[] = new int[1001]; //노드의 방문여부 표시 배열


    static void dfs(int x){// 재귀함수를 이용
        if(check[x] == 1) return;

        check[x] = 1;

        for(int i =1; i<node.length; i++){
            if(node[x][i] == 1){ //만약 인접한 노드다?
                dfs(i);     //바로 진입
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //정점의 개수
        int m = sc.nextInt(); //간선의 개수


        for(int i = 0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            node[u][v] = 1;
            node[v][u] = 1;
        }

        int count = 0;

        for(int i =1; i<=n; i++){
            if(check[i] == 0){
                dfs(i);
                count++;
            }
        }

        System.out.println(count);

    }
}
//https://fbtmdwhd33.tistory.com/27
