import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			HashMap<String, Integer> map = new HashMap<>();
			int m = Integer.parseInt(br.readLine());
			int answer = 1;

			for (int j = 0; j < m; j++) {
				String input = br.readLine();
				String type = input.split(" ")[1];

				if (map.containsKey(type)) {
					map.put(type, map.get(type) + 1);
				} else {
					map.put(type, 1);
				}

			}

			if (map.size() > 1) {
				for (String key : map.keySet()) {
					answer *= (map.get(key) + 1);
				}
				answer -= 1;
			} else {
				answer = m;
			}

			bw.write(String.valueOf(answer) + "\n");
		}

		bw.flush();
		bw.close();
	}
}
