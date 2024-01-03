import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int[][] arr;
	public static int one = 0; // 파란색
	public static int zero = 0;// 하얀색

	public boolean colorCheck(int x, int y, int size) {
		int num = arr[x][y];

		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (num != arr[i][j]) {
					return false;
				}
			}
		}

		return true;
	}

	public void partition(int x, int y, int size) {

		if (colorCheck(x, y, size)) {
			if (arr[x][y] == 1) {
				one++;
			} else {
				zero++;
			}
		} else {
			int newSize = size / 2;
			partition(x, y, newSize);
			partition(x + newSize, y, newSize);
			partition(x, y + newSize, newSize);
			partition(x + newSize, y + newSize, newSize);
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Main m = new Main();
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		m.partition(0, 0, N);

		bw.write(String.valueOf(zero + "\n" + one));

		bw.flush();
		bw.close();
	}
}
