package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문어 강강술래
        // 서로 같은 손을 잡아야 함, 한 문어와 둘 이상의 손을 잡을 수 없다, 한 손으로 여러 문어의 손을 잡을 수 없다.

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }

        if (arr.length % 2 == 1) {
            arr[arr.length - 1] = 3;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

