
public class RemoveNthNode19 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RemoveNthNode19 r = new RemoveNthNode19();
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
		r.print(r.removeNthFromEnd(a, 6));
	}
	public void print(ListNode head){
		while(head != null){
			System.out.print(head.val + "->");
			head = head.next;
		}
	}
	public ListNode removeNthFromEnd(ListNode head, int n){
		int count = 0;
		ListNode p = head;
		while(p.next != null){
			count++;
			p = p.next;
		}
		//System.out.println("count = " + count);
		count++;
		if(n > count)return head;
		if(n == count)return head.next;
		int round = count - n - 1;
		System.out.println("count = " + count + " round = " + round);
		p = head;
		while(round > 0){
			round--;
			p = p.next;
		}
		ListNode q = p.next;
		p.next = q.next;
		return head;
	}
}
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
	}
}
