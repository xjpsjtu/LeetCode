
public class MergeTwoL21 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null && l2 == null)return null;
		ListNode l = new ListNode(0);
		if(l1 == null)return l2;
		else if(l2 == null)return l1;
		else{
			if(l1.val <= l2.val){
				l.val = l1.val;
				l.next = mergeTwoLists(l1.next, l2);
			}else if(l1.val > l2.val){
				l.val = l2.val;
				l.next = mergeTwoLists(l1, l2.next);
			}
		}
		return l;
	}
}

