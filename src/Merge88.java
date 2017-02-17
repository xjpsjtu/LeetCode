import java.util.ArrayList;
import java.util.List;

public class Merge88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while(i <= m - 1 || j <= n - 1){
        	System.out.println(i + "," + j);
        	if(i == m){
        		list.add(nums2[j]);
        		j++;
        		continue;
        	}else if(j == n){
        		list.add(nums1[i]);
        		i++;
        		continue;
        	}
        	int num1 = nums1[i];
        	int num2 = nums2[j];
        	if(num1 <= num2){
        		list.add(num1);
        		i++;
        	}else{
        		list.add(num2);
        		j++;
        	}
        }
        for(int k = 0; k < m + n; k++){
        	nums1[k] = list.get(k);
        }
    }
	public void print(int[] num){
		for(int i = 0; i < num.length; i++){
			System.out.print(num[i] + ",");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {1,3,5,7,9,-1,-1,-1,-1,-1};
		int[] num2 = {2,4,6,8,10};
		Merge88 m = new Merge88();
		m.merge(num1, 5, num2, num2.length);
		m.print(num1);
	}

}
