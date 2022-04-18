package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Parking_2979 {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		int C=Integer.parseInt(st.nextToken());
		
		int sum=0;
		int[][] car=new int[3][101];
		
		for(int i=0;i<3;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			for(int j=a+1;j<=b;j++) {
				car[i][j]=1;
			}
		}
		
		for(int i=0;i<101;i++) {
			int count=0;
			if(car[0][i]==1) {
				count++;
			}
			if(car[1][i]==1) {
				count++;
			}
			if(car[2][i]==1) {
				count++;
			}
			
			switch(count) {
				case 1: sum+=A; break;
				case 2: sum+=B*2; break;
				case 3: sum+=C*3; break;
			}
		}
		
		System.out.println(sum);
	}
}
