
public class Jump55 {
	public boolean canJump2(int[] nums){
		int len = nums.length;
		if(len <= 0)return false;
		if(len == 1)return true;
		int[] ans = new int[len - 1];
		if(nums[len - 2] > 0)ans[len - 2] = Math.min(len - 1, nums[len - 2] + len - 2);
		else{
			ans[len - 2] = len - 2;
		}
		for(int i = len - 3; i >= 0; i--){
//			System.out.println("i:" + i);
			int max = ans[i + 1];
			if(nums[i] == 0){
				ans[i] = i;
//				System.out.println("ans[i]:" + ans[i]);
			}else{
				int step = nums[i];
				int maxmax = i + step;
				for(int k = 1; k <= step; k++){
					if(ans[Math.min(i + k, len - 2)] > maxmax)maxmax = ans[i + k];
				}
				ans[i] = Math.min(maxmax, len - 1);
			}
			
		}
		for(int i = 0; i < ans.length; i++){
			System.out.println(ans[i]);
		}
		if(ans[0] == len - 1)return true;
		else return false;
		
	}
	public boolean canJump(int[] nums){
		int len = nums.length;
		int step = nums[0];
		int start = 0;
		int cur = 0;
		while(step > 0){
			if(cur + step >= len - 1)return true;
			int maxcur = 0;
			int maxend = -1;
			for(int i = cur + 1; i <= cur + step; i++){
				if(i + nums[i] > maxend){
					maxcur = i;
					maxend = i + nums[i];
				}
			}
			cur = maxcur;
			step = nums[cur];
		}
		if(cur >= len - 1)return true;
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,4,0,2,0,1,0,1,0};
		Jump55 j = new Jump55();
		System.out.println(j.canJump2(array));
	}

}
