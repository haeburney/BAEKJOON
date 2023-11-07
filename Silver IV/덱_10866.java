package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    /**
     * 정수 X를 덱의 앞에 넣는다.
     * 
     * @param x
     * @param deque
     */
    public void pushFront(int x, Deque<Integer> deque) {
        deque.offerFirst(x);
    }

    /**
     * 정수 X를 덱의 뒤에 넣는다.
     * 
     * @param x
     * @param deque
     */
    public void pushBack(int x, Deque<Integer> deque) {
        deque.offerLast(x);
    }

    /**
     * 덱의 가장 앞에 있는 수 빼기, 없는 경우 -1
     * 
     * @param deque
     * @return
     */
    public int popFront(Deque<Integer> deque) {
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.pollFirst();
        }
    }

    /**
     * 덱의 가장 뒤에 있는 수 빼기, 없는 경우 -1
     * 
     * @param deque
     * @return
     */
    public int popBack(Deque<Integer> deque) {
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.pollLast();
        }
    }

    /**
     * 덱에 들어있는 정수의 개수
     * 
     * @param deque
     * @return
     */
    public int dequeSize(Deque<Integer> deque) {
        return deque.size();
    }

    /**
     * 덱이 비어있으면 1, 아니면 0
     * 
     * @param deque
     * @return
     */
    public int empty(Deque<Integer> deque) {
        if (deque.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * 덱의 가장 앞에 있는 정수 출력, 없는 경우 -1 출력
     * 
     * @param deque
     * @return
     */
    public int viewFront(Deque<Integer> deque) {
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.peekFirst();
        }
    }

    /**
     * 덱의 가장 앞에 있는 정수 출력, 없는 경우 -1 출력
     * 
     * @param deque
     * @return
     */
    public int viewBack(Deque<Integer> deque) {
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.peekLast();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main m = new Main();
        Deque<Integer> deque = new LinkedList<>();

        int num = Integer.parseInt(br.readLine());
        int number;

        for (int i = 0; i < num; i++) {
            String input = br.readLine();
            String[] inputStr = input.split(" ");

            switch (inputStr[0]) {
                case "push_front":
                    m.pushFront(Integer.parseInt(inputStr[1]), deque);
                    break;
                case "push_back":
                    m.pushBack(Integer.parseInt(inputStr[1]), deque);
                    break;
                case "pop_front":
                    number = m.popFront(deque);
                    bw.write(String.valueOf(number) + "\n");
                    break;
                case "pop_back":
                    number = m.popBack(deque);
                    bw.write(String.valueOf(number) + "\n");
                    break;
                case "size":
                    number = m.dequeSize(deque);
                    bw.write(String.valueOf(number) + "\n");
                    break;
                case "empty":
                    number = m.empty(deque);
                    bw.write(String.valueOf(number) + "\n");
                    break;
                case "front":
                    number = m.viewFront(deque);
                    bw.write(String.valueOf(number) + "\n");
                    break;
                case "back":
                    number = m.viewBack(deque);
                    bw.write(String.valueOf(number) + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}
