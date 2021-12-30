package baekjoon;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class OX_8958 {
	public static void main(String[] args) {
		int n; 
		String str;
		int data;
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			str=sc.next();
			String[] array=str.split("");
			data=1;
			
			for(int j=0;j<array.length;j++) {
				
				if(array[j].equals("O")) {
					arr[i]+=data;
					data++;
				}
				else {
					data=1;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
