import java.util.*;
public class GenerateP22 {
	public int match_sum(String s){
		if(s == null)return 0;
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '(')count++;
			else count--;
		}
		return count;
	}
	public int left_p(String s){
		if(s == null)return 0;
		int count  = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '(')count++;
		}
		return count;
	}
	public int right_p(String s){
		if(s == null)return 0;
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == ')')count++;
		}
		return count;
	}
	public List<String> generateParenthesis(int n){
		List<String> l = new ArrayList<String>();
		l.add("");
		boolean flag = true;
		for(int k = 0; k < 2 * n; k++){
//			flag = false;
			List<String> l_tmp = new ArrayList<String>();
			for(int i = 0; i < l.size(); i++){
				String str = l.get(i);
				String s;
				if(left_p(str) < n){
//					flag = true;
					s = str + '(';
					l_tmp.add(s);
					if(match_sum(str) > 0){
						s = str + ')';
						l_tmp.add(s);
					}
				}else if(left_p(str) == n){
					if(right_p(str) < n){
//						flag = true;
						s = str + ')';
						l_tmp.add(s);
					}
				}
			}
			l = l_tmp;
		}
		return l;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		GenerateP22 g = new GenerateP22();
		List<String> l = g.generateParenthesis(5);
		for(int i = 0; i < l.size(); i++){
			System.out.println(l.get(i));
		}
	}
}
