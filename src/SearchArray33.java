
public class SearchArray33 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SearchArray33 s = new SearchArray33();
		int[] nums = {1};
		System.out.println(s.search(nums, 0));
	}
	public int binarysearch(int[] nums, int left, int right, int target){
		if(left > right)return -1;
		int half = (left + right)/2;
		if(nums[half] == target)return half;
		else if(nums[half] < target)return binarysearch(nums, half + 1, right, target);
		else return binarysearch(nums, left, half - 1, target);
	}
	public int pviot_binarysearch(int[] nums, int left, int right, int target){
		if(left > right)return -1;
		if(nums[left] < nums[right])return binarysearch(nums, left, right, target);
		int half = (left + right)/2;
		if(nums[left] == target)return left;
		else if(nums[left] < target){
			if(nums[half] == target)return half;
			else if(nums[half] > target)return binarysearch(nums, left, half, target);
			else{
				if(nums[half] > nums[left])return pviot_binarysearch(nums, half + 1, right, target);
				else{
					return pviot_binarysearch(nums, left, half - 1, target);
				}
			}
		}else{
			if(nums[half] == target)return half;
			else if(nums[half] < target)return binarysearch(nums, half, right, target);
			else{
				if(nums[half] < nums[left])return pviot_binarysearch(nums, left, half - 1, target);
				else return pviot_binarysearch(nums, half + 1, right, target);
			}
		}
	}
	public int search(int[] nums, int target){
		return pviot_binarysearch(nums, 0, nums.length - 1, target);
	}
}
