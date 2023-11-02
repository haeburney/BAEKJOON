package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        String answer = "";
        
        while(true) {
            input = br.readLine();
            
            if(input.equals("END")) {
                break;
            }
            
            StringBuffer cReverse = new StringBuffer(input);
            answer += cReverse.reverse().toString() + "\n";
        }
        
        System.out.print(answer);
    }
}

