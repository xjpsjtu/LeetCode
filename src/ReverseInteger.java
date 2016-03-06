
public class ReverseInteger {
	public long reverse(long x){
		if(x == 0)return 0;
		if(x < 0)return -1 * reverse(-x);
		String s = x + "";
		char[] ch = s.toCharArray();
		String ans = new String();
		for(int i = s.length() - 1; i > -1; i--){
			ans += ch[i];
		}
		return Integer.parseInt(ans);
	}
	public String reverse2(String s){
		if(s.charAt(0) == '-'){
			return '-' + reverse2(s.substring(1, s.length()));
		}else{
			char[] ch = s.toCharArray();
			String ans = new String();
			for(int i = s.length() - 1; i > -1; i--){
				ans += ch[i];
			}
			return ans;
		}
	}
	public long reverse3(long x){
		if(x == 0)return 0;
		if(x < 0)return -1 * reverse3(-x);
		String s = x + "";
		char[] ch = s.toCharArray();
		String ans = new String();
		for(int i = s.length() - 1; i > -1; i--){
			ans += ch[i];
		}
		long l = Long.parseLong(ans);
		return l;
	}
	public int reverse4(int x){
		int result = 0;
        while(x != 0)
        {
            int newResult = result*10 + x%10;
            if((newResult - x%10)/10 != result)
                return 0; 
            x = x/10;
            result = newResult;
        }
        return result;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ReverseInteger r = new ReverseInteger();
		System.out.println(r.reverse4(324351));
	}
}
