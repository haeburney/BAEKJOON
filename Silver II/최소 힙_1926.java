import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		// 높은 숫자가 우선
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int X = Integer.parseInt(br.readLine());

			if (X == 0) {
				// 큰 값 출력 후 제거하기
				if (pq.isEmpty()) {
					bw.write(String.valueOf(0) + "\n");
				} else {
					bw.write(String.valueOf(pq.poll()) + "\n");
				}
			} else {
				// 값 넣기
				pq.offer(X);
			}
		}
		
		bw.flush();
		bw.close();
	}
}
