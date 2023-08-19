import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = {1, 1, 2, 2, 2, 8};
		int[] input = new int[6];
		
		for(int i=0;i<arr.length;i++) {
			input[i] = arr[i] - Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
	}
}
