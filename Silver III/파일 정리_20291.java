import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < num; i++) {
            String fileName = br.readLine();
            String[] str = fileName.split("\\.");

            if (map.containsKey(str[1])) {
                int count = map.get(str[1]);
                map.put(str[1], count + 1);
            } else {
                map.put(str[1], 1);
            }
        }

        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);

        for (String key : keyList) {
            bw.write(key + " " + String.valueOf(map.get(key)) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
