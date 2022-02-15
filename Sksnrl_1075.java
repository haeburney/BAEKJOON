package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Sksnrl_1075 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int F=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		
		int num=N;
		while(num>0) {
			arr.add(num%10);
			num/=10;
		}
		int two=arr.get(0)+arr.get(1)*10;
		
		int sum;
		
		if(two-(N%F)<0) {
			sum=two+(F-(N%F));
		}
		else {
			sum=two-(N%F);
			while(sum>=F) {
				sum-=F;
			}
		}
		
		System.out.format("%02d",sum);
	}
}
