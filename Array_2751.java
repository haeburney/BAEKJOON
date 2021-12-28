package baekjoon;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Array_2751 {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int n=sc.nextInt();
		
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
	
}
