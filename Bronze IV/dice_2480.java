import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int sum=0;
		
		if(arr[0] == arr[1] && arr[1] == arr[2]) {
			sum = 10000 + 1000*arr[0];
		} else if(arr[0] !=arr[1] && arr[1]!=arr[2] && arr[2]!=arr[0]) {
			int max=1;
			for(int i=0;i<3;i++) {
				if(max<arr[i]) {
					max=arr[i];
				}
			}
			sum= 100*max;
		} else {
			if(arr[0] == arr[1]) {
				sum = sum(arr[0]);
			} else if(arr[1]==arr[2]) {
				sum = sum(arr[1]);
			} else {
				sum = sum(arr[2]);
			}
		}
		
		System.out.println(sum);
		
	}
	
	public static int sum(int num) {
		return 1000 + 100*num;
	}
}
