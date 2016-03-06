import java.util.*;
public class IntegertoRoman12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		IntegertoRoman12 I = new IntegertoRoman12();
		System.out.println(I.intToRoman(3999));
	}
	public String intToRoman(int num){
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		map.put('I', 1);
//		map.put('V', 5);
//		map.put('X', 10);
//		map.put('L', 50);
//		map.put('C', 100);
//		map.put('D', 500);
//		map.put('M', 1000);
		String str = "";
		int d = num % 10; //个位数
		int c = (num / 10) % 10;  //十位数
		int b = (num / 100) % 10;  //百位数
		int a = (num / 1000) % 10;  //千位数
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "");
		map.put(1, "M");
		map.put(2, "MM");
		map.put(3, "MMM");
		str += map.get(a);
		map.clear();
		map.put(0, "");
		map.put(1, "C");
		map.put(2, "CC");
		map.put(3, "CCC");
		map.put(4, "CD");
		map.put(5, "D");
		map.put(6, "DC");
		map.put(7, "DCC");
		map.put(8, "DCCC");
		map.put(9, "CM");
		str += map.get(b);
		map.clear();
		map.put(0, "");
		map.put(1, "X");
		map.put(2, "XX");
		map.put(3, "XXX");
		map.put(4, "XL");
		map.put(5, "L");
		map.put(6, "LX");
		map.put(7, "LXX");
		map.put(8, "LXXX");
		map.put(9, "XC");
		str += map.get(c);
		map.clear();
		map.put(0, "");
		map.put(1, "I");
		map.put(2, "II");
		map.put(3, "III");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(6, "VI");
		map.put(7, "VII");
		map.put(8, "VIII");
		map.put(9, "IX");
		str += map.get(d);
		return str;
	}
}
