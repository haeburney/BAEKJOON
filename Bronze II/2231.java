import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int size = 9*(int)(Math.log10(num)+1);
		int answer = 0 ;
		
		for(int i=num-size;i<=num;i++) {
			int sum=0;
			int number=i;
			
			while(number!=0) {
				sum+=number%10;
				number/=10;
			}
			
			if( sum+i == num) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
	}
}
