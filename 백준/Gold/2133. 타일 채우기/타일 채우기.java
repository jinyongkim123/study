import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tile[] = new int[N+1];

        tile[0] = 1;
        for(int i=2; i<=N; i+=2){//어차피 짝수만 채워져셔 짝수 부분만 반복
            tile[i] = tile[i-2]*3; //기본적인 전 타일에서의 조합 더해주기
            for(int j=i-4; j>=0; j-=2){//각 N(i)마다 예외적인 부분(N(i)에서만 되는 특별한 타일 조합)도 경우의 수 더해주기
                tile[i] += tile[j]*2;//2는 해당 j 에서마다 나오는 특별한 타일임.
            }
        }

        System.out.println(tile[N]);
    }
}

