package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Conference_1931 {
	public static int time[][];
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		time=new int[N][2];
		
		for(int i=0;i<N;i++) {
			time[i][0]=sc.nextInt();
			time[i][1]=sc.nextInt();
		}
		
		Arrays.sort(time,(o1,o2)->{
			if(o1[1]==o2[1]) {
				return Integer.compare(o1[0], o2[0]);
			} else {
				return Integer.compare(o1[1],o2[1]);
			}
		});
		
		
		int end=0,count=0;
		
		for(int i=0;i<N;i++) {
			if(time[i][0]>=end) {
				end=time[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	}
}
