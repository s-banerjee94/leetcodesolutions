package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class MinStack {
	Deque<Integer> stack;
	PriorityQueue<Integer> priorityQueue;

	
	public MinStack() {
		stack = new ArrayDeque<>();
		priorityQueue = new PriorityQueue<>();
	}

	public void push(int val) {
		stack.offerLast(val);
		priorityQueue.offer(val);
	}

	public void pop() {
		int poll = stack.pollLast();
		priorityQueue.remove(poll);
	}

	public int top() {
		return stack.peekLast();
	}

	public int getMin() {
		return priorityQueue.peek();
	}

}
