import java.util.Scanner;

public class Main {
    static int MAX = 1000000;
    static boolean[] isPrime = new boolean[MAX + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        PrimeAry();
        while(true){
            int n = sc.nextInt();
            if(n == 0) break;

            boolean found = false;

            for(int i=2; i<=n/2; i++){
                //i와 (n-i)가 모두 소수이면, n을 두 소수의 합으로 표현할 수 있다고 함. 신기하네
                //그리고 여러개가 나와도 자동으로 b-a가 큰것의 조합으로 나올 수 밖에 없음 i값이 적으면 n-i값이 크니까
                if(isPrime[i] && isPrime[n-i]){ 
                    sb.append(n).append(" = ").append(i).append(" + ").append(n-i).append("\n");
                    found = true;
                    break;
                }
            }
            if(!found){
                sb.append("Goldbach's conjecture is wrong.\n");
            }
        }
        System.out.println(sb.toString());

    }

    static void PrimeAry(){
        for(int i=2; i<=MAX; i++){
            isPrime[i] = true;
        }

        //소수 여부 판별
        for(int i = 2; i*i<=MAX; i++){
            if(isPrime[i]){
                for(int j= i*i; j<=MAX; j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }


}
