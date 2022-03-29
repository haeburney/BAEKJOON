package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Treasure_1026 {
	public static int a [];
	public static Integer b [];
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		a=new int[N];
		b=new Integer[N];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		Arrays.sort(b,Collections.reverseOrder());
		
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=(a[i]*b[i]);
		}
		System.out.println(sum);
	}
}
