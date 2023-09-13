import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = 0, y = 0;
		String[][] arr = new String[5][];

		for (int i = 0; i < arr.length; i++) {
			String[] strArr = br.readLine().split("");
			arr[i] = new String[strArr.length];

			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = strArr[j];
			}
		}
		
		for(int i=0;i<15;i++) {
			for(int j=0;j<5;j++) {
				if(arr[j].length > i) {
					System.out.print(arr[j][i]);
				}
			}
		}

	}
}
