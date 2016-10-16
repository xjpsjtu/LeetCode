
public class Pow50 {
	public double myPow(double x, int n){
		if(x == 0)return 0;
		if(n == 0)return 1;
		if(x == 1)return 1;
		double[] ans = new double[1001];
		ans[1] = x;
		for(int i = 2; i < 1001; i++){
			ans[i] = ans[i-1] * x;
		}
		int round = n / 1000;
		int radis = n % 1000;
		if(n < 0){
			
		}
		double answ = myPow(x, round);
		for(int i = 1; i <= 1000; i++){
			answ *= answ;
		}
		return answ * ans[radis];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pow50 p = new Pow50();
		double x = 1;
		int n = 3;
		System.out.println(p.myPow(x, n));
	}

}
