import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary94 {
	static class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        if(root == null)return list;
        stack.push(root);
        int k = 0;
        while(!stack.empty() && k <= 5){
        	k++;
        	TreeNode t = stack.peek();
        	System.out.println(t.val);
        	if(t.left != null)stack.push(t.left);
        	else{
        		list.add(t.val);
        		stack.pop();
        		if(!stack.empty()){
        			t = stack.peek();
            		list.add(t.val);
            		stack.pop();
            		if(t.right != null)stack.push(t.right);
        		}else{
        			if(t.right != null)stack.push(t.right);
        		}
        	}
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary94 b = new Binary94();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		t2.left = t3;
		t2.right = null;
		t3.left = t1;
		t3.right = null;
		t1.left = null;
		t1.right = null;
		System.out.println(b.inorderTraversal(t2));
	}

}
