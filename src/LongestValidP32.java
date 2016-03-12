import java.util.*;
public class LongestValidP32 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		LongestValidP32 l = new LongestValidP32();
		String str = new String("");
		System.out.println(l.longestValidParentheses(str));
	}
	public int longestValidParentheses(String s){
		if(s.length() == 0)return 0;
		int max_len = 0;
		int len = 0;
		int num_left = 0; //当前(的存量，存量为0来一个)的话判输
		ArrayList<String> A = new ArrayList<String>();
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if(ch == '('){
				A.add(Character.toString(ch));
				num_left++;
			}else if(ch == ')' && num_left == 0){
				A.add(Character.toString(ch));
			}else if(ch == ')' && num_left > 0){
				for(int j = A.size() - 1; j > 0; j--){
					String tmp = A.get(j);
					if(tmp.equals("(")){
//						System.out.println("Get!");
						A.set(j, "#");
						break;
					}
				}
			}
		}
		for(int i = 0; i < A.size(); i++){
			String tmp = A.get(i);
//			System.out.println("A_" + i + " = " + tmp);
			if(tmp.equals("#")){
				len++;
			}else{
				//System.out.println("Now len = " + len);
				max_len = max_len > len ? max_len : len;
				//System.out.println("max_len is updated to" + max_len);
				len = 0;
				continue;
			}
		}
		max_len = max_len > len ? max_len : len;
		return max_len * 2;
	}
}
