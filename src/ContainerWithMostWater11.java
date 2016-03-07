
public class ContainerWithMostWater11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public int min(int a, int b){
		return a < b ? a : b;
	}
	public int maxArea(int[] height) {
	    int left = 0, right = height.length - 1;
	    int maxArea = 0;

	    while (left < right) {
	        maxArea = Math.max(maxArea, Math.min(height[left], height[right])
	                * (right - left));
	        if (height[left] < height[right])
	            left++;
	        else
	            right--;
	    }

	    return maxArea;
	}
}
	
