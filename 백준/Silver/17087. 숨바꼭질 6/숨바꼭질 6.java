import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] info = br.readLine().split(" ");
        // info[0]에 N입력 / info[1]에 S
        String[] temp = br.readLine().split(" ");

        int[] distance = new int[temp.length];

        for(int i = 0; i<temp.length; i++){
            if(Integer.parseInt(temp[i])> Integer.parseInt(info[1])){
                distance[i] = Integer.parseInt(temp[i]) - Integer.parseInt(info[1]);
            }else{
                distance[i] = Integer.parseInt(info[1]) - Integer.parseInt(temp[i]);
            }
        }

        int brother = Integer.parseInt(info[0]);

        int answer = distance[0];

        if(brother != 1){
            //동생이 한명이 아닐 경우 최대 공약수 구하기
            for(int i= 1; i<distance.length; i++){
                answer = gcd(answer,distance[i]);
            }
        }
        System.out.println(answer);
    }

    public static int gcd(int x, int y) {
        int a = x % y;

        if (a == 0) {
            return y;
        } else {
            return gcd(y, a);
        }
    }
}
