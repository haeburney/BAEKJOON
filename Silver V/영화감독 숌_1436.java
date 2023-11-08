import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = 666;
        int index = 1;

        if (n > 1) {
            while (n != index) {
                answer++;

                if (String.valueOf(answer).contains("666")) {
                    index++;
                }
            }
        }

        bw.write(String.valueOf(answer) + "\n");
        bw.flush();
        bw.close();


    }
}
