import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<Integer, Integer> mapX = new HashMap<>();
		Map<Integer, Integer> mapY = new HashMap<>();

		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(mapX.containsKey(x)) {
				mapX.put(x, (mapX.get(x)+1));
			} else {
				mapX.put(x, 1);
			}
			
			if(mapY.containsKey(y)) {
				mapY.put(y, (mapY.get(y)+1));
			} else {
				mapY.put(y, 1);
			}
		}
		
		for(Integer key: mapX.keySet()) {
			if(mapX.get(key)==1) {
				bw.write(String.valueOf(key)+" ");
			}
		}
		
		for(Integer key: mapY.keySet()) {
			if(mapY.get(key)==1) {
				bw.write(String.valueOf(key));
			}
		}

		bw.flush();
		bw.close();
	}
}
