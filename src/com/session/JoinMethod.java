package com.session;

public class JoinMethod {

    public static void main(String[] args) {
     try{
         int no =10;
         callingMEthod(no);
     }
     catch (Exception e)
     {
         System.out.println("parent catch");
         e.printStackTrace();
     }

    }

    private static void callingMEthod(int no) throws Exception {

           try {
               int resutl = no/0;
               System.out.println(resutl);
           }
           catch (Exception e)
           {
               System.out.println("child catdh");
               System.out.println(e);
           }
    }
}
