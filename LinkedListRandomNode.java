package leetcode;

import java.util.Random;

class Solution {
	ListNode head;
	Random rn;

	public Solution(ListNode head) {
		this.head = head;
		this.rn = new Random();
	}

	public int getRandom() {
		ListNode temp = this.head;
		int result = temp.val;
		int index = 1;
		while (temp != null) {
			if (rn.nextInt(index) == 0) {
				result = temp.val;
			}
			index++;
			temp = temp.next;
		}
		return result;
	}

}

public class LinkedListRandomNode {

	public static void main(String[] args) {
		ListNode head = new ListNode(1, null);
		head.next = new ListNode(2, null);
		head.next.next = new ListNode(3, null);
		head.next.next.next = new ListNode(4, null);
		head.next.next.next.next = new ListNode(5, null);
		Solution sl = new Solution(head);
		System.out.println(sl.getRandom());
	}

}
