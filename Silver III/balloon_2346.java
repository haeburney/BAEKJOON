import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class balloon_2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 배열 크기, 배열은 각각 값 받기
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        int[] answer = new int[n];
        int index = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < list.length - 1; i++) {
            int num = list[index]; // list[index] 값을 num으로 가져와 num 수만큼 이동하기
            list[index] = 0;
            answer[i] = index + 1;

            int k = 0;
            while (k < Math.abs(num)) { // 0이라면 건너 뛸거임
                System.out.println("k :" + k);
                if (num > 0) { // num이 양수라면 오른쪽으로
                    if (index + 1 >= list.length) { // index가 배열 크기보다 커지면 줄여주기
                        index -= list.length;
                    }

                    if (list[index + 1] != 0) { // 값이 있다면 count
                        k++;
                        index++;
                    } else { // 값이 0이니 건너 뛰기
                        index++;
                    }
                } else { // num이 음수라면 왼쪽으로

                    if (index - 1 < 0) {
                        index += list.length; // index가 0보다 작다면 더해주기
                    }
                    if (list[index - 1] != 0) { // 값이 있다면 count
                        k++;
                        index--;
                    } else { // 값이 0이니 건너 뛰기
                        index--;
                    }
                }
            }
        }
        answer[answer.length - 1] = index + 1; // 마지막 방 (흠 do while를 썼어야 했나)

        for (int i = 0; i < answer.length; i++) { // 답 출력
            System.out.print(answer[i] + " ");
        }
    }
}
