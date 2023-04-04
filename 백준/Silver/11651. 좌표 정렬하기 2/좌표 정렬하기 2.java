import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] ary = new int[n][2];

        //입력받은 좌표 배열에 저장
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            ary[i][0] = Integer.parseInt(input[0]);
            ary[i][1] = Integer.parseInt(input[1]);
        }


        //배열 정렬
        Arrays.sort(ary, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {//y좌표 같은 경우
                    return Integer.compare(o1[0], o2[0]);//y좌표 오름차순
                } else {//y좌표 다른 경우
                    return Integer.compare(o1[1], o2[1]);//x좌표 오름차순
                }
            }
        });

        //정렬된 좌표 출력
        for(int i=0; i<n; i++){
            System.out.println(ary[i][0] + " " + ary[i][1]);
        }
    }


}