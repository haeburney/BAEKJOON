package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day_1476 {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int E=Integer.parseInt(st.nextToken());
		int S=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken()); 
		
		int sum=0;
		int count=0;
		
		while(true) {
			int num=15*sum+E;
			
			if(S==28&&M==19) {
				if(num%28==0&&num%19==0) {
					break;
				}
			}
			else if(S==28) {
				if(num%28==0&&num%19==M) {
					break;
				}
			}
			else if (M==19){
				if(num%28==S&&num%19==0) {
					break;
				}	
			}
			else {
				if(num%28==S&&num%19==M) {
					break;
				}
			}
			sum++;
		}		
		
		System.out.println(15*sum+E);
	}
}
