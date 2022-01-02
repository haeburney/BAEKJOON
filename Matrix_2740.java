package baekjoon;
import java.util.Scanner;
import java.util.Arrays;

public class Matrix_2740 {
	public static void main(String args[]) {
		int N,M,K;
		Scanner sc=new Scanner(System.in);
		
		N=sc.nextInt();
		M=sc.nextInt();
		
		int[][] arr=new int [N][M];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		M=sc.nextInt();
		K=sc.nextInt();
		
		int[][] arr1=new int[M][K];
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<K;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		int[][] result=new int[N][K];
		
		int sum;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<K;j++) {
				sum=0;
				for(int l=0;l<M;l++) {
					sum+=arr[i][l]*arr1[l][j];
				}
				result[i][j]=sum;	
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<K;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
