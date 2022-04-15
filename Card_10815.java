package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Card_10815 {
	public static int[] arr;
	public static int[] card;
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(st.nextToken());
		arr=new int[N];
		
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		st=new StringTokenizer(br.readLine()," ");
		int M=Integer.parseInt(st.nextToken());
		card=new int[M];
		
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<M;i++) {
			card[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<card.length;i++) {
			if(binarySearch(card[i],0,arr.length-1)==-1) {
				bw.write("0 ");
			}
			else {
				bw.write("1 ");
			}
		}
		
		bw.flush();
		
	}
	
	static int binarySearch(int key, int low, int high) {
		int mid;
		
		while(low<=high){ 
			mid=(low+high)/2;
			
			if(key==arr[mid]) {
				return 1;
			} else if(key<arr[mid]) {
				high=mid-1;
			} else {
				low=mid+1;
			}
		}
		return -1;
	}
}
