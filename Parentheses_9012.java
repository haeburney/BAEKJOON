package baekjoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Parentheses_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		//String z=bf.readLine();
		int num=Integer.parseInt(bf.readLine());
		String[] array_word;
		String[] arr=new String[num];
		int sum,s;
		
		for(int i=0;i<num;i++) {
			s=0;
			sum=0;
			String input=bf.readLine();
			array_word=input.split("");
			
			for(int j=0;j<array_word.length;j++) {
				if(array_word[j].equals("(")) sum++;
				else if(array_word[j].equals(")")) sum--;
				
				if(sum==-1) {
					s++;
				}
			}
			if(s==0&&sum==0) {
				arr[i]="YES";
			}
			else {
				arr[i]="NO";
			}
		}
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0;i<num;i++) {
			bw.write(arr[i]+"\n");
		}
		bw.flush();
		bw.close();
		
		/*
	//	Scanner sc=new Scanner(System.in);
		int num,sum,s=0;
		//num=sc.nextInt();
		String ss;
		String[] array_word;
		String[] arr=new String[num];
		
		//for(int i=0;i<num;i++) {
			ss=sc.next();
			
			sum=0;
			array_word=ss.split("");
			
			for(int j=0;j<array_word.length;i++) {
				if(array_word[j].equals("(")) sum++;
				else if(array_word[j].equals(")")) sum--;
				
				if(sum==-1) {
					s++;
				}
			}
			
			if(s==0|sum==0) {
				arr[i]="YES";
			}
			else {
				arr[i]="NO";
			}
		}
		
		for(int i=0;i<num;i++) {
			System.out.println(arr[i]);
		}*/
	}
}
