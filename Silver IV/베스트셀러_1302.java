import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.TreeMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Main m = new Main();
		
		int N = Integer.parseInt(br.readLine());
		TreeMap<String, Integer> map = new TreeMap<>();
		
		for(int i=0;i<N;i++) {
			String book = br.readLine();
			if(map.containsKey(book)) {
				map.put(book, map.get(book)+1);
			} else {
				map.put(book, 1);
			}
		}
		
		int maxValue = Collections.max(map.values());
		
		for(String key : map.keySet()) {
			if(map.get(key)==maxValue) {
				bw.write(key);
				break;
			}
		}
		

		bw.flush();
		bw.close();
	}
}
