package baekjoon;

import java.util.Scanner;

public class CommonMeasure_13241 {
	public static long answer1;
	public static long answer2;
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long num1,num2;
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		answer1=gcd(num1,num2);
		answer2=CommonDivisor(num1,num2);
		
		System.out.println(answer2);
	}
	
	public static long gcd(long a, long b) {
		long c;
		while(b!=0) {
			c=b;
			b=a%b;
			a=c;
		}
		return a;
	}
	
	public static long CommonDivisor(long a, long b){
		long sum=1;
		sum=(a/answer1)*(b/answer1)*answer1;
		return sum;
	}
}
