package baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class Stack_10828 {
	public static int[] arr;
	public static int num=0;
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int n=sc.nextInt();
		arr=new int[n];
		
		for(int i=0;i<n;i++) {
			String str=sc.next();
			
			switch(str) {
			
			case "push":
				push(sc.nextInt());
				break;
				
			case "pop":
				sb.append(pop()).append('\n');
				break;
			
			case "size":
				sb.append(size()).append('\n');
				break;
				
			case "empty":
				sb.append(empty()).append('\n');
				break;
				
			case "top":	
				sb.append(top()).append('\n');
				break;
			}
		}
		System.out.println(sb);
	}
	
	public static int pop() {
		if(num==0) {
			return -1;
		}
		else {
			int res=arr[num-1];
			arr[num-1]=0;
			num--;
			return res;
		}
	}
	
	public static int size() {
		return num;
	}

	public static int top() {
		if(num==0) {
			return -1;
		}
		else {
			return arr[num-1];
		}
	}

	public static int empty() {
		if(num==0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public static void push(int item) {
		arr[num]=item;
		num++;
	}
}
