import java.util.*;
public class ValidParentheses20 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ValidParentheses20 v = new ValidParentheses20();
		System.out.println(v.isValid("]"));
	}
	public boolean isMatch(char a, char b){
		if((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'))return true;
		else return false;
	}
	public boolean isValid(String s){
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if(ch == '(' || ch == '[' || ch == '{'){
				stack.push(ch);
				continue;
			}else if(ch == ')' || ch == ']' || ch == '}'){
				if(stack.empty())return false;
				char up_ch = stack.peek();
				if(isMatch(up_ch, ch))stack.pop();
				else return false;
			}
		}
		if(stack.empty())return true;
		else return false;
	}
	
}
