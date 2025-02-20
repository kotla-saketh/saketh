//Create a program to find the largest of four numbers using nested if-else.
import java.util.Scanner;

public class Java1_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter four numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        System.out.print("Enter the fourth number: ");
        int num4 = sc.nextInt();

        // Using nested if-else to find the largest number
        if (num1 >= num2) {
            if (num1 >= num3) {
                if (num1 >= num4) {
                    System.out.println(num1 + " is the largest number.");
                } else {
                    System.out.println(num4 + " is the largest number.");
                }
            } else {
                if (num3 >= num4) {
                    System.out.println(num3 + " is the largest number.");
                } else {
                    System.out.println(num4 + " is the largest number.");
                }
            }
        } else {
            if (num2 >= num3) {
                if (num2 >= num4) {
                    System.out.println(num2 + " is the largest number.");
                } else {
                    System.out.println(num4 + " is the largest number.");
                }
            } else {
                if (num3 >= num4) {
                    System.out.println(num3 + " is the largest number.");
                } else {
                    System.out.println(num4 + " is the largest number.");
                }
            }
        }

        sc.close();
    }
}
