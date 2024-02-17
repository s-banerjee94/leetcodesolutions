package leetcode;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
	public int furthestBuilding(int[] heights, int bricks, int ladders) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < heights.length - 1; i++) {
			int gap = heights[i + 1] - heights[i];
			if (gap > 0) {
				pq.offer(gap);
			}
			if (pq.size() > ladders) {
				bricks -= pq.poll();
			}
			if (bricks < 0) {
				return i;
			}
		}
		return heights.length - 1;
	}

	public static void main(String[] args) {
		System.out.println(
				new FurthestBuildingYouCanReach().furthestBuilding(new int[] { 4, 12, 2, 7, 3, 18, 20, 3, 19 }, 10, 2));
	}

}
