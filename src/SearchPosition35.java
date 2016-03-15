
public class SearchPosition35 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SearchPosition35 s = new SearchPosition35();
		int[] nums = {1,3,5,6};
		System.out.println(s.searchInsert(nums, 0));
	}
	public int bsearchInsert(int[] nums, int left, int right, int target){
		if(left > right)return left;
		else{
			int mid = (left + right)/2;
			if(nums[mid] == target)return mid;
			else if(nums[mid] < target)return bsearchInsert(nums, mid + 1, right, target);
			else return bsearchInsert(nums, left, right - 1, target);
		}
	}
	public int searchInsert(int[] nums, int target){
		return bsearchInsert(nums, 0, nums.length - 1, target);
	}
}
