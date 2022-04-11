package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Sticker_1475 {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int[] count=new int[9];
		int[] arr = Stream.of(String.valueOf(N).split("")).mapToInt(Integer::parseInt).toArray();
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==9) count[6]++;
			else count[arr[i]]++;
		}
		
		
		int max=0;
		
		for(int i=0;i<count.length;i++) {
			if(i==6) continue;
			
			if(max<count[i]) {
				max=count[i];
			}
		}
		
		if(count[6]%2==0) {
			count[6]/=2;
			if(count[6]>max) {
				System.out.println(count[6]);
			}
			else {
				System.out.println(max);
			}
		}
		else {
			count[6]=count[6]/2+1;
			if(count[6]>max) {
				System.out.println(count[6]);
			}
			else {
				System.out.println(max);
			}
		}
	}
}
