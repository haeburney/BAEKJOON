import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[n];
        int stackNum = 1;
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            while (true) {
                if (stack.empty()) {
                    stack.push(stackNum);
                    stackNum++;
                    sb.append("+\n");
                } else if (stack.peek() != num) {
                    stack.push(stackNum);
                    stackNum++;
                    sb.append("+\n");
                }

                if (stack.peek() == num) {
                    sb.append("-\n");
                    stack.pop();
                    break;
                }

                if (stackNum > num) {
                    sb = new StringBuilder("NO");
                    check = true;
                    break;
                }
            }

            if (check) {
                break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
