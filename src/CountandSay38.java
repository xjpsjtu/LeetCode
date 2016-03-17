import java.util.*;

public class CountandSay38 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		CountandSay38 c = new CountandSay38();
		System.out.println(c.countAndSay(7));
	}
	
	public String countAndSay(int n){
		if(n==0)return "1";
		String[] str = new String[100];
		str[0] = "1";
		for(int i = 1; i < n; i++){
			String s = str[i-1];
			String s_now = new String();
//			System.out.println("***"+i+"***");
//			System.out.println("s = " + s + " now");
			char flag = s.charAt(0);
			int val = 0;
			
			for(int j = 0; j < s.length(); j++){
//				System.out.println("loop" + j);
//				System.out.println("flag = " + flag + "  val = " + val);
				if(s.charAt(j) == flag){
					val++;
					if(j == s.length() - 1)s_now = s_now + val + flag;
				}else{
					s_now = s_now + val + flag;
					flag = s.charAt(j);
					val = 1;
					if(j == s.length() - 1){
						s_now = s_now + 1 + flag;
					}
				}
			}
//			System.out.println("s_now = " + s_now + " now");
			str[i] = s_now;
		}
		return str[n-1];
	}
}
