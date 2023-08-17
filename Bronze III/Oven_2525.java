import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		
		if(n+minute >= 60) {
			if(hour == 23) {
				hour += (minute + n)/60 - 24;
			} else {
				hour += (minute + n)/60;
			}
			
			if(hour >= 24) {
				hour -= 24;
			}
			minute = (minute + n)%60;
		}else {
			minute += n;
		}
		
		System.out.println(hour+" "+minute);
	}

}
