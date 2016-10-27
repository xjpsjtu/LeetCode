import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
	public List<Integer> spiralOrder(int[][] matrix){
		List<Integer> ans = new ArrayList<Integer>();
		if(matrix.length == 0 || matrix[0].length == 0)return ans;
		if(matrix[0].length == 1){
			for(int i = 0; i < matrix.length; i++){
				ans.add(matrix[i][0]);
			}
//			System.out.println("ans:" + ans);
			return ans;
		}
		if(matrix.length == 1){
			for(int j = 0; j < matrix[0].length; j++){
				ans.add(matrix[0][j]);
			}
//			System.out.println("ans:" + ans);
			return ans;
		}
		if(matrix[0].length == 2){
			ans.add(matrix[0][0]);
			ans.add(matrix[0][1]);
			for(int i = 1; i < matrix.length; i++){
				ans.add(matrix[i][1]);
			}
			ans.add(matrix[matrix.length - 1][0]);
			for(int i = matrix.length - 2; i > 0; i--){
				ans.add(matrix[i][0]);
			}
//			System.out.println("ans:" + ans);
			return ans;
		}
		if(matrix.length == 2){
			for(int i = 0; i < matrix[0].length; i++){
				ans.add(matrix[0][i]);
			}
			ans.add(matrix[1][matrix[0].length - 1]);
			for(int j = matrix[0].length - 2; j >= 0; j--){
				ans.add(matrix[1][j]);
			}
			return ans;
		}
		for(int j = 0; j < matrix[0].length; j++){
			ans.add(matrix[0][j]);
//			System.out.println(matrix[0][j]);
		}
		for(int i = 1; i < matrix.length; i++){
			ans.add(matrix[i][matrix[0].length - 1]);
//			System.out.println(matrix[i][matrix[0].length - 1]);
		}
		for(int j = matrix[0].length - 2; j >= 0; j--){
			ans.add(matrix[matrix.length - 1][j]);
//			System.out.println(matrix[matrix.length - 1][j]);
		}
		for(int i = matrix.length - 2; i > 0; i--){
			ans.add(matrix[i][0]);
//			System.out.println(matrix[i][0]);
		}
		int[][] tmp = new int[matrix.length - 2][matrix[0].length - 2];
		for(int i = 0; i < matrix.length - 2; i++){
			for(int j = 0; j < matrix[0].length - 2; j++){
				tmp[i][j] = matrix[i+1][j+1];
			}
		}
		List<Integer> tmplist = spiralOrder(tmp);
		ans.addAll(tmplist);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] array = {};
		SpiralMatrix54 s = new SpiralMatrix54();
		System.out.println(s.spiralOrder(array));
	}

}
