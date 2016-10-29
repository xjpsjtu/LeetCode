import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNum65 {
	public boolean isNumber(String s){
//		if(s == "0")return true;
		s = s.trim();
		Pattern pattern1 = Pattern.compile("^[1-9][0-9]*\\u002E[0-9]*[1-9]"); //123.04
		Matcher matcher1 = pattern1.matcher(s);
		Pattern pattern2 = Pattern.compile("^0\\u002E[0-9]*[1-9]"); //0.
		Matcher matcher2 = pattern2.matcher(s);
		Pattern pattern3 = Pattern.compile("^[1-9][0-9]*"); //ÕûÊı
		Matcher matcher3 = pattern3.matcher(s);
		Pattern pattern4 = Pattern.compile("0");
		Matcher matcher4 = pattern4.matcher(s);
		return matcher1.matches() || matcher2.matches() || matcher3.matches() || matcher4.matches();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidNum65 v = new ValidNum65();
		System.out.println(v.isNumber("1"));
	}

}
