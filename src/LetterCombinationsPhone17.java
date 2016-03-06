import java.util.*;
public class LetterCombinationsPhone17 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		LetterCombinationsPhone17 l = new LetterCombinationsPhone17();
		System.out.println(l.letterCombinations("567").size());
	}
	public List<String> letterCombinations(String digits){
		List<String> a = new ArrayList<String>();
		if(digits.length() == 0)return a;
		String[] strs = new String[10];
		strs[0] = " ";
		strs[2] = "abc";
		strs[3] = "def";
		strs[4] = "ghi";
		strs[5] = "jkl";
		strs[6] = "mno";
		strs[7] = "pqrs";
		strs[8] = "tuv";
		strs[9] = "wxyz";
		for(int k = 0; k < strs[digits.charAt(0) - '0'].length(); k++){
			String str = "" + strs[digits.charAt(0) - '0'].charAt(k);
			a.add(str);
		}
		for(int i = 1; i < digits.length(); i++){
			char c= digits.charAt(i);
//			System.out.println(c);
			int index = c - '0';
			ArrayList<String> a_new = new ArrayList<String>();
			for(int j = 0; j < a.size(); j++){
				for(int k = 0; k < strs[index].length(); k++){
					String str = a.get(j).toString();
					str += strs[index].charAt(k);
					a_new.add(str);
//					System.out.println(str);
				}
			}
			a = a_new;
		}
		return a;
	}
}
