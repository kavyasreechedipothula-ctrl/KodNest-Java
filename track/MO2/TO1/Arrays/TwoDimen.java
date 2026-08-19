package Arrays;

import java.util.Scanner;

public class TwoDimen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[3][5];
        System.out.println("Enter the Array Elements :");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("Array Elements are :");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}