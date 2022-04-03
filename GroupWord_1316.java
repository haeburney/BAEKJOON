package baekjoon;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class GroupWord_1316 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] arr=new int[N];
		int[] search=new int[27];
		String[] word=new String[N];
		int sum=0;
		
		sc.nextLine();
		for(int i=0;i<arr.length;i++) {
			word[i]=sc.nextLine();
		}
		
		for(int i=0;i<arr.length;i++) {
			int error=0;
			Arrays.fill(search,0);
	
			byte[] bytes=word[i].getBytes(StandardCharsets.US_ASCII);
			for(int j=0;j<bytes.length;j++) {
				if(j==0) {
					search[bytes[j]-97]++;
				}
				else {
					if(bytes[j]!=bytes[j-1]) {
						search[bytes[j]-97]++;
					}
				}
				if(search[bytes[j]-97]>=2) {
					error=-1;
				}
			}
			if(error==0) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
