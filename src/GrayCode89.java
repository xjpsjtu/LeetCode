import java.util.ArrayList;
import java.util.List;

public class GrayCode89 {
	public List<Integer> grayCode(int n) {
        if(n == 0){
        	List<Integer> ans = new ArrayList<Integer>();
        	ans.add(0);
        	return ans;
        }
        if(n == 1){
        	List<Integer> list = new ArrayList<Integer>();
        	list.add(0);
        	list.add(1);
        	return list;
        }else{
        	List<Integer> up = new ArrayList<Integer>();
        	List<Integer> down = new ArrayList<Integer>();
        	up = grayCode(n-1);
        	down = grayCode(n-1);
        	for(int i = 0; i < down.size(); i++){
        		int num = down.get(i);
        		int x = (int)Math.pow(2, n-1);
        		num += x;
        		down.set(i, new Integer(num));
        	}
        	List<Integer> ans = new ArrayList<Integer>();
        	for(int i = 0; i < up.size(); i++){
        		ans.add(up.get(i));
        	}
        	for(int i = down.size() - 1; i >= 0; i--){
        		ans.add(down.get(i));
        	}
        	return ans;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrayCode89 g = new GrayCode89();
		System.out.println(g.grayCode(0));
		
	}

}
