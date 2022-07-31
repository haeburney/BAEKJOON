import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static long dp[];
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		dp=new long[num+1];
		long answer=fibonacci(num);
		System.out.println(answer);
	}
	
	public static long fibonacci(int n) {
		if(n==1 || n==2 || n==3) return 1;
		else if(n<0) return 0;
		if(dp[n]!=0) return dp[n];
		dp[n]=fibonacci(n-1) + fibonacci(n-3);
		return dp[n];
	}
}
