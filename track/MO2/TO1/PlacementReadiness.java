public class PlacementReadiness {
    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        String message = (marks >= 60 && attendance >= 75)
                ? "Placement Ready"
                : "Continue Preparation";

        System.out.println(message);

        for (int day = 1; day <= practiceDays; day++) {
            System.out.println("Practice Day: " + day);
        }
    }
}