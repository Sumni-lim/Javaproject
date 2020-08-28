package com.egjava.test;
public class Test {
    static void display() {
        System.out.println("this is static method");
    }

    public static void main(String[] args) {
        display();
        StaticMethodTest.show();
    }
}
    class StaticMethodTest{
        static void show(){
            System.out.println("2");
        }
    }

