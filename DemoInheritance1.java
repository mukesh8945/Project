package Project;

import java.util.Scanner;

class ClassA {
    public int a;
    public static int b;

    public void m1() {
        System.out.println("**PClass Instance m1()***");
        System.out.println("The value a:" + a);
        System.out.println("The value b:" + b);
    }

    public static void m11() {
        System.out.println("***PClass static m11()***");
        // System.out.println("The value a:"+a);
        System.out.println("The value b:" + b);
    }
}

class ClassB extends ClassA {
    public int x;
    public static int y;

    public void m2() {
        System.out.println("***CClass Instance m2()***");
        System.out.println("The Value x:" + x);
        System.out.println("The value y:" + y);
    }

    public static void m22() {
        System.out.println("**CClass Static m22()*****");
        System.out.println("The value y:" + y);
        // System.out.println("The value x:"+x);
    }

}

public class DemoInheritance1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ClassB ob = new ClassB();// Normal Inheritance
        System.out.println("Enter the value of a:");
        ob.a = s.nextInt();
        System.out.println("Enter the value of b:");
        ClassB.b = s.nextInt();
        System.out.println("Enter the value of x:");
        ob.x = s.nextInt();
        System.out.println("Enter the value of y:");
        ClassB.y = s.nextInt();
        ob.m1();
        ClassB.m11();
        ob.m2();
        ClassB.m22();
        s.close();

    }

}
