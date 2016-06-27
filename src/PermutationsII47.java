import java.util.ArrayList;
import java.util.List;

public class PermutationsII47 {
	
	public List<List<Integer>> permute(int[] nums){
		if(nums.length == 0)return null;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(nums.length == 1){
			List<Integer> l = new ArrayList<Integer>();
			l.add(nums[0]);
			list.add(l);
			return list;
		}else{
			for(int i = 0; i < nums.length; i++){
				int head = nums[i];
				boolean flag = false;
				for(int t = 0; t < i; t++){
					if(nums[t] == head){
						flag = true;
						break;
					}
				}
				if(flag)continue;
				int[] tmp = new int[nums.length - 1];
				int index = 0;
				for(int j = 0; j < nums.length; j++){
					if(j == i)continue;
					else{
						tmp[index] = nums[j];
						index++;
					}
				}
				List<List<Integer>> list_tmp = new ArrayList<List<Integer>>();
				list_tmp = permute(tmp);
				for(int j = 0; j < list_tmp.size(); j++){
					List<Integer> li = list_tmp.get(j);
					li.add(0, head);
					list.add(li);
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutationsII47 p = new PermutationsII47();
		int[] nums = {3,3,0,3};
		List<List<Integer>> list = p.permute(nums);
		System.out.println(list);
	}

}
