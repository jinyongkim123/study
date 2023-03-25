import java.util.*;

public class Main {

	
	
	public static void main(String[] args) {
		

		Scanner num = new Scanner(System.in);
		
		int N=num.nextInt();
		
		if(N>1) {
			func(N);
		}
		else {
			System.out.println("666");
		}	
	}
	public static void func(int n) {
		int count = 1;
		int prev_digit=0;//선수 자릿수
		int num = 0; 	 //선수 자릿수를 제외한 나머지 뒷 자릿수
		
		while(true) {
			if(((prev_digit % 10000)/10)==666 && prev_digit % 10 != 6) {
				for(int i=0;i<1000;i++) {
					if(count == n) {
						System.out.print(prev_digit*1000 + num);
						return ;
					}
					num++;
					count++;
				}
				prev_digit++;
			}
			//선수 자릿수가 X...666일 경우 (ex. 666_000, 1666_004,...)
			else if(prev_digit % 1000==666) {
				num = 0;
				for(int i=0;i<1000;i++) {
					
					if(count == n) {
						System.out.println(prev_digit*1000+num);
						return ;
					}
					count++;
					num++;
				}
				prev_digit++;
			}
			//선수 자릿수가 X...66일 경우 (ex.66_660, 166_600, ...
			else if (prev_digit % 100 == 66) {
				num = 600;
				for(int i=0;i<100; i++) {
					if(count == n) {
						System.out.println(prev_digit*1000 + num);
						return ;
					}
					count++;
					num++;
				}
				prev_digit++;
			}
			//선수 자릿수가 X...6일 경우 (ex. 6_660, 16_663,...)
			else if(prev_digit % 10 == 6) {
				num=660;
				for(int i=0;i<10;i++) {
					if(count == n) {
						System.out.print(prev_digit*1000+num);
						return ;
					}
					num++;
					count++;
				}
				prev_digit++;
			}
			//그 외의 경우 (ex.241_666,23_666...)
			else {
				num=666;
				if(count == n) {
					System.out.print(prev_digit * 1000 + num);
					return ;
				}
				count++;
				prev_digit++;
			}
			
		}
	}
}


