import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int K = stdIn.nextInt();
        int N = stdIn.nextInt();

        int[] arr = new int[K];

        long max = 0;

        //입력과 동시에 해당 랜선의 길이가 최댓값인지를 확인하고 max를 갱신
        for (int i = 0; i < K; i++) {
            arr[i] = stdIn.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        max++;

        long min = 0;
        long mid = 0;

        while (min < max) {

            //범위 내에서 중간 길이를 구하기
            mid = (max + min) / 2;

            long count = 0;

            //구해진 중간 길이로 잘라서 총 몇개가 만들어지는지 구함
            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }
            //upper bound 형식 : mid 길이로 잘랐을 때 개수가 만들고자 하는 랜선의
            //개수보다 작다면 자르고자 하는 길이를 줄이기 위해 최대 길이를 줄인다.
            //그 외에는 자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘린다.

            if(count < N){
                max = mid;
            }
            else{
                min = mid + 1;
            }
        }

        System.out.println(min-1);
    }
}




