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

        /*
1차이 1 
2차이 1 1
3차이 1 1 1
4차이 1 2 1
5차이 1 2 1 1
6차이 1 2 2 1
7차이 1 2 2 1 1
8차이 1 2 2 2 1
9차이 1 2 3 2 1
10차이 1 2 3 2 1 1
11차이 1 2 3 2 2 1
12차이 1 2 3 3 2 1
13차이 1 2 3 3 2 1 1
14차이 1 2 3 3 2 2 1
15차이 1 2 3 3 3 2 1
16차이 1 2 3 4 3 2 1
17차이 1 2 3 4 3 2 1 1
18차이 1 2 3 4 3 2 2 1
19차이 1 2 3 4 3 3 2 1
20차이 1 2 3 4 4 3 2 1
21차이 1 2 3 4 4 3 2 1 1
22차이 1 2 3 4 4 3 2 2 1
23차이 1 2 3 4 4 3 3 2 1
24차이 1 2 3 4 4 4 3 2 1
25차이 1 2 3 4 5 4 3 2 1

        */
    }
}
