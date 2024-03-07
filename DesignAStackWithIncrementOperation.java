package leetcode;

public class DesignAStackWithIncrementOperation {
	int[] stack;
	int currentSize;


	public DesignAStackWithIncrementOperation(int maxSize) {
		this.stack = new int[maxSize];
	}

	public void push(int x) {
		if (currentSize != stack.length)
			stack[currentSize++] = x;
	}

	public int pop() {
		if(currentSize == 0)
			return -1;
		int last = stack[currentSize - 1];
		currentSize--;
		return last;

	}

	public void increment(int k, int val) {
		for (int i = 0; i < currentSize && i < k; i++) {
			stack[i] += val;
		}
	}
}
