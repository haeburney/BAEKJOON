package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Queue_10845 {
	public static void main(String args[]) throws IOException {
		Queue<Integer> queue=new LinkedList<>();
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(bf.readLine());
		int b=0;

		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(bf.readLine());
			String S=st.nextToken();
			
			switch(S){
				case "push":
					int num=Integer.parseInt(st.nextToken());
					queue.add(num);
					b=num;
					break;
				
				case "pop":
					if(queue.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(queue.poll());
					}
					break;
					
				case "size":
					System.out.println(queue.size());
					break;
					
				case "empty":
					if(queue.isEmpty()){
						System.out.println(1);
					}
					else {
						System.out.println(0);
					}
					break;
					
				case "front":
					if(queue.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(queue.peek());
					}
					
					break;
					
				case "back":
					if(queue.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(b);
					}
					break;
			}
		}
		
	}
}
