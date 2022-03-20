package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Find_1920 {
	static int[] input;
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n,m,a;
		n=sc.nextInt();
		input=new int[n];
		for(int i=0;i<n;i++) {
			input[i]=sc.nextInt();
		}
		Arrays.sort(input);
		
		m=sc.nextInt();
		int[] answer=new int[m];
		
		for(int i=0;i<m;i++) {
			a=sc.nextInt();
			if(binarySearch(a,0,n-1)==-1) {
				answer[i]=0;
			}
			else {
				answer[i]=1;
			}
		}

		for(int i=0;i<m;i++) {
			System.out.println(answer[i]);
		}
	}
	
	static int binarySearch(int key, int low, int high) {
		int mid;
		
		while(low<=high) {
			mid=(low+high)/2;
			
			if(key==input[mid]) {
				return 1;
			} else if(key<input[mid]) {
				high=mid-1;
			} else {
				low=mid+1;
			}
		}
		return -1;
	}
}
