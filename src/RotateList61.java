
public class RotateList61 {
	public ListNode rotateRight(ListNode head, int k){
		if(head == null)return null;
		int len = 1;
		ListNode p = head;
		while(p.next != null){
			p = p.next;
			len++;
		}
		k = k % len;
		if(k <= 0 || k >= len)return head;
//		System.out.println("len " + len);
		int place = len - k;
		p = head;
		while(place > 0){
			p = p.next;
			place--;
		}
//		System.out.println("Rotate at " + p.val);
		ListNode anshead = p;
//		System.out.println("Now head is " + anshead.val);
//		System.out.println("Head's next is: " + anshead.next.val);
		p = anshead;
		while(p.next != null){
			p = p.next;
		}
//		System.out.println("Now end is at: " + p.val);
		p.next = head;
		for(int i = 0; i < len - k - 1; i++){
			head = head.next;
		}
//		System.out.println("Now the new end is at: " + head.val);
		head.next = null;
		return anshead;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
//		ListNode l3 = new ListNode(3);
//		ListNode l4 = new ListNode(4);
//		ListNode l5 = new ListNode(5);
		l1.next = l2;
		l2.next = null;
//		l3.next = l4;
//		l4.next = l5;
//		l5.next = null;
//		ListNode head = l1;
//		while(head != null){
//			System.out.println(head.val);
//			head = head.next;
//		}
		RotateList61 r = new RotateList61();
		ListNode head = r.rotateRight(l1, 3);
		while(head != null){
			System.out.println(head.val);
			head = head.next;
		}
	}

}

