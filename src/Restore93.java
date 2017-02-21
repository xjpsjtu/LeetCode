import java.util.ArrayList;
import java.util.List;

public class Restore93 {
	public List<String> restoreIpAddresses(String s) {
        return restoreByN(s, 3);
    }
	//split a string with n, each part is less than 255
	public List<String> restoreByN(String s,int n){
		List<String> list = new ArrayList<String>();
		if(s.length() <= n)return list;
		if(n < 0)return list;
		if(n == 0){
			if(s.charAt(0) == '0' && s.length() > 1)return list;
			if(s.length() >= 4)return list;
			else{
				if(Integer.parseInt(s) <= 255)list.add(s);
			}
			return list;
		}
		if(s.length() == 0)return list;
		if(s.length() == 1){
			list.add(s);
			return list;
		}
		if(s.length() == 2){
			if(n == 1){
				String str = s.charAt(0) + "." + s.charAt(1);
				list.add(str);
				return list;
			}
		}
//		System.out.println("see " + s);
//		System.out.println("see " + s.charAt(0));
//		System.out.println((int)s.charAt(0) == 2);
		if(s.charAt(0) == '0'){
			List<String> list1 = restoreByN(s.substring(1), n-1);
			for(int i = 0; i < list1.size(); i++){
				String str = list1.get(i);
				str = "0." + str;
				list.add(str);
			}
			return list;
		}else if(s.charAt(0) == '1'){
			List<String> list1 = restoreByN(s.substring(1), n-1);
			List<String> list2 = restoreByN(s.substring(2), n-1);
			List<String> list3 = restoreByN(s.substring(3), n-1);
			for(int i = 0; i < list1.size(); i++){
				String str = list1.get(i);
				str = "1." + str;
				list.add(str);
			}
			for(int i = 0; i < list2.size(); i++){
				String str = list2.get(i);
				str = "1" + s.charAt(1) + "." + str;
				list.add(str);
			}
			for(int i = 0; i < list3.size(); i++){
				String str = list3.get(i);
				str = s.substring(0, 3)+ "." + str;
				list.add(str);
			}
			return list;
		}else if(s.charAt(0) == '2'){
//			System.out.println(2);
//			System.out.println(2);
			List<String> list1 = restoreByN(s.substring(1), n-1);
			List<String> list2 = restoreByN(s.substring(2), n-1);
			for(int i = 0; i < list1.size(); i++){
				String str = list1.get(i);
				str = "2." + str;
				list.add(str);
			}
			for(int i = 0; i < list2.size(); i++){
				String str = list2.get(i);
				str = "2" + s.charAt(1) + "." + str;
				list.add(str);
			}
			
			if(s.substring(0,3).compareTo("255")<=0){
//				System.out.println(s);
				List<String> list3 = restoreByN(s.substring(3), n-1);
				for(int i = 0; i < list3.size(); i++){
					String str = list3.get(i);
					str = s.substring(0, 3)+ "." + str;
					list.add(str);
				}
			}
			return list;
		}
		else{
			List<String> list1 = restoreByN(s.substring(1), n-1);
			List<String> list2 = restoreByN(s.substring(2), n-1);
			for(int i = 0; i < list1.size(); i++){
				String str = list1.get(i);
				str = s.charAt(0) + "." + str;
				list.add(str);
			}
			for(int i = 0; i < list2.size(); i++){
				String str = list2.get(i);
				str = s.substring(0,2) + "." + str;
				list.add(str);
			}
			return list;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restore93 r = new Restore93();
		String s = "3";
		System.out.println(r.restoreByN(s,0));
//		System.out.println(Integer.parseInt(s.substring(0,3)));
	}

}
