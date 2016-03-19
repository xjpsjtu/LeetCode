import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum39 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		CombinationSum39 c = new CombinationSum39();
		int[] nums = {2,3,6,7};
		int target = 7;
		System.out.println(c.combinationSum(nums, target));
	}
	public List<List<Integer>> combinationSum(int[] candidates, int target){
		Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getResult(result, new ArrayList<Integer>(), candidates, target, 0);

        return result;
    }

    private void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start){
        if(target > 0){
            for(int i = start; i < candidates.length && target >= candidates[i]; i++){
                cur.add(candidates[i]);
                getResult(result, cur, candidates, target - candidates[i], i);
                cur.remove(cur.size() - 1);
            }//for
        }//if
        else if(target == 0 ){
            result.add(new ArrayList<Integer>(cur));
        }//else if
    }
}
