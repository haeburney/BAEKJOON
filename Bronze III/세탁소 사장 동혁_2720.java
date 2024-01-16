import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int C = Integer.parseInt(br.readLine());
			int[] arr = new int[4];

			while (C > 0) {
				if (C >= 25) {
					arr[0] = C / 25;
					C = C % 25;
				} else if (C >= 10) {
					arr[1] = C / 10;
					C = C % 10;
				} else if (C >= 5) {
					arr[2] = C / 5;
					C = C % 5;
				} else {
					arr[3] = C;
					C = C % 1;
				}
			}
			bw.write(String.valueOf(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + "\n"));
		}

		bw.flush();
		bw.close();
	}
}
