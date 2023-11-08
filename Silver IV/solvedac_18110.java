package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int num = (int) Math.round(n * 0.15); // 15퍼센트 제외하기
        int sum = 0;

        if (n == 0) {
            bw.write(String.valueOf(0));
        } else {
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(arr);

            for (int i = num; i < n - num; i++) {
                sum += arr[i];

            }

            double score = (double) sum / (n - num * 2);

            bw.write(String.valueOf((int) Math.round(score)));
        }

        bw.flush();
        bw.close();

    }


}
