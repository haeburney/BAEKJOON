import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int[] arr= new int[n];
		int sum=0;
		int check=arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		while(k!=0) {
			if(k<arr[check]) {
				check--;
			}
			else {
				k-=arr[check];
				sum++;
			}
		}
	
		System.out.println(sum);
	}
}
