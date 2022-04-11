package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tree_2805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine(), " ");
		
		int N,M;
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		int[] arr=new int[N];
		long max=0;
		long min=0;
		
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			max=Math.max(max, arr[i]);
		}
		long mid=0;
		
		while(min<max) {
			mid=(min+max)/2;
			long sum=0;
			
			for(int i:arr) {
				if(i>mid) {
					sum+=i-mid;
				}
			}
			
			if(sum<M) {
				max=mid;
			}
			else {
				min=mid+1;
			}
		}
		
		System.out.println(min-1);
	}
}
