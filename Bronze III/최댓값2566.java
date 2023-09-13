import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x=0,y=0;
		int[][] arr=new int[9][9];
		
		for(int i=0;i<arr.length;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int max=arr[0][0];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
					x=i;
					y=j;
				}
			}
		}
		
		System.out.println(max+"\n"+(x+1)+" "+(y+1));
	}
}
