//Find the Average of Three Numbers
import java.util.Scanner;

public class Java1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("The average is: " + average);
        sc.close();
    }
}
