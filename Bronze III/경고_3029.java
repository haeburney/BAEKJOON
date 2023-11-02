package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public String calculateTimeDifference(String currentTime, String bomb) {
        int ctHours = Integer.parseInt(currentTime.substring(0, 2));
        int ctMinutes = Integer.parseInt(currentTime.substring(3, 5));
        int ctSeconds = Integer.parseInt(currentTime.substring(6, 8));

        int bHours = Integer.parseInt(bomb.substring(0, 2));
        int bMinutes = Integer.parseInt(bomb.substring(3, 5));
        int bSeconds = Integer.parseInt(bomb.substring(6, 8));

        int secondsDiff = (bSeconds - ctSeconds + 60) % 60;
        if (bSeconds - ctSeconds < 0) {
            bMinutes--;
        }
        int minutesDiff = (bMinutes - ctMinutes + 60) % 60;
        if (bMinutes - ctMinutes < 0) {
            bHours--;
        }
        int hoursDiff = (bHours - ctHours + 24) % 24;

        String timeFormat = String.format("%02d:%02d:%02d", hoursDiff, minutesDiff, secondsDiff);
        
        if (hoursDiff == 0 && minutesDiff == 0 && secondsDiff == 0) {
            timeFormat = "24:00:00";
        }
        

        return timeFormat;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String currentTime = br.readLine();
        String bomb = br.readLine();

        Main m = new Main();
        String answer = m.calculateTimeDifference(currentTime, bomb);
        System.out.println(answer);
    }
}

