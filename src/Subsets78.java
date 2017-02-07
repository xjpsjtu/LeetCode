import java.util.ArrayList;
import java.util.List;

public class Subsets78 {
	public List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> former = new ArrayList<List<Integer>>();
		List<Integer> l = new ArrayList<Integer>();
		former.add(l);
		for(int i = 0; i < nums.length; i++){
			int curn = nums[i];
			List<List<Integer>> cur = new ArrayList<List<Integer>>();
			for(int j = 0; j < former.size(); j++){
				List<Integer> ini_list = former.get(j);
				cur.add(ini_list);
				List<Integer> list_add = new ArrayList<Integer>(ini_list);
				list_add.add(curn);
				cur.add(list_add);
			}
			former = cur;
		}
		return former;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subsets78 s = new Subsets78();
		int[] nums = new int[]{};
		System.out.println(s.subsets(nums));
	}

}
