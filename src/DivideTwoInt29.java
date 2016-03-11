
public class DivideTwoInt29 {

	public static void main(String[] args) {

	}

	public int divide(int dividend, int divisor){
		int sign = 1;
		if((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
			sign = -1;
		long ldividend = Math.abs((long)dividend);
		long ldivisor = Math.abs((long)divisor);
		if(ldivisor == 0)return Integer.MAX_VALUE;
		if(ldividend == 0 || ldividend < ldivisor)return 0;
		long ans = ldivide(ldividend, ldivisor);
		if(ans > Integer.MAX_VALUE){
			return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE; 
		}else{
			return (int)(sign * ans);
		}
	}
	public long ldivide(long ldividend, long ldivisor){
		if(ldividend < ldivisor)return 0;
		long sum = ldivisor;
		long ans = 1;
		while((sum + sum) <= ldividend){
			sum += sum;
			ans += ans;
		}
		ans += ldivide(ldividend - sum, ldivisor);
		return ans;
	}
}
