// 1234->2143
public class SwapNodesP24 {
	ListNode tmp, first, second;
	int index = 0;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;
//		a.next = b;
//		b.next = null;
		SwapNodesP24 s = new SwapNodesP24();
		ListNode l;
		l = s.swapPairs(a);
		s.print(l);
//		System.out.println(s.length(a));
	}
	public void print(ListNode l){
		while(l != null){
			System.out.println(l.val);
			l = l.next;
		}
	}
	public int length(ListNode head){
		ListNode p = head;
		int len = 0;
		while(p != null){
			p = p.next;
			len++;
		}
		return len;
	}
	public ListNode swapPairs(ListNode head){
//		System.out.println(head.val + "   " + index++);
		if(length(head) <= 1)return head;
		else{
			first = head;
			second = head.next;
			tmp = second.next;
			head = second;
			head.next = first;
			head.next.next = swapPairs(tmp);
		}
		return head;
	}
}
