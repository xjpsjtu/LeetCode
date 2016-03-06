public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        if(x<10)return true;
        int cnt = 0;
        int d = 1;
        int a = x;
        while(a/10 > 0){
            a = a/10;
            cnt++;
            d *= 10;
        }
        a = x;
        int b = x;
        for(int i = 0; i < cnt; i++){
            int high = a / d;
            int low = b % 10;
            //System.out.println("a = " + a);
            //System.out.println("high = " + high);
            //System.out.println("low = " + low);
            //System.out.println("----------");
            if(high != low)return false;
           else{
                a -= high * d;
                b /= 10;
                d /= 10;
            }
        }
        return true;
    }
    public static void main(String[] args){
    	Solution sol = new Solution();
    	System.out.println(sol.isPalindrome(1237321));
    }
}