package baekjoon;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class double_1500 {
	public static void main(String args[]) {
		int s,k,num;
		long sum=1;
		
		Scanner sc=new Scanner(System.in);
		
		s=sc.nextInt();
		k=sc.nextInt();
		
		int[] arr=new int[k];
		
		for(int i=0;i<k;i++) {
			num=s/(k-i);
			if(i==k-1) {
				arr[i]=s;
			}
			else {
				arr[i]=num;
				s-=num;
			}
			sum*=arr[i];
		}
		
		System.out.print(sum);
	}
}
