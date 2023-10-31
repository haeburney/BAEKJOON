package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class caress_1669 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long monkey = Integer.parseInt(st.nextToken()); // 원숭이 키
        long dog = Integer.parseInt(st.nextToken());    // 강아지 키
        long subtract = dog - monkey;                   // 키 차이 

        long sqrt = (long) Math.floor(Math.sqrt(subtract)); // 키 차이의 제곱근
        subtract -= sqrt*sqrt;  // 키 차이 - 제곱근^2 

        long answer = sqrt>0 ? sqrt * 2 - 1 : 0;    // 만약 원숭이와 강아지의 키 차이가 0이면 answer 0 설정

        if (subtract > sqrt) {  // 한 제곱근과 다음 제곱근 사이의 중간보다 뒤에 있으면
            answer += 2;
        } else if (subtract > 0 && subtract <= sqrt) {  // 한 제곱근과 다음 제곱근 사이의 중간보다 앞에 있으면
            answer += 1;
        }
        System.out.println(answer);

    }
}
