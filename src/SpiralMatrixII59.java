
public class SpiralMatrixII59 {
	public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        if(n == 0)return ans;
        if(n == 1){
        	ans[0][0] = 1;
        	return ans;
        }
        if(n == 2){
        	ans[0][0] = 1;
        	ans[0][1] = 2;
        	ans[1][1] = 3;
        	ans[1][0] = 4;
        	return ans;
        }
        int a = 1;
        for(int j = 0; j < n; j++){
        	ans[0][j] = a;
        	a++;
        }
        for(int i = 1; i < n; i++){
        	ans[i][n - 1] = a;
        	a++;
        }
        for(int j = n - 2; j >= 0; j--){
        	ans[n - 1][j] = a;
        	a++;
        }
        for(int i = n - 2; i > 0; i--){
        	ans[i][0] = a;
        	a++;
        }
        int[][] tmp = generateMatrix(n - 2);
        for(int i = 0; i < n - 2; i++){
        	for(int j = 0; j < n - 2; j++){
        		tmp[i][j] += 4 * n - 4;
        		ans[i + 1][j + 1] = tmp[i][j];
        	}
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiralMatrixII59 s = new SpiralMatrixII59();
		int[][] ans = s.generateMatrix(0);
		for(int i = 0; i < ans.length; i++){
			for(int j = 0; j < ans[0].length; j++){
				System.out.println(ans[i][j]);
			}
		}
	}

}
