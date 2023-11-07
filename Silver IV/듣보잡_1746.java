import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        HashSet<String> list = new HashSet<>();
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        for (int j = 0; j < m; j++) {
            String input = br.readLine();
            if (list.contains(input)) {
                answer.add(input);
                count++;
            }
        }

        Collections.sort(answer);
        bw.write(String.valueOf(count) + "\n");
        for (String item : answer) {
            bw.write(item + "\n");
        }

        bw.flush();
        bw.close();
    }
}
