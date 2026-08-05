public class Main {
    public static void main(String[] args) {
        // --- 1. Simple Interest Calculation ---
        double principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;

        double simpleInterest = principal * rate * time / 100.0;
        double totalAmount = principal + simpleInterest;

        // --- 2. BMI Calculation ---
        double weight = 72.0;
        double height = 1.8;
        double bmi = weight / (height * height);

        // --- 3. Marks & Percentage Calculation ---
        int marks1 = 78;
        int marks2 = 84;
        int marks3 = 69;
        int marks4 = 91;
        int marks5 = 88;

        int totalSubjects = 5;
        int maxMarksPerSubject = 100;

        int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        double percentage = ((double) totalMarks / (totalSubjects * maxMarksPerSubject)) * 100.0;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
