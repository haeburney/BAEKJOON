package baekjoon;
import java.util.Scanner;
import java.util.Arrays;

public class word_1157 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s;
		int[] arr=new int[26];
		int num,max=0,m=0;
		
		s=sc.nextLine();
		char[] word=s.toCharArray();
		
		for(int i=0;i<word.length;i++) {
			num=(int)s.charAt(i);
			if(num>96) {
				arr[num-97]++;
			}
			else {
				arr[num-65]++;
			}
		}
		
		max=arr[0];
		
		for(int i=0;i<26;i++) {
			if(arr[i]>max) {
				max=arr[i];
				m=i;
			}
		}
		
		num=0;
		
		for(int i=0;i<26;i++) {
			if(max==arr[i]) {
				num++;
			}
		}
		
		if(num==1) {
			System.out.print((char)(m+65));
		}
		else {
			System.out.print("?");
		}
	}
}
