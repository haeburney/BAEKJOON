package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Josephus_11866 {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int kk=k;
		boolean check[]=new boolean[n+1];
		int answer[]=new int[n];
		
		check[k]=true;
		answer[0]=k;
		
		for(int i=1;i<n;i++) {
			int sum=0;
			int add=1;
			while(sum<kk) {
				if(k+add>n) {
					add=add-n;
				}
				if(check[k+add]==false) {
					sum++;
					if(sum==kk) {
						check[k+add]=true;
						answer[i]=k+add;
						k=k+add;
					}
				}
				add++;
			}
		}
		System.out.print("<");
		for(int i=0;i<n-1;i++) {
			System.out.print(answer[i]+", ");
		}
		System.out.print(answer[n-1]+">");
	}
}
