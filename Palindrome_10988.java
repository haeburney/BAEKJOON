package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome_10988 {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String s=br.readLine();
		String[] strArray=s.split("");
		
		int count=0;
		int check=0;
		
		while(count<s.length()/2) {
			if(strArray[count].equals(strArray[s.length()-count-1])) {}
			else {check++;}
			count++;
		}
		
		if(check==0) System.out.println(1);
		else System.out.println(0);
	}
}
