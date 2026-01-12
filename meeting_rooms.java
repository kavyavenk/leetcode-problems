// Given an array of meeting time interval objects consisting of start and end times [[start_1,end_1],[start_2,end_2],...] (start_i < end_i), determine if a person could add all meetings to their schedule without any conflicts.
// Note: (0,8),(8,10) is not considered a conflict at 8

// Example 1:
// Input: intervals = [(0,30),(5,10),(15,20)]
// Output: false
// Explanation:
// (0,30) and (5,10) will conflict
// (0,30) and (15,20) will conflict

// Example 2:
// Input: intervals = [(5,8),(9,15)]
// Output: true

// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;

public class meeting_rooms {
/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */
    public boolean canAttendMeetings(List<Interval> intervals) {
        // SORTING
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
        for (int i = 1; i < intervals.size(); i++) {
            Interval i1 = intervals.get(i-1);
            Interval i2 = intervals.get(i);
            if (i1.end > i2.start) {
                return false;
            }
        }
        return true;
    }
}

