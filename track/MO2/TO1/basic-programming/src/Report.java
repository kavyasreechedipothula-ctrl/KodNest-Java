public class Report {
    public static void main(String[] args) {
        // Input variables
        int completedTopics = 17;
        int totalTopics = 20;
        int dailyHours = 3;
        int learningDays = 5;

        // Calculations
        int remainingTopics = totalTopics - completedTopics;
        int weeklyHours = dailyHours * learningDays;

        // Type casting to double for accurate percentage calculation
        double progressPercentage = ((double) completedTopics * 100) / totalTopics;

        // Print outputs using correct standard syntax
        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Remaining Topics: " + remainingTopics);
        System.out.println("Weekly Learning Hours: " + weeklyHours);
        System.out.println("Progress Percentage: " + progressPercentage + "%");
    }
}