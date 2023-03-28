import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int std = stdIn.nextInt();
        int[] ary = new int[std];
        int cut = stdIn.nextInt();
        int total = 0;
        int middle = 0;

        for (int i = 0; i < std; i++) {
            ary[i] = stdIn.nextInt();
            total += ary[i];
        }

        //선택정렬로 배열 내림차순 정렬해주기
        for(int i=0; i<ary.length-1; i++){
            int midindex = i;
            for(int j=i+1; j<ary.length; j++){
                if(ary[j]>ary[midindex]){//피봇보다 다음 배열이 더 크다면은?
                    midindex=j;
                }
            }
            int temp = ary[i];
            ary[i] = ary[midindex];
            ary[midindex] = temp;

        }

        System.out.println(ary[cut-1]);


    }
}