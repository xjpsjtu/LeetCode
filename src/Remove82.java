// 1 2 3 3 4 4 5 -> 1 2 5
public class Remove82 {
	static class ListNode{
		int val;
		ListNode next;
		ListNode(int val){this.val = val;}
	}
	public ListNode deleteDuplicates(ListNode head){
		if(head == null)return null;
		if(head.next == null)return head;
		ListNode next = head.next;
		if(next.val != head.val){
			head.next = deleteDuplicates(next);
			return head;
		}else{
			while(next.val == head.val){
				next = next.next;
				if(next == null)return null;
			}
			return deleteDuplicates(next);
		}
	}
	public static void printList(ListNode head){
		while(head != null){
			System.out.println(head.val + ",");
			head = head.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(4);
		ListNode l7 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = null;
		Remove82 r = new Remove82();
		ListNode l = r.deleteDuplicates(l5);
		printList(l);
	}

}

