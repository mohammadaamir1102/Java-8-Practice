package com.session;

public class JoinMethod {

    public static void main(String[] args) {
<<<<<<< HEAD
        try {
            int no = 10;
            callingMEthod();
        } catch (Exception e) {
            System.out.println(e);

        }
=======
     try{
         int no =10;
         callingMEthod(no);
     }
     catch (Exception e)
     {
         System.out.println("parent catch");
         e.printStackTrace();
     }
>>>>>>> 85995503eb7a621d29e928562f060569bc7cdaa1

    }

    private static void callingMEthod() throws Exception {
        try {
            callingAnotherMessage();
        } catch (Exception e) {

<<<<<<< HEAD
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
=======
           try {
               int resutl = no/0;
               System.out.println(resutl);
           }
           catch (Exception e)
           {
               System.out.println("child catdh");
               System.out.println(e);
           }
>>>>>>> 85995503eb7a621d29e928562f060569bc7cdaa1
    }
}
