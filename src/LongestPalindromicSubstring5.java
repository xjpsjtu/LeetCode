
public class LongestPalindromicSubstring5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		LongestPalindromicSubstring5 l = new LongestPalindromicSubstring5();
		System.out.println(l.longestPalindrome("baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
//		System.out.println(l.isPal("abccdccba"));
	}
	public boolean isPal(String str){
		boolean bol = true;
		for(int i = 0; i < str.length(); i++){
			int j = str.length() - 1 - i;
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
		}
		return bol;
	}
	public String longestPalindrome(String s){
		int max_length = 0;
		int len = 0;
		int max_i = 0;
		int max_j = 0;
		for(int i = 0; i < s.length(); i ++){
			for(int j = i; j < s.length(); j++){
				String str = s.substring(i, j + 1);
				int length = str.length();
//				System.out.println("str = " + str + " length = " + length + " max_length = " + max_length);
				if(isPal(str) && length > max_length){
					max_length = length;
					max_i = i;
					max_j = j;
				}
			}
		}
		return s.substring(max_i, max_j + 1);
	}
	public String longestPalindrome2(String s){
		boolean[][] flag = new boolean[1000][1000];
		int len = s.length();
		int max_length = 0;
		int max_i = 0;
		int max_j = 0;
		for(int i = 0; i < 1000; i++){
			for(int j = 0; j < 1000; j++){
				if(i >= j){
					flag[i][j] = true;
				}
			}
		}
		for(int j = 1; j < len; j++){
			for(int i = j - 1; i >= 0; i--){
				if(s.charAt(i) == s.charAt(j)){
					flag[i][j] = flag[i + 1][j - 1];
					if(flag[i][j] == true && j - i + 1 > max_length){
						max_i = i;
						max_j = j;
						max_length = j - i + 1;
					}
				}
				else flag[i][j] = false;
			}
		}
		return s.substring(max_i, max_j + 1);
	}
}
