package Core_Java_c1;

public class Jcp1_Object {
    int a=10;
    int b=5;
    public void m1(){
        System.out.println("hi1");
    }
    public void m2(){
        System.out.println("hi2");
    }

    public static void main(String[] args) {
        System.out.println("hi");
        Jcp1_Object x=new Jcp1_Object();
        x.m1();
        System.out.println(x.a);

    }

}
