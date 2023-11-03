package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // k개의 로프, 중량 w -> w/k 만큼 걸리게 된다.
        // 이 로프들을 이용하여 들어올릴 수 있는 물체의 최대 중량
        // 로프 다 안 써도 됨

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int max = arr[0] * arr.length;
        int currentMin = 0; // index

        // 10 20 20 30 이렇게 배열 정렬을 해주고 
        // 10일 때 최대 40
        // 20일 때 최대 60
        // 30일 때 최대 30 이므로 60출력 
        while (currentMin < arr.length - 1) {
            if (arr[currentMin] != arr[currentMin + 1]) {
                int currentMax = arr[currentMin + 1] * (arr.length - currentMin - 1);
                if (max < currentMax) {
                    max = currentMax;
                }
            }
            currentMin++;
        }

        // arr.length > 1 일때를 안 썼음.. 길이 확인 해주기 
        if (arr.length > 1 && (arr[arr.length - 1] != arr[arr.length - 2])) {
            if (max < arr[arr.length - 1]) {
                max = arr[arr.length - 1];
            }
        }

        System.out.println(max);
    }

}

