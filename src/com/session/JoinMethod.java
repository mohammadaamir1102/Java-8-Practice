package com.session;

public class JoinMethod {

    public static void main(String[] args) {
        try {
            int no = 10;
            callingMEthod();
        } catch (Exception e) {
            System.out.println(e);

        }

    }

    private static void callingMEthod() throws Exception {
        try {
            callingAnotherMessage();
        } catch (Exception e) {

            throw new Exception("callingmethod");
        }
    }

    private static void callingAnotherMessage() throws Exception {
        {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
                throw new Exception("calling another method");
            }
        }
    }
}
