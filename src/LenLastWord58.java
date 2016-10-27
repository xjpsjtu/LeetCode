
public class LenLastWord58 {
	public int lengthOfLastWord(String s){
		if(s == " " || s.length() == 0)return 0;
		String[] strings = s.split(" ");
		int length = strings.length;
		if(length == 0)return 0;
		else{
			return strings[length - 1].length();
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LenLastWord58 l = new LenLastWord58();
		String s = " ";
		System.out.println(l.lengthOfLastWord(s));
	}

}
