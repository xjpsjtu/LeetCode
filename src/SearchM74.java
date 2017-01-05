import java.util.ArrayList;
import java.util.List;

public class SearchM74 {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length == 0)return false;
        List l = new ArrayList<Integer>();
        for(int i = 0; i < matrix.length; i++){
        	for(int j = 0; j < matrix[0].length; j++){
        		l.add(matrix[i][j]);
        	}
        }
        return find(l,target);
    }
	public boolean find(List<Integer> list, int tar){
		int start = 0;
		int end = list.size() - 1;
		int mid = (start + end) / 2;
		while(start <= end){
			mid = (start + end) / 2;
			if(list.get(mid) < tar){
				start = mid + 1;
			}else if(list.get(mid) > tar){
				end = mid - 1;
			}else return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchM74 s = new SearchM74();
//		int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		int matrix[][] = {{1}};
		int target = 2;
		System.out.println(s.searchMatrix(matrix, target));
	}

}
