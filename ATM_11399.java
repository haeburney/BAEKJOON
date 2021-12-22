package baekjoon;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class ATM_11399 {
	public static void main(String[] args) {
		int num, sum=0,wait=0;
		int[] arr = new int[1000];
		
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr,0,num);
		
		for(int i=0;i<num;i++) {
			wait+=arr[i];
			sum+=wait;
		}
		
		System.out.print(sum);
	}
}
