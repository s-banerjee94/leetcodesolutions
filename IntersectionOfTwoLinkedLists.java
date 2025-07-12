public class IntersectionOfTwoLinkedLists {
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode p = headA;
		ListNode n = headB;

//		while (true) {
//			if (p == n)
//				return p;
//			p = p.next;
//			n = n.next;
//			if (p == null && n == null)
//				return null;
//			if (p == null)
//				p = headB;
//			if (n == null)
//				n = headA;
//		}

		while (p != n) {
			p = (p == null) ? headB : p.next;
			n = (n == null) ? headA : n.next;
		}

		return p;

	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(3);
		node.next.next = new ListNode(2);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(6);

		ListNode node2 = new ListNode(0);
		node2.next = new ListNode(9);
		node2.next.next = node.next.next;

		getIntersectionNode(node, node2);
	}

}


