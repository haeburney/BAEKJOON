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
		Main main = new Main();

		int stick = 64;
		int answer = 0;
		int X = Integer.parseInt(br.readLine());

		if (stick % X != 0) {
			while (stick != 0 && X != 0) {

				if (stick <= X) {
					X -= stick;
					answer++;
				}

				stick /= 2;
			}
		} else {
			answer = 1;
		}
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
}
