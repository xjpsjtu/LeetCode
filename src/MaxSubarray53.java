
public class MaxSubarray53 {
	public int maxSubArray(int[] nums){
		int len = nums.length;
		int[] ans = new int[len];
		ans[len - 1] = nums[len - 1];
//		System.out.println("1:" + ans[len - 1]);
		int index = len - 2;
		while(index >= 0){
			if(ans[index + 1] < 0){
				ans[index] = nums[index];
			}else{
				ans[index] = nums[index] + ans[index + 1];
			}
			index--;
		}
//		print(ans);
		int max = ans[0];
		for(int i = 0; i < len; i++){
			if(ans[i] > max)max = ans[i];
		}
		return max;
	}
	
	public void print(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + ",");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {-2};
		MaxSubarray53 m = new MaxSubarray53();
		System.out.println(m.maxSubArray(array));
	}
}
