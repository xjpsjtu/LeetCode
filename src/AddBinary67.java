
public class AddBinary67 {
	public String addBinary(String a, String b){
		if(a.length() == 0)return b;
		if(b.length() == 0)return a;
		int[] aa = new int[1000];
		int[] bb = new int[1000];
		int j = 0;
		for(int i = a.length() - 1; i >= 0; i--){
			aa[j] = a.charAt(i) - '0';
			j++;
		}
		j = 0;
		for(int i = b.length() - 1; i >= 0; i--){
			bb[j] = b.charAt(i) - '0';
			j++;
		}
		int[] ans = new int[1000];
		int r = 0;
		int u = 0;
		for(int i = 0; i < 1000; i++){
			r = (aa[i] + bb[i] + u) % 2;
			u = (aa[i] + bb[i] + u) / 2;
			ans[i] = r;
		}
		boolean flag = true;
		StringBuilder s = new StringBuilder();
		for(int i = 999; i >= 0; i--){
			if(ans[i] == 0 && flag)continue;
			else{
				flag = false;
				s.append(ans[i]);
			}
		}
		if(flag) return "0";
		return s.toString();
	}
	public int binaryToInteger(String a){
		int len = a.length();
		int x = 1;
		int sum = 0;
		for(int i = len - 1; i >= 0; i--){
			int c = a.charAt(i) - '0';
			sum += c * x;
			x *= 2;
		}
		return sum;
	}
	public String integerToBinary(int a){
		if(a == 0)return "0";
		StringBuilder s = new StringBuilder();
		while(a != 0){
			s.append(a % 2);
			a /= 2;
		}
		String ans = s.toString();
		StringBuilder sb = new StringBuilder();
		for(int i = ans.length() - 1; i >= 0; i--){
			sb.append(ans.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddBinary67 a = new AddBinary67();
		System.out.println(a.addBinary("101", "1"));
	}
	
}
