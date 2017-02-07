import java.util.ArrayList;
import java.util.List;

public class Combinations77 {
	public List<List<Integer>> combine2(int n, int k) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		for(int i = 1; i <= n; i++){
			List<Integer> seed = new ArrayList<Integer>();
			seed.add(i);
			list.add(seed);
//			System.out.println("."+seed);
		}
		
		for(int i = 1; i < k; i++){
			List<List<Integer>> tmplist = new ArrayList<List<Integer>>();
			tmplist.addAll(list);
			for(int j = 0; j < tmplist.size(); j++){
				List<Integer> seed = tmplist.get(j);
//				System.out.println(".."+seed);
				int max = seed.get(seed.size() - 1);
				if(max < n){
					for(int x = max + 1; x <= n; x++){
						List<Integer> leaf = new ArrayList<Integer>();
						leaf.addAll(seed);
						leaf.add(x);
						list.add(leaf);
//						System.out.println("..."+leaf);
					}
				}
				list.remove(seed);
			}
		}
		return list;
	}
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> seed = new ArrayList<Integer>();
		for(int i = 1; i <= k; i++){
			seed.add(i);
		}
		list.add(seed);
		boolean flag = false;
		do{
			for(int i = k - 1; i >= 0; i--){
				int num = seed.get(i);
				for(int newnum = num + 1; newnum <= n; newnum++){
					boolean f = true;
					for(int j = 0; j < i; j++){
						if(seed.get(j) == newnum){
							f = false;
							break;
						}
					}
					if(f){
						List<Integer> leaf = new ArrayList<Integer>();
						leaf.addAll(seed);
						lea
					}
				}
			}
		}while(flag);
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combinations77 c = new Combinations77();
		List<List<Integer>> list = c.combine2(20, 16);
		System.out.println(list);
	}

}
