import java.util.Scanner;
//Write a program to determine the grade of a student based on marks using if-else.
public  class Java1_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter marks
        System.out.print("Enter the marks of the student: ");
        int marks = sc.nextInt();

        // Determine the grade based on the marks
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("Grade: B");
        } else if (marks >= 60 && marks < 75) {
            System.out.println("Grade: C");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Grade: D");
        } else if (marks >= 40 && marks < 50) {
            System.out.println("Grade: E");
        } else if (marks < 40 && marks >= 0) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid marks entered.");
        }

        sc.close();
    }
}


