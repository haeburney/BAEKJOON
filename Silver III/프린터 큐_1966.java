import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public int maxValue(Queue<Integer[]> queue) {
        int max = 0;
        for (Integer[] arr : queue) {
            if (max < arr[1]) {
                max = arr[1];
            }
        }

        return max;
    }

    public int fx(Queue<Integer[]> queue, int index) {
        int count = 1; // 정답

        while (true) {
            int maxValue = maxValue(queue);
            Integer value[] = queue.peek();
            
            if (value[1] == maxValue) {
                queue.poll();
                if (value[0] == index) {    // 검색한 위치를 print하면 종료 
                    return count;
                }
                count++;
            } else {
                Integer currentValue[] = queue.poll();
                queue.offer(currentValue);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        Main m = new Main();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int totalDocuments = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());
            Queue<Integer[]> queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < totalDocuments; j++) {
                Integer[] arr = new Integer[2];

                arr[0] = j; // 자리 번호 index
                arr[1] = Integer.parseInt(st.nextToken()); // 중요도
                queue.add(arr);
            }

            int answer = m.fx(queue, index);
            bw.write(String.valueOf(answer) + "\n");

        }

        bw.flush();
        bw.close();
    }
}
