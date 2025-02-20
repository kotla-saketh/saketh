import java.util.Scanner;
public class Java1_50 {
    //Create a program to reverse a given number.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        int n= sc.nextInt();
        int r=0;
        while( n != 0 ){
            int d=n%10;
            r=r*10+d;
            n/=10;
            System.out.println(r);

        }
    }
}
