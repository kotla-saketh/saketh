import java.util.Scanner;
//Create a program to check if a number is even or odd.
public class Java1_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }
}
