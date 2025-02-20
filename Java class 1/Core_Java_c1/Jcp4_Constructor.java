package Core_Java_c1;

public class Jcp4_Constructor {
    //constructor also a method
    //but class name and method name must same
    //it execute automatically at object creation
    
    public Jcp4_Constructor() {// static method
        System.out.println("hi");
    }
    public static void m3() {// static method
        System.out.println("hiiii");
    }

    public static void main(String[] args) {
        Jcp4_Constructor x= new Jcp4_Constructor();
        System.out.println("hello");
        x.m3();
    }


}
