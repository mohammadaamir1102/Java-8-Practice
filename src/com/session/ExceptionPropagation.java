package com.session;

public class ExceptionPropagation {

    void method1() {
        String name = null;
        System.out.println(name.length());
    }
    void method2() {
        this.method1();
    }
    void method3() {
        try {
            this.method2();
            System.out.println("Exception Propagation");
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ExceptionPropagation exceptionPropagation = new ExceptionPropagation();
        exceptionPropagation.method3();
    }

}
