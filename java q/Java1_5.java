import java.util.Scanner;

//Implement a program to swap two numbers using a temporary variable.
public class Java1_5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("");
        int a = sc.nextInt();
        System.out.print("");
        int b = sc.nextInt();
        System.out.println("Before swap");
        System.out.println("a="+ a);
        System.out.println("b="+ b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap");
        System.out.println("a="+ a);
        System.out.println("b="+ b);
    }

}