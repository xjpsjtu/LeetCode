import java.util.*;

public class LongestSubstring3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		LongestSubstring3 l = new LongestSubstring3();
		System.out.println(l.lengthOfLongestSubstring("dddd"));
	}
	public int lengthOfLongestSubstring(String s){
		if(s.length() == 0)return 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Vector<Integer> v = new Vector<Integer>();
		int length = 0;
		int index;
		int start = 0;
		for(index = 0; index < s.length(); index++){
			Character c = s.charAt(index);
			if(map.containsKey(c)){
				v.add(length);
				start = map.get(c) > start ? map.get(c):start;
				length = index - start;
				map.put(c, index);
			}
			else{
				map.put(c, index);
				length++;
			}
//			System.out.println("length = " + length);
		}
//		System.out.println("length = " + length);
		v.add(length);
		int max_length = 0;
		Enumeration<Integer> e  = v.elements();
		while(e.hasMoreElements()){
			int len = e.nextElement();
			if(len > max_length)max_length = len;
		}
		return max_length;
	}
}
