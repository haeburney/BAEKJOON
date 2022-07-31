import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[] arr=new int[1000001];
		arr[0]=0;
		arr[1]=1;
		
		for(int i=2;i<=num;i++) {
			arr[i]=(arr[i-1]+arr[i-2])%1000000007;
		}
		
		System.out.println(arr[num]);
	}
}
