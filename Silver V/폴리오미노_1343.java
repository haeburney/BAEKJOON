package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String change(String text) {
        String answer = "";

        int length = text.length();
        if (length % 2 == 1) { // 만약 자른 부분들이 홀수라면 -1 반환
            return "-1";
        }

        while (length > 0) {
            if (length % 4 == 0 || ((length - 2) % 4 == 0 && (length - 2) > 0)) { // AAAA부터 먼저 채워주기
                answer += "AAAA";
                length -= 4;

            } else if (length % 2 == 0) { // 그 다음에 BB 채워주기
                answer += "BB";
                length -= 2;
            }
        }

        return answer;
    }

    public String polyomino(String input) {
        String[] arr = input.split("\\.");
        // .은 정규 표현식에서 어떠한 문자와도 매칭되는 와일드카드 문자로 간주되기 때문에 \\.으로 써주면서 .을 기준으로 자른다.
        String answer = "";

        int index = 0;
        int flag = 0;
        String text = "";
        String changeText = "";
        
        while (index < input.length()) {
            if (input.charAt(index) == '.') {
                if (text.length() > 0) {
                    changeText = change(text);
                    if (changeText.equals("-1")) {
                        flag = 1;
                    }
                    answer += change(text);
                }

                text = "";
                answer += ".";
            } else {
                text += String.valueOf(input.charAt(index));
            }

            index++;
        }

        if (text.length() > 0) {
            changeText = change(text);
            if(changeText.equals("-1")) {
                flag = 1; 
            }
            answer += change(text);
        }

        return flag == 0 ? answer : "-1";
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Main m = new Main();
        String answer = m.polyomino(input);

        System.out.println(answer);
    }
}

