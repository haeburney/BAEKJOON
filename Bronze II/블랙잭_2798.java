package baekjoon;

import java.util.Scanner;

public class Blackjack_2798 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n,m,sum=0,max=0;
		n=sc.nextInt();
		int[] arr=new int[n];
		m=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					sum=arr[i]+arr[j]+arr[k];
					if(sum>max&&sum<=m) {
						max=sum;
					}
				}
			}
		}
		
		System.out.println(max);
	}
}
