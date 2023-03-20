import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		Scanner card = new Scanner(System.in);
		
		int N = card.nextInt();
		int M = card.nextInt();
		
		int result = 0;
		
		
		int []arr = new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i]=card.nextInt();
		}
		for(int i=0; i<N-2; i++) {
			for(int j= i+1; j<N;j++) {
				for(int k=j+1;k<N;k++) {
					int temp =arr[i] + arr[j]+arr[k];
					
					if(result < temp && temp <= M) {
						result = temp;
					}
				}
			}
		}
		System.out.println(result);
	}

}
