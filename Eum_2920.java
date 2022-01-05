package baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class Eum_2920 {
	public static void main(String args[]) {
		int[] arr=new int[8];
		int sum,num=0;
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<8;i++) {
			sum=0;
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<8;i++) {
			sum=0;
			if(i<7) {
				sum=arr[i]-arr[i+1];
				if(sum==-1) {
					num++;
				}
				else if(sum==1) {
					num--;
				}
			}
		}
		
		if(num==7) {
			System.out.println("ascending");
		}
		else if(num==-7) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
	}
}
