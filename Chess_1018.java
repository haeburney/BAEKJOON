package baekjoon;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Chess_1018 {
	static char chess[][];
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int m,n;
		m=sc.nextInt();
		n=sc.nextInt();
		chess=new char[m][n];
		sc.nextLine();
		
		for(int i=0;i<m;i++) {
			String s=sc.nextLine();
			for(int j=0;j<n;j++) {
				chess[i][j]=s.charAt(j);
			}
		}
		
		int result=m*n;
		
		for(int i=0;i<m-7;i++) {
			for(int j=0;j<n-7;j++) {
				result=Math.min(result, f(i,j));
			}
		}
		
		System.out.println(result);
				
	}
	
	public static int f(int x,int y) {
		int sum1=0;
		int sum2=0;
		
		for(int i=x;i<x+8;i++) {
			for(int j=y;j<y+8;j++) {
				if((i+j)%2==0) {
					if(chess[i][j]=='B') sum1++;
					else	sum2++;
				}
				else {
					if(chess[i][j]=='B') sum2++;
					else	sum1++;
				}
			}
		}
		return Math.min(sum1, sum2);
	}
}
