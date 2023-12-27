import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->{
			if(Math.abs(o1) == Math.abs(o2)) {
				return o1-o2;
			} else {
				return Math.abs(o1) - Math.abs(o2);
			}
		});

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int X = Integer.parseInt(br.readLine());

			if (X == 0) {
				if (pq.isEmpty()) {
					bw.write(String.valueOf(0) + "\n");
				} else {
					bw.write(String.valueOf(pq.poll()) + "\n");
				}
			} else {
				pq.offer(X);
			}
		}
		
		bw.flush();
		bw.close();
	}
}
