import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    /**
     * 정수 덱의 앞에 넣기
     * 
     * @param x
     * @param deque
     */
    public static void pushFront(int x, Deque<Integer> deque) {
        deque.offerFirst(x);
    }

    /**
     * 정수 덱의 뒤에 넣기
     * 
     * @param x
     * @param deque
     */
    public static void pushBack(int x, Deque<Integer> deque) {
        deque.offerLast(x);
    }

    /**
     * 맨 앞 정수 빼고 출력
     * 
     * @param deque
     * @return
     */
    public static int popFront(Deque<Integer> deque) {
        if (!deque.isEmpty()) {
            return deque.pollFirst();
        } else {
            return -1;
        }
    }

    /**
     * 맨 뒤 정수 빼고 출력
     * 
     * @param deque
     * @return
     */
    public static int popBack(Deque<Integer> deque) {
        if (!deque.isEmpty()) {
            return deque.pollLast();
        } else {
            return -1;
        }
    }

    /**
     * 덱의 크기
     * 
     * @param deque
     * @return
     */
    public static int size(Deque<Integer> deque) {
        return deque.size();
    }

    /**
     * 덱 비어있으면 1, 아니면 0
     * 
     * @param deque
     * @return
     */
    public static int isEmptyDeque(Deque<Integer> deque) {
        if (deque.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * 덱 맨 앞 정수 읽기
     * 
     * @param deque
     * @return
     */
    public static int getFront(Deque<Integer> deque) {
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.getFirst();
        }
    }

    /**
     * 덱 맨 뒤 정수 읽기
     * 
     * @param deque
     * @return
     */
    public static int getBack(Deque<Integer> deque) {
        if (deque.isEmpty()) {
            return -1;
        } else {
            return deque.getLast();
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] str = input.split(" ");

            switch (str[0]) {
                case "1":
                    pushFront(Integer.parseInt(str[1]), deque);
                    break;
                case "2":
                    pushBack(Integer.parseInt(str[1]), deque);
                    break;
                case "3":
                    bw.write(String.valueOf(popFront(deque)) + "\n");
                    break;
                case "4":
                    bw.write(String.valueOf(popBack(deque)) + "\n");
                    break;
                case "5":
                    bw.write(String.valueOf(size(deque)) + "\n");
                    break;
                case "6":
                    bw.write(String.valueOf(isEmptyDeque(deque)) + "\n");
                    break;
                case "7":
                    bw.write(String.valueOf(getFront(deque)) + "\n");
                    break;
                case "8":
                    bw.write(String.valueOf(getBack(deque)) + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}
