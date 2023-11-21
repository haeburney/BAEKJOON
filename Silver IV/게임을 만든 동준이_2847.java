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
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= arr[i + 1]) {
                int num = arr[i] - arr[i + 1] + 1;
                sum += num;
                arr[i] -= num;
            }
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
