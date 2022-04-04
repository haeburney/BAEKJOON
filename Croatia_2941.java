package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Croatia_2941 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String s=bf.readLine();
		int sum=0;
		
		String[] arr=s.split("");
		for(int i=0;i<arr.length;i++) {
			if(i+1<arr.length) {
				if(arr[i].equals("c")&&(arr[i+1].equals("=")|arr[i+1].equals("-"))){
					sum++;
					i++;
				}
				else if((arr[i].equals("l")|arr[i].equals("n"))&&arr[i+1].equals("j")) {
					sum++;
					i++;
				}
				else if((arr[i].equals("s")|arr[i].equals("z"))&&arr[i+1].equals("=")) {
					sum++;
					i++;
				}
				else if(arr[i].equals("d")) {
					if(arr[i+1].equals("-")) {
						sum++;
						i++;
					}
					else if(i+2<arr.length) {
						if(arr[i+1].equals("z")&&arr[i+2].equals("=")) {
							sum++;
							i+=2;
						}
						else sum++;
					}
					else  sum++;
				} else sum++;
				
			}
			else {sum++;}
		}
		System.out.println(sum);
	}
}
