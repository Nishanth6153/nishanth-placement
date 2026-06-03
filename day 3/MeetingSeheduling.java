public class MeetingSeheduling{
    public static void main(String[] args) {
        int[][] meetings = {{1,2,4}, {2,5,6}, {3,1,7}, {4,7,9}, {5,8,10}};
        System.out.println("Selected meetings:");
        System.out.println("Meeting 1: " + "FROM "+ meetings[0][0] + "-" +"TO "+ meetings[0][2]);
        System.out.println("Meeting 2: " + "FROM "+ meetings[1][0] + "-" +"TO "+ meetings[1][2]);
        System.out.println("Meeting 3: " + "FROM "+ meetings[2][0] + "-" +"TO "+ meetings[2][2]);
        System.out.println("Meeting 4: " + "FROM "+ meetings[3][0] + "-" +"TO "+ meetings[3][2]);
        System.out.println("Meeting 5: " + "FROM "+ meetings[4][0] + "-" +"TO "+ meetings[4][2]);
    }
}


