import java.util.ArrayList;
import java.util.List;

public class Nqueen51 {
	public List<List<String>> solveNQueens(int n){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i = 0; i < n; i++){
			List<Integer> sublist = new ArrayList<Integer>();
			sublist.add(i);
			list.add(sublist);
		}
		for(int index = 1; index <= n - 1; index++){
//			System.out.println(index + " round");
			List<List<Integer>> tmplist = new ArrayList<List<Integer>>();
			for(int i = 0; i < list.size(); i++){
				List<Integer> sublist = list.get(i);
//				System.out.println(sublist + " fetched");
				for(int j =  0; j < n; j++){
//					System.out.println("add? " + j);
					boolean flag = true;
					int len = sublist.size();
					for(int k = 0; k < sublist.size(); k++){
						int x = sublist.get(k).intValue();
						if(Math.abs(x - j) == Math.abs(len - k)){
							flag = false;
//							System.out.println("Can't add " + j);
						}
					}
					if(!sublist.contains(j) && flag){	
						List<Integer> newlist = new ArrayList<Integer>(sublist);
						newlist.add(j);
						tmplist.add(newlist);
//						System.out.println("new list " + tmplist);
					}
				}	
			}
			list = tmplist;
		}
//		System.out.println(list);
		List<List<String>> strlist = new ArrayList<List<String>>();
		for(int i = 0; i < list.size(); i++){
			List<Integer> sublist = list.get(i);
			List<String> substrlist = new ArrayList<String>();
			for(int j = 0; j < n; j++){
				int num = sublist.get(j).intValue();
				StringBuilder s = new StringBuilder();
				for(int k = 0; k < n; k++){
					if(k == num)s.append('Q');
					else s.append('.');
					
				}
				substrlist.add(s.toString());
			}
			strlist.add(substrlist);
		}
		return strlist;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nqueen51 n = new Nqueen51();
		System.out.println(n.solveNQueens(8));
	}

}
