import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		String word = br.readLine();
		String[] arr = word.split("");
		
		int num = Integer.parseInt(br.readLine());
		System.out.println(arr[num-1]);
		
	}
}
