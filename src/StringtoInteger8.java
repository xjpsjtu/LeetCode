
public class StringtoInteger8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		StringtoInteger8 s = new StringtoInteger8();
		System.out.println(s.myAtoi2("2147483648"));
	}
	public int myAtoi(String str){
		if(str.length() == 0)return 0;
		int ret = 0;
		int sign = 1;
		boolean bol = false;
		boolean set = true; //判断是否可以设置符号
		int pos = 0;
		int nag = 0;
		int tmp = 0;
		char[] ch = str.toCharArray();
		for(int i = 0; i < str.length(); i++){
			if(ch[i] == ' ')continue;
			if(ch[i] == '-' && set){
				nag ++;
			}
			if(ch[i] == '+' && set){
				pos ++;
			}
			if(ch[i] >= '0' && ch[i] <= '9') {
				bol = true;
				set = false;
				tmp = ret;
				ret *= 10;
				ret += ch[i] - '0';
				if((ret - (ch[i] - '0'))/10 != tmp){
					if(sign == 1)return 2147483647;
					else return -2147483648;
				}
			}
		}
		if(pos > nag || (pos == 0 && nag == 0))sign = 1;
		else if(pos < nag)sign = -1;
		else sign = 0;
		//System.out.println("pos = " + pos + " nag = " + nag);
		if(bol){
			return ret * sign;
		}else{
			return 0;
		}
	}
	public int myAtoi2(String str){
		if(str.length() == 0)return 0;
		int sign = 1;
		int ret = 0;
		int tmp = 0;
		int index = 0;
		while(str.charAt(index) == ' ' && index < str.length())
			index ++;
		if(str.charAt(index) == '+' || str.charAt(index) == '-'){
			sign = str.charAt(index) == '+' ? 1:-1;
			index ++;
		}
		while(index < str.length()){
			if(str.charAt(index) >= '0' && str.charAt(index) <= '9'){
				if(Integer.MAX_VALUE/10 <  ret || Integer.MAX_VALUE/10 == ret && Integer.MAX_VALUE %10 < (str.charAt(index) - '0'))
		            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
				ret *= 10;
				ret += str.charAt(index) - '0';
			}else break;
			index ++;
		}
//		System.out.println("sign = " + sign);
//		System.out.println("tmp = " + tmp);
//		System.out.println("tmp->" + (tmp * 10 + 8));
//		System.out.println((ret - 8) / 10);
//		System.out.println("ret = " + ret);
		return ret * sign;
	}
}
