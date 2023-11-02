package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer = 1;

        for (int i = 0; i < input.length(); i++) {
            char str = input.charAt(i);

            switch (str) {
                case 'A':
                    if (answer == 1) {
                        answer = 2;
                    } else if (answer == 2) {
                        answer = 1;
                    }
                    break;
                case 'B':
                    if (answer == 2) {
                        answer = 3;
                    } else if (answer == 3) {
                        answer = 2;
                    }
                    break;
                case 'C':
                    if (answer == 1) {
                        answer = 3;
                    } else if (answer == 3) {
                        answer = 1;
                    }
                    break;
            }
        }

        System.out.println(answer);
    }
}

