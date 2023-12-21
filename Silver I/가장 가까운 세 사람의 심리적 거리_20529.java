import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            if (N >= 33) {
                bw.write(String.valueOf(0) + "\n");
                continue;
            }
            String[] MBTI = new String[N];

            for (int j = 0; j < MBTI.length; j++) {
                MBTI[j] = st.nextToken();
            }

            int answer = Integer.MAX_VALUE;
            for (int j = 0; j < MBTI.length; j++) {
                for (int k = j + 1; k < MBTI.length; k++) {
                    for (int l = k + 1; l < MBTI.length; l++) {
                        int count = 0;
                        for (int m = 0; m < 4; m++) {
                            count += MBTI[j].charAt(m) != MBTI[k].charAt(m) ? 1 : 0;
                            count += MBTI[k].charAt(m) != MBTI[l].charAt(m) ? 1 : 0;
                            count += MBTI[l].charAt(m) != MBTI[j].charAt(m) ? 1 : 0;
                        }
                        answer = Math.min(answer, count);
                    }
                }
            }
            bw.write(String.valueOf(answer) + "\n");
        }


        bw.flush();
        bw.close();
    }
}
