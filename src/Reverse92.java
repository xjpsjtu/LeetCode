public class Reverse92 {
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public void print(ListNode l){
		while(l != null){
			System.out.print(l.val + ",");
			l = l.next;
		}
	}
	public ListNode get(ListNode l, int n){
		ListNode f = l;
		while(n > 1){
			f = f.next;
			n--;
		}
		return f;
	}
	public int getl(ListNode l){
		int len = 0;
		while(l != null){
			l = l.next;
			len++;
		}
		return len;
	}
	public ListNode reverseBetween(ListNode head, int m, int n) {
		int len = getl(head);
		if(len == 1)return head;
		if(len == 2){
			if(m == n)return head;
			else{
				ListNode next = head.next;
				next.next = head;
				head.next = null;
				return next;
			}
		}
        if(m == 1){
        	if(n == 1)return head;
        	if(n == len){
        		ListNode ln = get(head, n);
        		ListNode ln_former = get(head, n-1);
        		ln.next = head.next;
        		ln_former.next = head;
        		head.next = null;
        		return ln;
        	}
        	if(n == 2){
        		ListNode ln = get(head, n);
        		ListNode ln_former = get(head, n-1);
        		head.next = ln.next;
        		ln.next = ln_former;
        		return ln;
        	}
        	else{
        		ListNode ln = get(head, n);
        		ListNode ln_former = get(head, n-1);
        		ListNode ln_next = ln.next;
        		ln.next = head.next;
        		ln_former.next = head;
        		head.next = ln_next;
        		return ln;
        	}
        }
        else if(n == len){
        	if(m == len)return head;
        	if(m == len - 1){
        		ListNode ln = get(head, n);
        		ListNode lm = get(head, m);
        		ListNode lm_former = get(head, m - 1);
        		lm_former.next = ln;
        		ln.next = lm;
        		lm.next = null;
        		return head;
        	}
        	else{
        		ListNode lm = get(head, m);
        		ListNode ln = get(head, n);
        		ListNode lm_former = get(head,m-1);
        		ListNode ln_former = get(head,n-1);
        		lm_former.next = ln;
        		ln.next = lm.next;
        		ln_former.next = lm;
        		lm.next = null;
        		return head;
        	}
        }else{
        	ListNode lm = get(head, m);
    		ListNode ln = get(head, n);
    		ListNode lm_former = get(head,m-1);
    		ListNode ln_former = get(head,n-1);
    		ListNode ln_next = ln.next;
    		lm_former.next = ln;
    		ln.next = lm.next;
    		ln_former.next = lm;
    		lm.next = ln_next;
    		return head;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse92 r = new Reverse92();
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(5);
		ListNode l4 = new ListNode(7);
		ListNode l5 = new ListNode(1);
		ListNode l6 = new ListNode(2);
		ListNode l7 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = null;
		r.print(l1);
		System.out.println();
		r.print(r.reverseBetween(l5, 2, 3));
	}

}
