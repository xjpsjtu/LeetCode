
public class RemoveElement27 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RemoveElement27 r = new RemoveElement27();
		int[] nums = {1,2,2,2,3,4,5,2,6};
		System.out.println(r.removeElement(nums, 2));
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i]+", ");
		}
	}
	public int removeElement(int[] nums, int val){
		if(nums.length == 0)return 0;
		int len = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != val)nums[len++] = nums[i];
		}
		return len;
	}
}
