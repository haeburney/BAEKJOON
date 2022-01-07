package baekjoon;
import java.util.Scanner;

public class Bee_2292 {
	public static void main(String args[]) {
		int n,check=0;
		int start,end=1;
		
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		int i=1;
		
		if(n==1) {
			System.out.println(n);
		}
		else {
			while(true) {
				start=end+1;
				end+=6*i;
				System.out.println("start : "+start);
				System.out.println("end : "+end);
				
				if(start<=n&&n<=end) {
					System.out.println((i+1));
					break;
				}
				else {
					i++;
				}
			}
		}
	}
}
