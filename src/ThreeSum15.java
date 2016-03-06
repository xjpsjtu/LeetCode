import java.util.*;
public class ThreeSum15 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ThreeSum15 t = new ThreeSum15();
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(t.threeSum(nums));
	}
	public List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> l = new ArrayList<>();
		if(nums.length < 3 || nums == null)return l;
		Arrays.sort(nums);
		int len = nums.length;
		for(int i = 0; i < len; i++){
			if(i > 0 && nums[i] == nums[i-1])continue;
			int target = 0 - nums[i];
			int j = i + 1, k = len - 1;
			while(j < k){
				if(nums[j] + nums[k] == target){
					l.add(Arrays.asList(nums[i], nums[j], nums[k]));
					while(j < k && nums[j] == nums[j+1])j++;
					while(j < k && nums[k] == nums[k-1])k--;
					j++;
					k--;
				}else if(nums[j] + nums[k] < target){
					j++;
				}else{
					k--;
				}
			}
		}
		return l;
	}
}
