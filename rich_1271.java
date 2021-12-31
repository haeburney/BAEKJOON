package baekjoon;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.*;

public class rich_1271 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		BigInteger A=sc.nextBigInteger();
		BigInteger B=sc.nextBigInteger();
		sc.close();
		System.out.println(A.divide(B));
		System.out.println(A.remainder(B));
	}
}
