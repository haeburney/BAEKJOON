import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void push(int x, Stack<Integer> stack) {
        stack.push(x);
    }

    public static int pop(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            return -1;
        }
    }

    public static int size(Stack<Integer> stack) {
        return stack.size();
    }

    public static int isEmptyStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int peekX(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            return -1;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] str = input.split(" ");

            switch (str[0]) {
                case "1":
                    push(Integer.parseInt(str[1]), stack);
                    break;
                case "2":
                    bw.write(String.valueOf(pop(stack)) + "\n");
                    break;
                case "3":
                    bw.write(String.valueOf(size(stack)) + "\n");
                    break;
                case "4":
                    bw.write(String.valueOf(isEmptyStack(stack)) + "\n");
                    break;
                case "5":
                    bw.write(String.valueOf(peekX(stack)) + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}
