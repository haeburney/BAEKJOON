package baekjoon;
import java.util.Scanner;
import java.util.Arrays;

public class Add_9095 {
	public static void main(String args[]) {
		int n,num;
		int[] arr1=new int[11];
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=4;
		for(int i=3;i<11;i++) {
			arr1[i]=arr1[i-1]+arr1[i-2]+arr1[i-3];
		}
		
		int[] sum=new int[n];
		
		for(int i=0;i<n;i++) {
			num=sc.nextInt();
			sum[i]=arr1[num-1];
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(sum[i]);
		}
		
	}
	
	
}
