
public class ValidSudoku36 {
	int[] nums = new int[10];
	public static void initial(int[] nums){
		for(int i = 0; i < nums.length; i++){
			nums[i] = 0;
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}
	public boolean isValidSudoku(char[][] board){
		initial(nums);
		//�����
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				char ch = board[i][j];
				if(ch == '.')continue;
				int c = ch - '0';
				if(nums[c] != 0)return false;
				else nums[c]++;
			}
			initial(nums);
		}
		initial(nums);
		//�����
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				char ch = board[j][i];
				if(ch == '.')continue;
				int c = ch - '0';
				if(nums[c] != 0)return false;
				else nums[c]++;
			}
			initial(nums);
		}
		initial(nums);
		//��鷽��
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				int r = i / 3 * 3 + j / 3;
				int c = (i % 3) * 3 +  j % 3;
				char ch = board[r][c];
				if(ch == '.')continue;
				int tmp = ch - '0';
				if(nums[tmp] != 0)return false;
				else nums[tmp]++;
			}
			initial(nums);
		}
		return true;
	}
}
