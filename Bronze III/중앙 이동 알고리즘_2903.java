import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static int square(int n) {
        if (n == 1) {
            return 3;
        } else {
            return square(n - 1) + (int) Math.pow(2, (n - 1));
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int answer = (int) Math.pow(square(num), 2);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
