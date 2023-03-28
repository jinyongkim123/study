import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[] ary = new int[5];
        int total = 0;
        int middle = 0;

        for (int i = 0; i < 5; i++) {
            ary[i] = stdIn.nextInt();
            total += ary[i];
        }

        //선택정렬로 배열 오름차순 정렬해주기
        for(int i=0; i<ary.length-1; i++){
            int midindex = i;
            for(int j=i+1; j<ary.length; j++){//피봇 다음 배열이 더 작다면은?
                if(ary[j]<ary[midindex]){
                    midindex=j;
                }
            }
            int temp = ary[i];
            ary[i] = ary[midindex];
            ary[midindex] = temp;

        }

        System.out.println(total / 5);
        System.out.println(ary[2]);


    }
}