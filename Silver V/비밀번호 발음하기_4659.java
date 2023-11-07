package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            boolean hasVowel = false; // 모음이 있는가
            boolean acceptable = true; // 모음 혹은 자음이 3개 미만인가 & 같은 글자 검사
            String password = br.readLine();

            if (password.equals("end")) {
                break;
            }

            int vowel = 0;
            int consonant = 0;
            // 모음 포함
            for (int i = 0; i < password.length(); i++) {
                int passwordNum = (int) password.charAt(i);
                // 모음 혹은 자음이 3개 연속
                if (passwordNum == 97 || passwordNum == 101 || passwordNum == 105 || passwordNum == 111 || passwordNum == 117) {
                    hasVowel = true;
                    vowel++;
                    consonant = 0;
                } else {
                    vowel = 0;
                    consonant++;
                }

                if (vowel >= 3 || consonant >= 3) {
                    acceptable = false;
                    break;
                }

                if (i < password.length() - 1) {
                    if (password.charAt(i) == password.charAt(i + 1) && passwordNum != 101 && passwordNum != 111) {
                        acceptable = false;
                        break;
                    }
                }
            }

            if (hasVowel == false || acceptable == false) {
                bw.write("<" + password + "> is not acceptable.\n");
            } else {
                bw.write("<" + password + "> is acceptable.\n");
            }

            // 같은 글자가 연속적으로 오면 안 됨, 단 ee와 oo 허용

        }

        bw.flush();
        bw.close();
    }
}
