import java.util.ArrayList;
import java.util.List;

public class PlusOne66 {
	public int[] plusOne(int[] digits){
		int len = digits.length;
		int d = digits[len - 1] + 1;
		int r = d % 10;
		int u = d / 10;
		List<Integer> list = new ArrayList<Integer>();
		list.add(r);
		for(int i = len - 2; i >= 0; i--){
			int newd = digits[i] + u;
			r = newd % 10;
			u = newd / 10;
			list.add(r);
		}
		if(u != 0)list.add(u);
//		System.out.println(list);
		len = list.size();
//		System.out.println(list.get(4));
		int[] ans = new int[len];
		int j = 0;
		for(int i = len - 1; i >= 0; i--){
//			System.out.println("index is " + i);
			ans[j] = list.get(i);
			j++;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusOne66 p = new PlusOne66();
		int[] digits = {1,9,9};
		int[] ans = p.plusOne(digits);
		for(int i = 0; i < ans.length; i++){
			System.out.print(ans[i]);
		}
	}

}
