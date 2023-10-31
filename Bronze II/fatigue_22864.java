package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class fatigue_22864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int fatigue = Integer.parseInt(st.nextToken());
        int work = Integer.parseInt(st.nextToken());
        int rest = Integer.parseInt(st.nextToken());
        int maxFatigue = Integer.parseInt(st.nextToken());

        int currentFatigue = 0;
        int sumWork = 0;

        for (int i = 0; i < 24; i++) {

            if (currentFatigue + fatigue <= maxFatigue) {
                currentFatigue += fatigue;
                sumWork += work;
            } else {
                currentFatigue -= rest;
                if (currentFatigue < 0) {
                    currentFatigue = 0;
                }
            }
        }

        System.out.println(sumWork);
    }
}
