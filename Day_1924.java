package baekjoon;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;


public class Day_1924 {
	public static void main(String args[]) {
		int[] arr=new int[12];
		Scanner sc=new Scanner(System.in);
		int x,y;
		int sum=0;
		
		for(int i=0;i<12;i++) {
			if(i==0|i==2|i==4|i==6|i==7|i==9|i==11) {
				arr[i]=31;
			}
			else if(i==3|i==5|i==8|i==10) {
				arr[i]=30;
			}
			else if(i==1) {
				arr[i]=28;
			}
		}
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x>1) {
			for(int i=0;i<x-1;i++) {
				sum+=arr[i];
			}
		}
		sum+=y;
		sum=sum%7;
		switch(sum) {
		case 1: System.out.print("MON"); break;
		case 2: System.out.print("TUE"); break;
		case 3: System.out.print("WED"); break;
		case 4: System.out.print("THU"); break;
		case 5: System.out.print("FRI"); break;
		case 6: System.out.print("SAT"); break;
		case 0: System.out.print("SUN"); break;
		}
	}

}
