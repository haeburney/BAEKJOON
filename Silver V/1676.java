import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		int num=Integer.parseInt(br.readLine());
		
		while(num>4) {
			int total=num;
			while(total>0) {
				if(total %5 ==0) {
					count++;
					total/=5;
				}
				else {
					total=0;
				}
			}
			num--;
		}
		
		System.out.println(count);
	}
}
