
public class MultiplyString43 {

	public String multiply(String num1, String num2){
		if(num1.length()==0||num2.length()==0)return null;
		int n = num1.length();
		int m = num2.length();
		int[] ans = new int[n + m - 1];
		for(int i = num1.length() - 1; i >= 0; i--){
			for(int j = num2.length() - 1; j >= 0; j--){
				int s = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				ans[i + j] += s;
			}
		}
		for(int i = ans.length - 1; i >= 1; i--){
			ans[i - 1] += ans[i] / 10;
			ans[i] %= 10;
		}
		StringBuffer str = new StringBuffer();
		if(ans[0] >= 10){
			str.append(ans[0] / 10);
			str.append(ans[0] % 10);
			for(int i = 1; i < ans.length; i++){
				str.append(ans[i]);
			}
		}else{
			boolean flag = true;
			for(int i = 0; i < ans.length - 1; i++){
				if(ans[i] == 0&&flag){
					continue;
				}else{
					flag = false;
					str.append(ans[i]);
				}
			}
			str.append(ans[ans.length - 1]);
		}
		return str.toString();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyString43 mul = new MultiplyString43();
		String num1 = "123";
		String num2 = "456";
		System.out.println(mul.multiply(num1, num2));
	}
	
}
