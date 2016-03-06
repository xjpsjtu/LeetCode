
public class LongestCommonPrefix14 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] strs = {"aca", "cba"};
		LongestCommonPrefix14 l = new LongestCommonPrefix14();
		System.out.println(l.longestCommonPrefix(strs));
//		System.out.println(l.commonPrefix("aca", "cba"));
	}
	public String commonPrefix(String a, String b){
		String str = "";
		for(int i = 0; i < a.length() && i < b.length(); i++){
			//System.out.println(a.charAt(i) + "   " + b.charAt(i));
			if(a.charAt(i) == b.charAt(i))str += a.charAt(i);
			else break;
		}
		return str;
	}
	public String longestCommonPrefix(String[] strs){
		if(strs.length == 0)return "";
		String str = strs[0];
		for(int i = 0; i < strs.length; i++){
//			System.out.println(str + " " + strs[i]);
			str = commonPrefix(str, strs[i]);
		}
		return str;
	}
}
