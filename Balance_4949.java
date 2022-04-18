package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Balance_4949 {
	public static String input;
	public static Stack<Character> stack=new Stack<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		while(true) {
			input=br.readLine();
			
			if(input.equals(".")) {
				break;
			}
			stack.clear();
			sb.append(balance(input)).append('\n');
		}
		System.out.println(sb);
	}
	
	public static String balance(String s) {
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			if(c=='(' || c=='[') {
				stack.push(c);
			}
			else if(c==')') {
				if(stack.empty()||stack.peek()!='(') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			else if(c==']') {
				if(stack.empty()||stack.peek()!='[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
		}
		
		if(stack.empty()) {
			return "yes";
		}else {
			return "no";
		}
	}
}
