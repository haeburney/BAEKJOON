package baekjoon;

import java.util.Scanner;

public class CommonMeasureCommonDivisor_2609 {
	public static int answer1;
	public static int answer2;
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		answer1=gcd(num1,num2);
		answer2=CommonDivisor(num1,num2);
		
		System.out.println(answer1);
		System.out.println(answer2);
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
	
	public static int CommonDivisor(int a, int b){
		int sum=1;
		sum=(a/answer1)*(b/answer1)*answer1;
		return sum;
	}
}
