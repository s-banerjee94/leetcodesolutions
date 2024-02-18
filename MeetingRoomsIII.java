package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

class Track {
	public int endTime;
	public int roomNumber;

	public Track(int endTime, int roomNumber) {
		super();
		this.endTime = endTime;
		this.roomNumber = roomNumber;
	}
}

public class MeetingRoomsIII {
	public int mostBooked(int n, int[][] meetings) {
		Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
		PriorityQueue<Integer> freeRooms = new PriorityQueue<Integer>();
		for (int i = 0; i < n; i++)
			freeRooms.offer(i);
		int[] count = new int[n];
		PriorityQueue<Track> inMeeting = new PriorityQueue<Track>((a, b) -> {
			if (a.endTime != b.endTime)
				return a.endTime - b.endTime;
			else
				return a.roomNumber - b.roomNumber;
		});
		for (int[] meeting : meetings) {
			while (!inMeeting.isEmpty() && inMeeting.peek().endTime <= meeting[0]) {
				Track onGoingMeeting = inMeeting.poll();
				freeRooms.offer(onGoingMeeting.roomNumber);
			}
			if (!freeRooms.isEmpty()) {
				int roomNumber = freeRooms.poll();
				inMeeting.add(new Track(meeting[1], roomNumber));
				count[roomNumber]++;
			} else {
				Track onGoingMeeting = inMeeting.poll();
				meeting[1] = onGoingMeeting.endTime + (meeting[1] - meeting[0]);
				inMeeting.offer(new Track(meeting[1], onGoingMeeting.roomNumber));
				count[onGoingMeeting.roomNumber]++;
			}
		}
		System.out.println(Arrays.toString(count));
		return IntStream.range(0, count.length).reduce((i, j) -> count[i] > count[j] ? i : j).getAsInt();
	}

	public static void main(String[] args) {
		System.out
				.println(new MeetingRoomsIII().mostBooked(2, new int[][] { { 0, 10 }, { 1, 5 }, { 2, 7 }, { 3, 4 } }));
	}

}
