package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 해독하는 함수
    public char decode(String input) {
        int[] number = new int[26]; // 영어 알파벳은 26개

        for (int i = 0; i < input.length(); i++) {
            char search = input.charAt(i);

            if ((int) search != 32) { // 아스키코드는 a=97 이므로 97를 빼서 해당하는 값을 하나씩 증감시킨다.
                number[((int) search) - 97]++;
            }
        }

        int check = 0;
        int max = 0;
        int index = -1;

        for (int i = 0; i < number.length; i++) { // 최댓값과 그때의 index를 구하기
            if (max < number[i]) {
                max = number[i];
                index = i;
            }
        }

        for (int i = 0; i < number.length; i++) { // 만약 최댓값이 여러개라면 check++를 해주기
            if (max == number[i]) {
                check++;
            }
        }

        // check=1이면 max가 1, 아니라면 2 이상이다.
        return check > 1 ? '?' : (char) (index + 97);
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        char[] answer = new char[num];
        Main m = new Main();

        for (int i = 0; i < answer.length; i++) {
            String input = br.readLine();
            answer[i] = m.decode(input);
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }
}

