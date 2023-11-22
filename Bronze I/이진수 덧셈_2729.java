import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            BigInteger a = new BigInteger(st.nextToken(), 2);
            BigInteger b = new BigInteger(st.nextToken(), 2);
            BigInteger sum = a.add(b);
          
            

            String sum_binary = sum.toString(2);
            bw.write(sum_binary + "\n");
        }

        bw.flush();
        bw.close();
    }
}
