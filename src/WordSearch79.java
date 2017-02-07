import java.util.ArrayList;
import java.util.List;

public class WordSearch79 {
	public boolean visited[][];
	public boolean exist(char[][] board, String word){
		int h = board.length;
		int w = board[0].length;
		int l = word.length();
		if(l == 0)return false;
		if(h == 0 && w == 0)return false;
		visited = new boolean[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				visited[i][j] = false;
			}
		}
		
		return dfs(new Node(-1, -1), 1, l, board, word);
	}
	public boolean dfs(Node n, int depth, int maxdepth, char[][] board, String word){
//		System.out.println("depth= " + depth);
		if(depth > maxdepth)return true;
		List<Node> list = n.getNeighbour(n, board);
//		System.out.print("all neighbours: ");
		for(int i = 0; i < list.size(); i++){
//			System.out.println("(" + list.get(i).i + "," + list.get(i).j + ")");
		}
//		System.out.println("neighbours over");
		for(int i = 0; i < list.size(); i++){
			Node nei = list.get(i);
			if(!visited[nei.i][nei.j]){
				if(board[nei.i][nei.j] != word.charAt(depth - 1))continue;
				else{
					visited[nei.i][nei.j] = true;
					depth++;
//					System.out.println("Now at: " + board[nei.i][nei.j]);
//					System.out.println("(" + nei.i + "," + nei.j + ")");
					if(dfs(nei, depth, maxdepth, board, word)){
						return true;
					}
					depth--;
					visited[nei.i][nei.j] = false;
				}
			}
//			System.out.println();
		}
		return false;
	}
	class Node{
		int i;
		int j;
		public Node(int i, int j){
			this.i = i;
			this.j = j;
		}
		public List<Node> getNeighbour(Node n, char[][] board){
			List<Node> ans = new ArrayList<Node>();
			int h = board.length;
			int w = board[0].length;
			if(n.i == -1 && n.j == -1){
				for(int i = 0; i < h; i++){
					for(int j = 0; j < w; j++){
						ans.add(new Node(i,j));
					}
				}
				return ans;
			}
			if(h == 1){
				if(w == 1){
					ans.add(n);
				}else if(w != 1){
					if(n.j == 0)ans.add(new Node(0,1));
					else if(n.j == w - 1)ans.add(new Node(0, w - 2));
					else{
						ans.add(new Node(0, n.j - 1));
						ans.add(new Node(0, n.j + 1));
					}
					
				}
				return ans;
			}
			if(w == 1){
				if(h == 1){
					ans.add(n);
				}else if(h != 1){
					if(n.i == 0){
						ans.add(new Node(1, n.j));
					}else if(n.i == h - 1){
						ans.add(new Node(h - 2, 0));
					}else{
						ans.add(new Node(n.i - 1,0));
						ans.add(new Node(n.i + 1,0));
					}
				}
				return ans;
			}
			if(n.i == 0){
				if(n.j == 0){
					ans.add(new Node(0,1));
					ans.add(new Node(1,0));
					ans.add(new Node(1,1));
				}else if(n.j == w - 1){
					ans.add(new Node(0, w - 2));
					ans.add(new Node(1, w - 1));
				}else{
					ans.add(new Node(0, n.j - 1));
					ans.add(new Node(0, n.j + 1));
					ans.add(new Node(1, n.j));
				}
			}else if(n.i == h - 1){
				if(n.j == 0){
					ans.add(new Node(h - 2, 0));
					ans.add(new Node(h - 1, 1));
				}else if(n.j == w - 1){
					ans.add(new Node(h - 2, w - 1));
					ans.add(new Node(h - 1, w - 2));
				}else{
					ans.add(new Node(h - 1, n.j - 1));
					ans.add(new Node(h - 1, n.j + 1));
					ans.add(new Node(h - 2, n.j));
				}
			}else{
				if(n.j == 0){
					ans.add(new Node(n.i - 1, 0));
					ans.add(new Node(n.i + 1, 0));
					ans.add(new Node(n.i, 1));
				}else if(n.j == w - 1){
					ans.add(new Node(n.i - 1, w - 1));
					ans.add(new Node(n.i + 1, w - 1));
					ans.add(new Node(n.i, w - 2));
				}
				else{
					ans.add(new Node(n.i - 1, n.j));
					ans.add(new Node(n.i + 1, n.j));
					ans.add(new Node(n.i, n.j - 1));
					ans.add(new Node(n.i, n.j + 1));
				}
			}
			return ans;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordSearch79 w = new WordSearch79();
//		char[][] board = new char[][]{{'A','B','C','E'},{'S','E','C','F'},{'A','D','E','E'}};
		char[][] board = new char[][]{{'a'}};
		String word = "ab";
		System.out.println(w.exist(board, word));
	}

}
