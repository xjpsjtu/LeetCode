import java.util.*;
public class Roman2Integer13 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Roman2Integer13 r = new Roman2Integer13();
		String s = "CM";
		System.out.println(r.romanToInt(s));
	}
	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		char[] ch = s.toCharArray();
		//System.out.println(ch[0]);
		if(s.length() == 1){
			return map.get(ch[0]);
		}
		int num = 0;
		int sign = 1;
		//System.out.println("h");
		for(int i = s.length() - 1; i > 0; i--){
			//System.out.println(i+":"+ch[i]+"="+map.get(ch[i]));
			num += sign * map.get(ch[i]);
			if(map.get(ch[i-1]) < map.get(ch[i])){
				sign = -1;
			}else{
				sign = 1;
			}
		}
		if(map.get(ch[0]) < map.get(ch[1])){
			num -= map.get(ch[0]);
		}else{
			num += map.get(ch[0]);
		}
		return num;
    }
}
