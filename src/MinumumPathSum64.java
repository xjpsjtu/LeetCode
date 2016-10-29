
public class MinumumPathSum64 {
	public int minPathSum(int[][] grid){
		int m = grid.length;
		int n = grid[0].length;
		if(m == 0)return 0;
		int[][] ans = new int[m][n];
		int sum = 0;
		for(int j = 0; j < n; j++){
			sum += grid[0][j];
			ans[0][j] = sum;
		}
		sum = 0;
		for(int i = 0; i < m; i++){
			sum += grid[i][0];
			ans[i][0] = sum;
		}
		for(int i = 1; i < m; i++){
			for(int j = 1; j < n; j++){
				ans[i][j] = Math.min(ans[i-1][j], ans[i][j-1]);
				ans[i][j] += grid[i][j];
			}
		}
		return ans[m-1][n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinumumPathSum64 m = new MinumumPathSum64();
		int[][] grid = {{1,2},{3,4}};
		System.out.println(m.minPathSum(grid));
	}

}
