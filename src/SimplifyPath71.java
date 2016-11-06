import java.util.Stack;

public class SimplifyPath71 {
	public String simplifyPath(String path){
//		if(path.equals("/"))return "/";
		String[] p = path.split("/");
		Stack<String> s = new Stack<String>();
		for(int i = 0; i < p.length; i++){
			String str = p[i];
//			System.out.println(str);
//			System.out.println("Now the str1 is " + str + ".");
			if(str.equals("."))continue;
			else if(str.equals("..")){
				if(s.empty())continue;
				else s.pop();
			}
			else if(str.length() > 0)s.push(str);
		}
		Stack<String> s2 = new Stack<String>();
		while(!s.isEmpty()){
			String str = s.peek();
			s2.push(str);
			s.pop();
		}
//		System.out.println("----");
		StringBuilder sb = new StringBuilder();	
		if(s2.size() == 0)return "/";
		while(!s2.isEmpty()){
			String str = s2.peek();
//			System.out.println("Now the str is " + str + "+++");
			sb.append("/");
			sb.append(str);
//			System.out.println(str);
			s2.pop();
//			if(!s2.empty())sb.append("/");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplifyPath71 s = new SimplifyPath71();
		System.out.println(s.simplifyPath("///"));
	}

}
