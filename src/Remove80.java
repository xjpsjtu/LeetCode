import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Remove80 {
	public int removeDuplicates(int[] nums){
		Arrays.sort(nums);
		int len = nums.length;
		if(len == 0 || nums == null)return 0;
		List<Integer> list = new LinkedList<Integer>();
		int cur = nums[0];
		int j = 0;
		for(int i = 0; i < len; i++){
			if(nums[i] == cur){
				j++;
				if(j <= 2){
					list.add(nums[i]);
				}
			}else{
				list.add(nums[i]);
				cur = nums[i];
				j = 1;
			}
		}
		for(int i = 0; i < list.size(); i++){
			nums[i] = list.get(i);
		}
//		System.out.println(list);
		return list.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove80 r = new Remove80();
		int nums[] = new int[]{1,3,1,2,2,1};
		System.out.println(r.removeDuplicates(nums));
	}

}
