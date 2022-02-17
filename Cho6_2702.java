package baekjoon;

import java.util.Scanner;

public class Cho6_2702 {
	public static int answer1;
	public static int answer2;
	public static int multiple[]; //공배수
	public static int divisor[]; //공약수
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		short n,num1,num2;
		
		n=sc.nextShort();
		multiple=new int[n];
		divisor=new int[n];
		
		for(int i=0;i<n;i++) {
			num1=sc.nextShort();
			num2=sc.nextShort();
			answer1=gcd(num1,num2);
			answer2=CommonDivisor(num1,num2);
			divisor[i]=answer1;
			multiple[i]=answer2;
		}
	
		for(int i=0;i<n;i++) {
			System.out.println(multiple[i]+" "+divisor[i]);
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
	
	public static int CommonDivisor(int a, int b){
		int sum=1;
		sum=(a/answer1)*(b/answer1)*answer1;
		return sum;
	}
}
