package com.session;

@FunctionalInterface
interface Mouse {
    abstract void run();

    default void show() {
        System.out.println("default method");
    }

    static void go() {
        System.out.println("static method");
    }
}

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        // ()->
        Mouse mouse = new Mouse() {
            @Override
            public void run() {
                System.out.println("run method called");
            }
        };

        Mouse mouse1 = ()-> System.out.println("run method");
        mouse.run();
        mouse1.run();
    }
}
