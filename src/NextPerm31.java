import java.util.ArrayList;
import java.util.Arrays;


public class NextPerm31 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		NextPerm31 n = new NextPerm31();
		int[] nums = {4,9,7,5,3,2,1,0};
		n.nextPermutation(nums);
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i] + " ");
		}
	}
	public void nextPermutation(int[] nums){
		int len = nums.length;
		int i;
		boolean flag = true;
		for(i = len - 1; i > 0; i--){
			if(nums[i - 1] < nums[i]){
				int tmp = nums[i - 1];
				int start = i - 1;
				int end = len - 1;
				int tmp_len = end - start;
				for(int j = end; j > start; j--){
					if(nums[j] > tmp){
						nums[start] = nums[j];
						nums[j] = tmp;
						break;
					}
				}
				for(int j = start + 1; j <= start + tmp_len/2; j++){
						tmp = nums[j];
						nums[j] = nums[start + end + 1 - j];
						nums[start + end + 1 - j] = tmp;
				}
				flag = false;
				break;
			}
		}
		if(flag){
			 Arrays.sort(nums);
		}
	}
}
