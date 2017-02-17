public class Partition86 {
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
	public ListNode partition(ListNode head, int x) {
        if(head == null)return null;
        if(head.next == null)return head;
        ListNode next = head.next;
        if(head.val < x){
        	head.next = partition(next, x);
        	return head;
        }else{
        	next = partition(next,x);
        	if(next.val >= x){
        		head.next = next;
        		return head;
        	}else{
        		if(next.next == null){
        			next.next = head;
        			head.next = null;
        			return next;
        		}else{
        			ListNode ans = next;
        			while(ans.next.val < x){
        				ans = ans.next;	
        				if(ans.next == null)break;
        			}
        			head.next = ans.next;
        			ans.next = head;
        		}
        		return next;
        	}
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
		// TODO Auto-generated method stub
				ListNode l1 = new ListNode(1);
				ListNode l2 = new ListNode(4);
				ListNode l3 = new ListNode(3);
				ListNode l4 = new ListNode(3);
				ListNode l5 = new ListNode(1);
				ListNode l6 = new ListNode(2);
				l1.next = l2;
				l2.next = l3;
				l3.next = l4;
				l4.next = l5;
				l5.next = l6;
				l6.next = null;
				Partition86 p = new Partition86();
				int x = 2;
				printList(p.partition(l4, x));
	}

}
