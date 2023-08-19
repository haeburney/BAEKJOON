import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = 0;
		float sum = 0;
		float all = 0;
		while (i < 20) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String a = st.nextToken();
			float num = Float.parseFloat(st.nextToken());
			String grade = st.nextToken();
			all += num;

			switch (grade) {
			case "A+":
				sum += num * 4.5;
				break;
			case "A0":
				sum += num * 4.0;
				break;
			case "B+":
				sum += num * 3.5;
				break;
			case "B0":
				sum += num * 3.0;
				break;
			case "C+":
				sum += num * 2.5;
				break;
			case "C0":
				sum += num * 2.0;
				break;
			case "D+":
				sum += num * 1.5;
				break;
			case "D0":
				sum += num * 1.0;
				break;
			case "F":
				sum += num * 0.0;
				break;
			case "P":
				all-=num;
				break;
			}
			i++;
		}
		
		System.out.printf("%.6f", sum / (float) all);
	}
}
