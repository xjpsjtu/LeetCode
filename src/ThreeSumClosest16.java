import java.util.*;
public class ThreeSumClosest16 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ThreeSumClosest16 t = new ThreeSumClosest16();
//		int[] nums = {87,6,-100,-19,10,-8,-58,56,14,-1,-42,-45,-17,10,20,-4,13,-17,0,11,-44,65,74,-48,30,-91,13,-53,76,-69,-19,-69,16,78,-56,27,41,67,-79,-2,30,-13,-60,39,95,64,-12,45,-52,45,-44,73,97,100,-19,-16,-26,58,-61,53,70,1,-83,11,-35,-7,61,30,17,98,29,52,75,-73,-73,-23,-75,91,3,-57,91,50,42,74,-7,62,17,-91,55,94,-21,-36,73,19,-61,-82,73,1,-10,-40,11,54,-81,20,40,-29,96,89,57,10,-16,-34,-56,69,76,49,76,82,80,58,-47,12,17,77,-75,-24,11,-45,60,65,55,-89,49,-19,4};
		int[] nums = {0, 1, 2};
		System.out.println(t.threeSumClosest(nums, 0));
	}
	public int threeSumClosest(int[] nums, int target){
		Arrays.sort(nums);
		int len = nums.length;
		int min_gap = Integer.MAX_VALUE;
		int min_sum = 0;
		for(int i = 0; i < len; i++){
			int in_min_gap = Integer.MAX_VALUE;
			int in_min_sum = 0;
			int j = i + 1, k = len - 1;
			while(j < k){
				int sum = nums[i] + nums[j] + nums[k];
				int sum_gap = Math.abs(sum - target);
				if(sum > target){
					k--;
					if(k <= j){
						if(sum_gap <= in_min_gap){
							in_min_gap = sum_gap;
							in_min_sum = sum;
						}
						break;
					}
					if(nums[i] + nums[j] + nums[k] < target){
						int tmp_gap = Math.abs(nums[i] + nums[j] + nums[k] - target);
						if(tmp_gap <= in_min_gap){
							if(tmp_gap < sum_gap){
								in_min_gap = tmp_gap;
								in_min_sum = nums[i] + nums[j] + nums[k];
							}else{
								in_min_gap = sum_gap;
								in_min_sum = sum;
							}
						}
					}
				}else if(sum < target){
					j++;
					if(j >= k){
						if(sum_gap <= in_min_gap){
							in_min_gap = sum_gap;
							in_min_sum = sum;
						}
						break;
					}
					if(nums[i] + nums[j] + nums[k] > target){
						int tmp_gap = Math.abs(nums[i] + nums[j] + nums[k] - target);
						if(tmp_gap <= in_min_gap){
							if(tmp_gap < sum_gap){
								in_min_gap = tmp_gap;
								in_min_sum = nums[i] + nums[j] + nums[k];
							}else{
								in_min_gap = sum_gap;
								in_min_sum = sum;
							}
						}
					}
				}else return target;
			}
			if(in_min_gap < min_gap){
				min_gap = in_min_gap;
				min_sum = in_min_sum;
			}
		}
		return min_sum;
	}
}
