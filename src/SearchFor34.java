
public class SearchFor34 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SearchFor34 s = new SearchFor34();
		int[] nums = {1,2,3,5,5,5,5,5,5,5,5,7,8};
		System.out.println(s.searchRange(nums, 5)[0]+ "  " + s.searchRange(nums, 5)[1]);
	}
	public int[] bsearchRange(int[] nums, int left, int right, int target){
		int[] ans = {-1,-1};
		while(left < right){
			int mid = (left + right)/2;
			if(target < nums[mid])return bsearchRange(nums, left, mid - 1, target);
			else if(target > nums[mid])return bsearchRange(nums, mid + 1, right, target);
			else{
				int a = findMax(nums, left, mid, target);
				int b = findMin(nums, mid, right, target);
				ans[0] = a;
				ans[1] = b;
			}
		}
		return ans;
	}
	public int findMax(int[] nums, int left, int right, int target){
		int ans = right;
		while(left < right){
			int mid = (left + right)/2;
			if(nums[mid] < target)return findMax(nums, mid, right, target);
			else if(nums[mid] == target) return findMax(nums, left, mid, target);
		}
		return ans;
	}
	public int findMin(int[] nums, int left, int right, int target){
		int ans = left;
		while(left < right){
			int mid = (left + right)/2;
			if(nums[mid] > target)return findMin(nums, left, mid, target);
			else if(nums[mid] == target)return findMin(nums, mid, right, target);
		}
		return ans;
	}
	public int[] searchRange(int[] nums, int target){
		return bsearchRange(nums, 0, nums.length - 1, target);
	}
}
