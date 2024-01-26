import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			int num = Integer.parseInt(br.readLine());
			
			if (num == -1) {
				break;
			}

			int sum = 0;
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum += i;
					list.add(i);
				}
			}

			if (sum == num) {
				bw.write(String.valueOf(num + " = "));

				for (int i = 0; i < list.size(); i++) {
					bw.write(String.valueOf(list.get(i)));

					if (i < list.size() - 1) {
						bw.write(" + ");
					}
				}
				bw.write("\n");
			} else {
				bw.write(String.valueOf(num + " is NOT perfect.\n"));
			}


		}

		bw.flush();
		bw.close();
	}
}
