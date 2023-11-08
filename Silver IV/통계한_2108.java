package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long sum = 0;

        int[] arr = new int[n];

        // 값 입력받기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        // 평균 구하기
        int arithmeticMean = (int) Math.round((double) sum / arr.length);

        Arrays.sort(arr);

        bw.write(String.valueOf(arithmeticMean) + "\n"); // [1] 평균
        bw.write(String.valueOf(arr[n / 2]) + "\n"); // [2] 중앙값

        // 최대 최빈값수 count 하기
        int count = 1;
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();

        if (arr.length == 1) { // length가 1일 때
            list.add(arr[0]);
        } else if (arr.length == 2) { // length가 2일 때
            if (arr.length == 2) {
                if (arr[0] == arr[1]) {
                    list.add(arr[0]);
                } else {
                    list.add(arr[0]);
                    list.add(arr[1]);
                }
            }
        } else { // length가 3이상일 때
            // 최빈값 수 구하기
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    count++;
                } else {
                    if (max < count) {
                        max = count;
                    }
                    count = 1;
                }

                if (i == arr.length - 2) {
                    if (max < count) {
                        max = count;
                    }
                }
            }

            // 최빈값 수가 최대인 것들 list에 담기
            count = 1;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    count++;
                } else {
                    if (count == max) {
                        list.add(arr[i]);
                    }
                    count = 1;
                }

                if (i == arr.length - 2) {
                    if (count == max) {
                        list.add(arr[i]);
                    }
                }

            }
        }



        if (list.size() > 0 && list.size() == 1) { // [3] 최빈값 출력
            bw.write(String.valueOf(list.get(0)) + "\n");
        } else {
            Collections.sort(list);
            bw.write(String.valueOf(list.get(1)) + "\n");
        }


        bw.write(String.valueOf(arr[arr.length - 1] - arr[0]) + "\n"); // [4] 최댓값 - 최솟값
        bw.flush();
        bw.close();

    }


}
