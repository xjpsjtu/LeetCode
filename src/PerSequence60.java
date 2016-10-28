
public class PerSequence60 {
	public String getPermutation(int n, int k){
		StringBuilder s = new StringBuilder();
		for(int i = 1; i<= n; i++){
			s.append(i);
		}
		String ans = s.toString();
		for(int i = 1; i < k; i++){
			ans = getNext(ans);
		}
		return ans;
	}
	public String getNext(String s){
		String ans = s;
		int len = s.length();
		for(int i = len - 1; i >= 0; i--){
			int j = i - 1;
			if( j == -1){
				return s;
			}else{
				if(s.charAt(j) - s.charAt(i) < 0){
					StringBuilder sb = new StringBuilder();
					for(int k = len - 1; k >= i; k--){
						if(s.charAt(k) - s.charAt(j) < 0)continue;
						else{
							for(int t = 0; t < j; t++){
								sb.append(s.charAt(t));
							}
							sb.append(s.charAt(k));
							for(int t = len - 1; t > k; t--){
								sb.append(s.charAt(t));
							}
							sb.append(s.charAt(j));
							for(int t = k - 1; t >= i; t--){
								sb.append(s.charAt(t));
							}
							break;
						}
					}
					ans = sb.toString();
					break;
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerSequence60 p = new PerSequence60();
//		System.out.println(p.getNext("94765321"));
		System.out.println(p.getPermutation(8, 8590));
	}

}
