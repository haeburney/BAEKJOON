import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	/**
	 * 쌍 검사 
	 * @param n
	 * @param m
	 * @return
	 */
	public static int pair(int n, int m) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if ((i * i + j * j + m) % (i * j) == 0 && i != j) {
					count++;
					// 쌍으로 이루어진 것들만 count 해주기 
				}
			}
		}
		// (1,2) (2,1) 이렇게 짝 2개씩 count되니까 2로 나눠준 값을 return 하기
		return count / 2;
	}

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int answer = pair(n, m);
			bw.write(String.valueOf(answer) + "\n");
		}

		bw.flush();
		bw.close();
	}
}
