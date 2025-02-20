import java.util.Scanner;

public class Java1_44 {
    //Implement a program to print the multiplication table of a given number.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        int n=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n + "*" + i + "=" + i*n);
        }
    }
}
