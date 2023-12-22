import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            map.put(input.split(" ")[0], input.split(" ")[1]);
        }

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            bw.write(String.valueOf(map.get(input)) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
