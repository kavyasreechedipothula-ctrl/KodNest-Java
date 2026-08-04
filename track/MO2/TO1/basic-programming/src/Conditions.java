public class Conditions {
    public static void main(String[] args) {
        int number = -7;
        int firstScore = 18;
        int secondScore = 25;

        // Block 1: Check if positive, negative, or zero
        if (number > 0) {
            System.out.println("Number type: Positive");
        } else if (number < 0) {
            System.out.println("Number type: Negative");
        } else {
            System.out.println("Number type: Zero");
        }

        // Block 2: Check for even or odd parity
        if (number % 2 == 0) {
            System.out.println("Parity: Even");
        } else {
            System.out.println("Parity: Odd");
        }

        // Block 3: Compare scores (Note: Code is cut off, but logic implies finding the
        // larger score)
        if (firstScore >= secondScore) {
            System.out.println("Larger score: " + firstScore);
        } else {
            System.out.println("Larger score: " + secondScore);
        }
    }
}
