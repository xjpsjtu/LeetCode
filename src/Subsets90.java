import java.util.ArrayList;
import java.util.List;

public class Subsets90 {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(nums.length == 0){
        	List<List<Integer>> list = new ArrayList<List<Integer>>();
        	list.add(new ArrayList<Integer>());
        	return list;
        }
        if(nums.length == 1){
        	List<List<Integer>> list = new ArrayList<List<Integer>>();
        	List<Integer> ll = new ArrayList<Integer>();
        	ll.add(nums[0]);
        	list.add(ll);
        	list.add(new ArrayList<Integer>());
        	return list;
        }
        int head = nums[0];
//        System.out.println("head = " + head);
        List<List<Integer>> with_h = new ArrayList<List<Integer>>();
        List<List<Integer>> without_h = new ArrayList<List<Integer>>();
        int[] r = new int[nums.length - 1];
        for(int i = 1; i < nums.length; i++){
        	r[i - 1] = nums[i];
        }
        with_h = subsetsWithDup(r);
        for(int i = 0; i < with_h.size(); i++){
        	List<Integer> l = with_h.get(i);
        	l.add(head);
        }
//        System.out.println("with head " + head + ": " + with_h);
        int L = nums.length - 1;
        for(int i = 1; i < nums.length; i++){
        	if(nums[i] == head)L--;
        }
        int[] r2 = new int[L];
        int index = 0;
        for(int i = 1; i < nums.length; i++){
//        	System.out.println("In for " + head);
//        	System.out.print("nums[i] = " + nums[i]);
        	if(nums[i] == head)continue;
        	else{
        		r2[index] = nums[i];
        		index++;
        	}
        }
//        for(int i = 0; i < r2.length; i++){
//        	System.out.print(r2[i] + ",");
//        }
        without_h = subsetsWithDup(r2);
//        System.out.println("without head " + head + ": " + without_h);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans.addAll(with_h);
        ans.addAll(without_h);
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,2};
		Subsets90 s = new Subsets90();
		System.out.println(s.subsetsWithDup(nums));
	}

}
