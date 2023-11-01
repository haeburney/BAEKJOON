package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    // 정수 x를 큐에 넣기
    public int pushNum(Queue<Integer> queue, int num) {
        queue.offer(num);
        return num;
    }

    // 큐에서 가장 앞에 있는 정수 출력, 없을 경우 -1 출력
    public int getFront(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return -1;
        } else {
            return queue.peek();
        }
    }

    // 큐의 가장 뒤에 있는 정수 출력, 없을 경우 -1 출력
    public int getBack(Queue<Integer> queue, int back) {
        if (queue.isEmpty()) {
            return -1;
        } else {
            return back;
        }
    }

    // 큐에 들어있는 정수의 개수
    public int getSize(Queue<Integer> queue) {
        return queue.size();
    }

    // 큐가 비어있으면 1, 아니라면 0
    public int getEmpty(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    // 큐 삭제하기
    public int popFront(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return -1;
        } else {
            return queue.poll();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();
        int current = 0;
        Main queueCalc = new Main();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("\\s");

            switch (input[0]) {
                case "push":
                    current = queueCalc.pushNum(queue, Integer.parseInt(input[1]));
                    break;
                case "front":
                    bw.write(queueCalc.getFront(queue) + "\n");
                    break;
                case "back":
                    bw.write(queueCalc.getBack(queue, current) + "\n");
                    break;
                case "size":
                    bw.write(queueCalc.getSize(queue) + "\n");
                    break;
                case "empty":
                    bw.write(queueCalc.getEmpty(queue) + "\n");
                    break;
                case "pop":
                    bw.write(queueCalc.popFront(queue) + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();

    }
}
