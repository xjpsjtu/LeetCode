
public class RotateImage48 {
	
	public int[][] rotate(int[][] matrix) {
        int n = matrix[0].length;
        int[][] ans = new int[n][n];
        for(int i = 0; i < n; i++){
        	for(int j = 0; j < n; j++){
        		ans[j][n - 1 - i] = matrix[i][j];
        	}
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int n = matrix[0].length;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		RotateImage48 r = new RotateImage48();
		int[][] ans = r.rotate(matrix);
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
