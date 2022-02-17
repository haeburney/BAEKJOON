package baekjoon;

import java.util.Scanner;

public class Multiple_5347 {
	public static int answer1;
	public static long answer2;
	public static long arr[];
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n,num1,num2;
		
		n=sc.nextInt();
		arr=new long[n];
		
		for(int i=0;i<n;i++) {
			num1=sc.nextInt();
			num2=sc.nextInt();
			answer1=gcd(num1,num2);
			answer2=CommonDivisor(num1,num2);
			arr[i]=answer2;
		}
	
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int gcd(int a, int b) {
		int c;
		while(b!=0) {
			c=b;
			b=a%b;
			a=c;
		}
		return a;
	}
	
	public static long CommonDivisor(int a, int b){
		long sum=1;
		sum=(a/answer1)*(b/answer1)*answer1;
		return sum;
	}
}
