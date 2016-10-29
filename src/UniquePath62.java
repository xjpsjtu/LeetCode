
public class UniquePath62 {
	public int uniquePaths(int m, int n){
		if(m <= 0 || n <= 0)return 0;
		int[][] ans = new int[101][101];
		for(int i = 1; i <= 100; i++){
			ans[i][1] = 1;
			ans[1][i] = 1;
		}
		for(int i = 2; i <= m; i++){
			for(int j = 2; j <= n; j++){
				ans[i][j] = ans[i - 1][j] + ans[i][j - 1];
			}
		}
		return ans[m][n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniquePath62 u = new UniquePath62();
		System.out.println(u.uniquePaths(3, 2));
	}

}
