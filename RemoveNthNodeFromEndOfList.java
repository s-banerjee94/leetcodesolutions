public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return head;
		ListNode dummy = new ListNode(0, head);
		ListNode fast = dummy;
		ListNode slow = dummy;
		for(int i = 0; i <= n; i++) {
			if(fast == null)
				return head;
			fast = fast.next;
		}
		
		while(fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		
		slow.next = slow.next.next;
		return dummy.next;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1, null);
//		head.next = new ListNode(2, null);
//		head.next.next = new ListNode(3, null);
//		head.next.next.next = new ListNode(4, null);
//		head.next.next.next.next = new ListNode(5, null);
		ListNode newHead = new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 1);
		while (newHead != null) {
			System.out.print(newHead.val + " ");
			newHead = newHead.next;
		}

	}
}
