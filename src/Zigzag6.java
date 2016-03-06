
public class Zigzag6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Zigzag6 z = new Zigzag6();
		System.out.println(z.convert("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmcoqhnwnkuewhsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsnfwzqfjmafadrrwsofsbcnuvqhffbsaqxwpqcacehchzvfrkmlnozjkpqpxrjxkitzyxacbhhkicqcoendtomfgdwdwfcgpxiqvkuytdlcgdewhtaciohordtqkvwcsgspqoqmsboaguwnnyqxnzlgdgwpbtrwblnsadeuguumoqcdrubetokyxhoachwdvmxxrdryxlmndqtukwagmlejuukwcibxubumenmeyatdrmydiajxloghiqfmzhl"
				,80));
	}
	public String convert(String s, int numRows) {
		if(numRows ==1){
			return s;
		}
        char[][] res = new char[numRows][10000];
        boolean[][] bol = new boolean[numRows][10000];
        for(int i = 0; i < numRows; i++){
        	for(int j = 0; j < 100; j++){
        		res[i][j] = ' ';
        		bol[i][j] = false;
        	}
        }
        char[] ch = s.toCharArray();
        int x = 0;
        int y = 0;
        int r = numRows - 1;
        for(int i = 0; i < s.length(); i++){
        	res[x][y] = ch[i];
        	bol[x][y] = true;
        	if(y % r == 0){
        		if(x != r){
        			x++;
        		}else{
        			x--;
        			y++;
        		}
        	}else{
        		x--;
        		y++;
        	}
        }
        String str = new String();
        for(int i = 0; i < numRows; i++){
        	for(int j = 0; j < 100; j++){
        		if(bol[i][j] == true){
        			str += res[i][j];
        		}
        	}
        }
        return str;
    } 
	
}
