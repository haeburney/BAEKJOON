package baekjoon;
import java.util.Scanner;

public class Alphabet_10808 {
	public static void main(String args[]) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		int num;
		
		
		char[] arr=s.toCharArray();
		int[] sum=new int[26];
		
		char a;
		
		for(int i=0;i<arr.length;i++) {
			num=(int)s.charAt(i)-97;
			sum[num]++;
		}
		
		for(int i=0;i<26;i++) {
			System.out.print(sum[i]+" ");
		}
	}
}
