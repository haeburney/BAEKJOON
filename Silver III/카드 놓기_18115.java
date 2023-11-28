import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N]; // 카드 원래 순서를 담을 배열
        int[] input = new int[N]; // 입력값

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken()); // 입력하기
        }

        // 인덱스 값 잡아주기
        int index1 = 0;
        int index2 = 1;
        int index3 = N - 1;

        for (int i = 0, j = N; i < N; i++, j--) {
            switch (input[i]) {
                case 1:
                    list[index1] = j;
                    index2++;
                    index1 = index2 - 1;
                    break;
                case 2:
                    list[index2] = j;
                    index2++;
                    break;
                case 3:
                    list[index3] = j;
                    index3--;
                    break;
            }
        }


        for (int i = 0; i < list.length; i++) {
            bw.write(String.valueOf(list[i]) + " ");
        }

        bw.flush();
        bw.close();
    }
}
