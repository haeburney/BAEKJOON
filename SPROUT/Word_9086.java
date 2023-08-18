import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(br.readLine());
		String[] answer = new String[num];
		
		for(int i=0;i<num;i++) {
			String input = br.readLine();
			answer[i] = String.valueOf(input.charAt(0)) + String.valueOf(input.charAt(input.length()-1));
		}
		
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}
}
