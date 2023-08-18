import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		String input = br.readLine();
		int answer = input.length();

		// switch로도 되지만 case 65,66,67: 
		// 백준은 인식을 못함
		for(int i=0; i<input.length();i++) {
			int num = (int)input.charAt(i);
			
			if(65<=num && num<=67) {
				answer+=2;
			} else if (68<=num && num<=70) {
				answer+=3;
			}else if (71<=num && num<=73) {
				answer+=4;
			}else if (74<=num && num<=76) {
				answer+=5;
			}else if (77<=num && num<=79) {
				answer+=6;
			}else if (80<=num && num<=83) {
				answer+=7;
			}else if (84<=num && num<=86) {
				answer+=8;
			}else if (87<=num && num<=90) {
				answer+=9;
			}
		}
		
		System.out.println(answer);
	}
}
