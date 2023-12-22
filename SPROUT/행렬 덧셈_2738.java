package baekjoon;
import java.util.Scanner;
import java.util.Arrays;

public class Add_2738 {
	public static void main(String args[]) {
		int N,M;
		Scanner sc=new Scanner(System.in);
		
		N=sc.nextInt();
		M=sc.nextInt();
		
		int[][] arr1=new int[N][M];
		int[][] arr2=new int[N][M];
		int[][] sum=new int[N][M];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				sum[i][j]+=arr1[i][j]+arr2[i][j];
				System.out.print(sum[i][j]+" ");
			}
		System.out.print("\n");	
		}
		
	}
}
