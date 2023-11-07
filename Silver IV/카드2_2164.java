package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }

        boolean check = false; // true면 keep, false면 버리기
        while (queue.size() > 1) {
            if (check) {
                int num = queue.poll();
                queue.add(num);
                check = false;
            } else {
                queue.poll();
                check = true;
            }
        }

        bw.write(String.valueOf(queue.peek()));
        bw.flush();
        bw.close();
    }
}
