import java.util.ArrayList;
import java.util.List;

public class SetMatrixZ73 {
	public void setZeros(int[][] matrix){
		List<Integer> line = new ArrayList<Integer>();
		List<Integer> row = new ArrayList<Integer>();
		int lines = matrix.length;
		int rows = matrix[0].length;
		for(int i = 0; i < lines; i++){
			for(int j = 0; j < rows; j++){
				int num = matrix[i][j];
				if(num == 0){
					line.add(i);
					row.add(j);
				}
			}
		}
		for(int i = 0; i < lines; i++){
			for(int j = 0; j < rows; j++){
				if(line.contains(i) || row.contains(j))matrix[i][j]=0;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetMatrixZ73 s = new SetMatrixZ73();
		int[][] matrix = {{0,2,3},{4,0,6},{7,8,9}};
		s.setZeros(matrix);
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(matrix[i][j] + "   ");
			}
			System.out.println("");
		}
	}

}
