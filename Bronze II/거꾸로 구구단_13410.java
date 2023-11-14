import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int max = 0;


        for (int i = 1; i <= k; i++) {
            StringBuffer sb = new StringBuffer(String.valueOf(i * n));
            int mul = Integer.valueOf(sb.reverse().toString());
            if (mul > max) {
                max = mul;
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();

    }
}
