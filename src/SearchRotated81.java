
public class SearchRotated81 {
	public boolean search(int[] nums, int target){
		if(nums.length == 0 || nums == null)return false;
		return rotsearch(0, nums.length - 1, nums, target);
	}
	public boolean binsearch(int left, int right, int[] nums, int target){
//		System.out.println("binary: " + left + "," + right);
		if(left > right)return false;
		int mid = (left + right) / 2;
		if(nums[mid] == target)return true;
		else if(nums[mid] > target){
			right = mid - 1;
			return binsearch(left, right, nums, target);
		}else{
			left = mid + 1;
			return binsearch(left, right, nums, target);
		}
	}
	public boolean rotsearch(int left, int right, int[] nums, int target){
//		System.out.println("rotated: " + left + "," + right);
		if(left > right)return false;
		if(nums[right] > nums[left])return binsearch(left, right, nums, target);
		int mid = (left + right) / 2;
		if(nums[mid] > nums[left]){
			if(nums[mid] > target){
				if(nums[left] <= target)return binsearch(left, mid, nums, target);
				if(nums[left] > target)return rotsearch(mid + 1, right, nums, target);
			}else if(nums[mid] < target){
				return rotsearch(mid + 1, right, nums, target);
			}else return true;
		}else if(nums[mid] < nums[left]){
			if(nums[mid] > target)return rotsearch(left, mid - 1, nums, target);
			else if(nums[mid] < target){
				if(nums[right] < target)return rotsearch(left, mid - 1, nums, target);
				else if(nums[right] > target) return binsearch(mid + 1, right, nums, target);
				else return true;
			}else return true;
		}else{
			if(nums[mid] == target)return true;
			if(nums[mid] > nums[right]){
				return rotsearch(mid + 1, right, nums, target);
			}else{
				return rotsearch(mid + 1, right, nums, target)||rotsearch(left, mid - 1, nums, target);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchRotated81 s = new SearchRotated81();
		int[] nums = new int[]{2,2,2,0,2,2};
		int target = 0;
		System.out.println(s.search(nums, target));
	}

}
