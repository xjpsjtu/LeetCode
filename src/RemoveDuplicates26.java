
public class RemoveDuplicates26 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RemoveDuplicates26 r = new RemoveDuplicates26();
		int[] nums = {1,1,2,2,2,4};
		System.out.println(r.removeDuplicates(nums));
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i]+", ");
		}
	}
	public int removeDuplicates(int[] nums){
		if(nums.length == 0)return 0;
		int length = 1;
		int len = 1;
		for(int i = 1; i < nums.length; i++){
			if(nums[i] != nums[i-1]){
				nums[len++] = nums[i];
			}
		}
		return len;
	}
}
