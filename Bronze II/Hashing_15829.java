package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    /**
     * 정수로 제곱하기
     * 
     * @param base
     * @param exponent
     * @param mod
     * @return
     */
    public static long power(int base, int exponent, long mod) { // 31, i, 1234567891 
        if (exponent == 0) {
            return 1;
        }
        
        long half = power(base, exponent / 2, mod);
        long result = (half * half) % mod;
        if (exponent % 2 == 1) {
            result = (result * base) % mod;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        long answer = 0;
        long mod = 1234567891;
        int base = 31;
        

        for (int i = 0; i < n; i++) {
            int num = (int) input.charAt(i) - 96;
            answer = (answer + (num * power(base, i, mod)) % mod) % mod;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();

    }
    
    /*
    long mod = 1234567891;
    일반적으로 알고리즘에서 모듈로 연산하는 경우, 소수가 사용되며 1234567891은 소수에 해당된다.
    소수를 사용하면서 해시 함수와 같은 알고리즘에서 충돌을 줄이고 해시 값의 분포를 균일하게 만드는 데 도움이 될 수 있다.
    int base = 31;
    모통 문자열 해싱에서 사용되는 기본 값 중 하나로, 문자열을 해싱할 때 충돌을 줄이는 데 효과적인 값이다.

    */
}
