//Implement a program to calculate the perimeter of a circle given its radius.
import java.util.Scanner;

public class Java1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        System.out.println("The perimeter of the circle is: " + perimeter);

        sc.close();
    }
}
