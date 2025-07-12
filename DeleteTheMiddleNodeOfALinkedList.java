public class DeleteTheMiddleNodeOfALinkedList {
	public static  ListNode deleteMiddle(ListNode head) {
		if(head == null || head.next == null)
			return null;
		
		ListNode f = head;
		ListNode s = head;
		ListNode prev = null;
		
		while(f != null && f.next != null) {
			f = f.next.next;
			prev = s;
			s = s.next;
		}
		
		prev.next = s.next;
		
		return head;
	}
	
//	public static int getLen(ListNode head) {
//		int i = 0;
//		while(head != null) {
//			i++;
//			head = head.next;
//		}
//		return i;
//	}
}
