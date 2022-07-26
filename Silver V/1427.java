import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		
		while(num>0) {
			arr.add(num%10);
			num /= 10;
		}
		
		Collections.sort(arr, Collections.reverseOrder());
		
		for(int i: arr) {
			System.out.print(i);
		}
	}
}
