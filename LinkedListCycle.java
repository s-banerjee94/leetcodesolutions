public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		ListNode pre = head;
		ListNode left = head;
		while (pre != null && pre.next != null) {
			pre = pre.next.next;
			left = left.next;
			if (pre == left)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

	}

}
