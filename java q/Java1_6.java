import java.util.Scanner;

//Write a program to display the ASCII value of a character.
public class Java1_6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            char a=sc.next().charAt(0);
            int b=(int)a;
            System.out.print("The ASCII value of '" + a + "' is: " + b);

    }
}
