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

        int num = Integer.parseInt(br.readLine());
        int arrow = 0;
        int[] array = new int[10000001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (array[input + 1] == 0) {
                array[input]++;
                arrow++;
            } else {
                array[input + 1]--;
                array[input]++;
            }
        }


        bw.write(String.valueOf(arrow));
        bw.flush();
        bw.close();
    }
}
