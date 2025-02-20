package Core_Java_c1;
//local,instance,class/static variable

public class Jcp3_Variables {
    int a=20;//instance
    static int b =30;
    public void m1(){
        int a=10;//local
        System.out.println(a);
        System.out.println(b);//static

        //the variable that is declared on the method body.
        //we can use local variables only with in the same that we cant use in the other method
        //we can use the instance variable from any method
        //the variable that is declared outside of method is instance variable
        //we can use the static variable directly from the main method without any object
        //psvm====static is cleared...)
        //
    }
    public void m2() {
        System.out.println(a);
    }
    public static void m3() {// static method
        System.out.println(b);
    }

    public static void main(String[] args) {
        Jcp3_Variables x= new Jcp3_Variables();
        System.out.println(x.a);
        x.m1();
        x.m2();
        m3();
    }

}
