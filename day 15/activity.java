// a student wants to attend maximum seminars 

// start =[1,3,0,5,8,5]
// end=[2,4,6,7,9,9]

// a student can attend only one seminar at a time
// maximum seminar he can attend 


import java.util.*;

public class activity {

    static class Acti {
        int start;
        int end;

        Acti(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static int maxActivities(int[] start, int[] end) {

        int n = start.length;

        Acti[] activities = new Acti[n];

        for (int i = 0; i < n; i++) {
            activities[i] = new Acti(start[i], end[i]);
        }

        Arrays.sort(activities, (a, b) -> a.end - b.end);

        int count = 1;
        int lastEndTime = activities[0].end;

        for (int i = 1; i < n; i++) {
            if (activities[i].start >= lastEndTime) {
                count++;
                lastEndTime = activities[i].end;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int result = maxActivities(start, end);

        System.out.println("Maximum number of activities = " + result);
    }
}