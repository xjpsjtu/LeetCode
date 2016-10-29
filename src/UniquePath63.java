
public class UniquePath63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid){
		int n = obstacleGrid.length;
		if(n == 0)return 0;
		int m = obstacleGrid[0].length;
		int[][] ans = new int[n][m];
		int index = m;
		for(int i = m - 1; i >= 0; i--){
			if(obstacleGrid[0][i] == 1)index = i;
		}
		for(int i = 0; i < index; i++){
			ans[0][i] = 1;
		}
		for(int i = index; i < m; i++){
			ans[0][i] = 0;
		}
		index = n;
		for(int i = n - 1; i >= 0; i--){
			if(obstacleGrid[i][0] == 1)index = i;
		}
		for(int i = 0; i < index; i++){
			ans[i][0] = 1;
		}
		for(int i = index; i < n; i++){
			ans[i][0] = 0;
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				if(obstacleGrid[i][j] == 1)ans[i][j] = 0;
			}
		}
		for(int i = 1; i < n; i++){
			for(int j = 1; j < m; j++){
				if(obstacleGrid[i][j] == 1)continue;
				int x = obstacleGrid[i - 1][j];
				int y = obstacleGrid[i][j - 1];
				ans[i][j] = (1-x) * ans[i - 1][j] + (1-y) * ans[i][j - 1];
			}
		}
		return ans[n-1][m-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniquePath63 u = new UniquePath63();
		int[][] obstacle = {{0,0},{0,1}};
		System.out.println(u.uniquePathsWithObstacles(obstacle));
	}

}
