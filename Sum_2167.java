package baekjoon;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Sum_2167 {
	public static void main(String args[]) {
		int n,m;
		int x;
		int x1,y1,x2,y2;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		
		int[][] arr=new int [n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.print("\n");
		}
		
		System.out.println("x 입력 : ");
		x=sc.nextInt();
		int[] brr=new int[x];
		
		for(int i=0;i<x;i++) {
			System.out.println("4개 입력 : ");
			x1=sc.nextInt();
			y1=sc.nextInt();
			x2=sc.nextInt();
			y2=sc.nextInt();
			for(int j=x1-1;j<=x2-1;j++) {
				for(int l=y1-1;l<=y2-1;l++) {
					brr[i]+=arr[j][l];
				}
			}
		}
		
		for(int i=0;i<x;i++) {
			System.out.println(brr[i]);
		}
	}
}
