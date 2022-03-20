package baekjoon;

import java.util.Scanner;

public class ACMHotel_10250 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++) {
			int h=sc.nextInt();
			int w=sc.nextInt();
			int n=sc.nextInt();
			
			int floor=n%h;
			int ho;
			
			if(floor==0) {
				ho=n/h;
				System.out.println(h*100+ho);
			}
			else {
				ho=n/h+1;
				System.out.println(floor*100+ho);
			}
		}
	}
}
