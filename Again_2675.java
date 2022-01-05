package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Again_2675 {
	public static void main(String args[]) {
		int T,num;
		String s;
		Scanner sc=new Scanner(System.in);
		
		T=sc.nextInt();
		String[] arr=new String[T];
	Arrays.fill(arr, "");
		
		for(int i=0;i<T;i++) {
			num=sc.nextInt();
			s=sc.next();
			
			for(int j=0;j<s.length();j++) {
				for(int k=0;k<num;k++) {
					arr[i]+=s.charAt(j);
				}
			}
		}
		
		for(int i=0;i<T;i++) {
			System.out.println(arr[i]);
		}
	}
}
