import java.util.ArrayList;
import java.util.List;

public class NqueenII52 {
	public int totalNQueens(int n){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i = 0; i < n; i++){
			List<Integer> sublist = new ArrayList<Integer>();
			sublist.add(i);
			list.add(sublist);
		}
		for(int i = 1; i < n; i++){
			List<List<Integer>> tmplist = new ArrayList<List<Integer>>();
			for(int j = 0; j < list.size(); j++){
				List<Integer> sublist = list.get(j);
				for(int k = 0; k < n; k++){
					boolean flag = true;
					int len = sublist.size();
					for(int index = 0; index < sublist.size(); index++){
						int x = sublist.get(index).intValue();
						if(Math.abs(x - k) == Math.abs(len - index)){
							flag = false;
						}
					}
					if(!sublist.contains(k) && flag){	
						List<Integer> newlist = new ArrayList<Integer>(sublist);
						newlist.add(k);
						tmplist.add(newlist);
					}
				}
			}
			list = tmplist;
		}
//		System.out.println(list);
		return list.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NqueenII52 n = new NqueenII52();
		System.out.println(n.totalNQueens(5));
	}

}
