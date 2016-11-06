
public class Sqrt69 {
	public int mySqrt(int x){
		if(x == 0)return 0;
//		if(x == 2147395600) return 46340;
		int a = 0;
		int square = 0;
		while(square <= x){
			a++;
			if(a + 1 >= Integer.MAX_VALUE / (a + 1))return a;
			square = (a + 1) * (a + 1);
		}
		return a;
//		int a = 1;
//		int dur = 3;
//		for(int i = 1; i <= x - 1; i++){
//			dur--;
//			if(dur > 0){
//				continue;
//			}else{
//				a++;
//				dur = (a + 1) * (a + 1) - a * a;
//			}
//		}
//		return a;
	}
	public int find(int start, int end, int x){
		if(start >= end)return start;
		int middle = (start + end)/2;
		if(middle * middle < x){
			if(start == middle)return start;
			return find(middle, end, x);
		}else if(middle * middle > x){
			return find(start, middle, x);
		}else return middle;
	}
	public static void main(String[] args){
		Sqrt69 s = new Sqrt69();
//		for(int i = 0; i < 20; i++){
//			System.out.println(i + " : " + s.mySqrt(i));
//		}
		System.out.println(s.mySqrt(2147483646));
		System.out.println(Integer.MAX_VALUE);
	}
}
