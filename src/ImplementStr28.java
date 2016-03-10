
public class ImplementStr28 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ImplementStr28 I = new ImplementStr28();
		String haystack = "abccddefg";
		String needle = "cde";
		System.out.println(I.strStr(haystack, needle));
//		String str = haystack.substring(0, 1);
//		System.out.println(str);
//		System.out.println(str.equals(needle));
	}
	public int strStr(String haystack, String needle){
		int len_h = haystack.length();
		int len_n = needle.length();
		if(len_h == 0 && len_n == 0)return 0;
		if(len_h < len_n)return -1;
		for(int i = 0; i < len_h - len_n + 1; i++){
			String str = haystack.substring(i, i + len_n);
			if(str.equals(needle)){
				return i;
			}
		}
		return -1;
	}
}
