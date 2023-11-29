import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public double score(int[] arr, int sum) {
        double avg = (double) sum / arr.length;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (avg < arr[i]) {
                count++;
            }
        }

        double answer = (double) count / arr.length * 100;
       
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(br.readLine());
        Main m = new Main();

        for (int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            bw.write(String.format("%.3f%%\n", m.score(arr, sum)));
        }

        bw.flush();
        bw.close();
    }
}
