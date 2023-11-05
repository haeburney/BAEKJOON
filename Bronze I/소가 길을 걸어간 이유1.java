import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                if (arr[i][0] == arr[i + 1][0] && arr[i][1] != arr[i + 1][1]) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
