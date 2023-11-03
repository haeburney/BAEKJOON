package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public int tip(int tipMoney, int index) {
        int tipCoin = tipMoney - index;
        return tipCoin < 0 ? 0 : tipCoin;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 알바생 강호 팁을 받는다......
        // 원래 10을 줄려고 했는데 (받은 등수 -1) 만큼 강호에게 준다.
        // 예를들어 5등으로 받았다면 10 - (5-1) = 6을 받게 된다.
        // 만약 음수면 팁은 0을 받는다. (받은 등수 -1) <= (주려했던 팁) 이라면 팁은 받을 수 없다.

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        long answer = 0;
        Main m = new Main();


        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);


        for (int i = 0; i < arr.length; i++) {
            answer += m.tip(arr[arr.length-i-1],i);
        }

        System.out.println(answer);
    }

}
