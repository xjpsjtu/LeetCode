
public class ClimbingStairs70 {
	public int climbStairs(int n){
		int a = 1;
		int b = 2;
		int c = 0;
		for(int i = 1; i <= n - 2; i++){
			c = a + b;
			a = b;
			b = c;
		}
		if(n == 1)return 1;
		if(n == 2)return 2;
		else return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClimbingStairs70 c = new ClimbingStairs70();
		System.out.println(c.climbStairs(32));
	}

}
