import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams49 {
	public List<List<String>> groupAnagrams(String[] strs){
		List<List<String>> list = new ArrayList<List<String>>();
		
		for(int i = 0; i < strs.length; i++){
			String str = strs[i];
			System.out.println(str+str.length());
			if(list.size() == 0){
				List<String> liststring = new ArrayList<String>();
				liststring.add(str);
				list.add(liststring);
				System.out.println(liststring);
			}else{
				boolean flag = true;
				for(int j = 0; j < list.size(); j++){
					List<String> liststring = list.get(j);
					String start = liststring.get(0);
					System.out.println(start+start.length());
					if(isAna(start,str)){
						liststring.add(str);
						flag = false;
						System.out.println(liststring);
					}
				}
				if(flag){
					List<String> liststring = new ArrayList<String>();
					liststring.add(str);
					list.add(liststring);
				}
			}
		}
		System.out.println(list.size());
		return list;
	}
	public boolean isAna(String s1, String s2){
		if(s1.length() != s2.length())return false;
		if(s1 == "" && s2 == "")return true;
		int len = s1.length();
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		HashMap<Character, Integer>h1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer>h2 = new HashMap<Character, Integer>();
		for(int j = 0; j < len; j++){
			Character c = s1.charAt(j);
			if(h1.containsKey(c)){
				int value = h1.get(c).intValue() + 1;
				h1.remove(c);
				h1.put(c, value);
			}else{
				h1.put(c, 0);
			}
			c = s2.charAt(j);
			if(h2.containsKey(c)){
				int value = h2.get(c).intValue() + 1;
				h2.remove(c);
				h2.put(c, value);
			}else{
				h2.put(c, 0);
			}
		}
		return compareMapByKeySet(h1, h2);
	}
	public boolean compareMapByKeySet(HashMap<Character,Integer> map1,HashMap<Character,Integer> map2){    
        if(map1.size()!=map2.size()){    
            return false;  
        }  
        Integer tmp1;  
        Integer tmp2;  
        boolean b=false;         
        for(Character key:map1.keySet()){  
            if(map2.containsKey(key)){  
                tmp1=map1.get(key);  
                tmp2=map2.get(key);  
                  
                if(null!=tmp1 && null!=tmp1){   
                      
                    if(tmp1.equals(tmp2)){  
                        b=true;  
                        continue;  
                    }else{  
                        b=false;  
                        break;  
                    }        
                }else if(null==tmp1 && null==tmp2){    
                    b=true;  
                    continue;  
                }else{  
                    b=false;  
                    break;  
                }    
            }else{  
                b=false;  
                break;  
            }     
        }  
        return b;  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagrams49 a = new Anagrams49();
		String[] strs = {"",""};
		System.out.println(a.groupAnagrams(strs));
		System.out.println(a.isAna("",""));
		List<String> list = new ArrayList<String>();
		list.add("");
		System.out.println(list);
		list.add("");
		System.out.println(list);
	}
	
}
