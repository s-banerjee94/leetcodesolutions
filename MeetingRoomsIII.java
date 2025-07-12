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
		// sorting the the meetings array according to the start time
		Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
		// A PriorityQueue (minHeap) for storing the free rooms according to their
		// number, starting from 0 to n - 1
		PriorityQueue<Integer> freeRooms = new PriorityQueue<Integer>();
		// storing the the room in the queue
		for (int i = 0; i < n; i++)
			freeRooms.offer(i);
		// a array to keep the count of number of each room used in meeting
		int[] count = new int[n];
		// A PriorityQueue to keep track of ongoing meetings with end time and the room
		// number the meeting is held in.
		// For this, a Track class is used with two data types: int endTime and int
		// roomNumber.
		// The priority is set according to the end time or room number.
		PriorityQueue<Track> inMeeting = new PriorityQueue<Track>((a, b) -> {
			if (a.endTime != b.endTime)
				return a.endTime - b.endTime;
			else
				return a.roomNumber - b.roomNumber;
		});

		for (int[] meeting : meetings) {
			// Meetings whose end time is less than the new meeting start time are removed
			// from the priority queue.
			while (!inMeeting.isEmpty() && inMeeting.peek().endTime <= meeting[0]) {
				Track onGoingMeeting = inMeeting.poll();
				freeRooms.offer(onGoingMeeting.roomNumber);
			}
			// If a free room is available, assign a room with the lowest room number.
			if (!freeRooms.isEmpty()) {
				int roomNumber = freeRooms.poll();
				inMeeting.add(new Track(meeting[1], roomNumber));
				count[roomNumber]++;
			} else { // If a free room is not available, poll out a meeting and add a new meeting.
				Track onGoingMeeting = inMeeting.poll();
				meeting[1] = onGoingMeeting.endTime + (meeting[1] - meeting[0]);
				inMeeting.offer(new Track(meeting[1], onGoingMeeting.roomNumber));
				count[onGoingMeeting.roomNumber]++;
			}
		}
		// A lambda function to find the index of the room with the most meetings
		return IntStream.range(0, count.length).reduce((i, j) -> count[i] >= count[j] ? i : j).getAsInt();
	}

	public static void main(String[] args) {
		System.out
				.println(new MeetingRoomsIII().mostBooked(2, new int[][] { { 0, 10 }, { 1, 5 }, { 2, 7 }, { 3, 4 } }));
	}

}
