import java.util.Scanner;

public class Java1_45 {
    //Write a program to print numbers in reverse order from N to 1.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }

    }

}
