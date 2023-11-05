import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int n = Integer.parseInt(br.readLine());
       
        if(n%2==1) {
            bw.write("SK");
        } else {
            bw.write("CY");
        }
       
        bw.flush();
        bw.close();
    }
}
