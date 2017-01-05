
public class SortColor75 {
	public void sortColors(int[] nums) {
        int zNum = 0, oNum = 0, tNum = 0;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] == 0)zNum++;
        	else if(nums[i] == 1)oNum++;
        	else if(nums[i] == 2)tNum++;
        }
        for(int i = 0; i < zNum; i++)nums[i] = 0;
        for(int i = 0; i < oNum; i++)nums[zNum + i] = 1;
        for(int i = 0; i < tNum; i++)nums[zNum + oNum + i] = 2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortColor75 s = new SortColor75();
		int[] nums = {0,0,2,1,2,2,1,0};
		s.sortColors(nums);
		for(int i = 0; i < nums.length; i++)System.out.print(nums[i] + ", ");
	}

}
