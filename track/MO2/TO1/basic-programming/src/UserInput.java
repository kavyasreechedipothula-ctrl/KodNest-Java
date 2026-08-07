import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter int value");
        int a = scan.nextInt();
        System.out.println("integer value is: " + a);

        System.out.println("Enter a float value");
        float b = scan.nextFloat();
        System.out.println("float value is: " + b);

        System.out.println("Enter a long value");
        long c = scan.nextLong();
        System.out.println("long value is: " + c);

        System.out.println("Enter a double value");
        double d = scan.nextDouble();
        System.out.println("double value is : " + d);

        System.out.println("Enter a short value");
        short e = scan.nextShort();
        System.out.println("short values is: " + e);

        System.out.println("Enter a byte value");
        byte f = scan.nextByte();
        System.out.println("byte value is: " + f);

        System.out.println("Enter a char value");
        char g = scan.next().charAt(0);
        System.out.println("char value is: " + g);

        System.out.println("Enter a boolean value");
        boolean h = scan.nextBoolean();
        System.out.println("Boolean value is: " + h);
    }
}