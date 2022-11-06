package com.session;

public class ExceptionWithMethodOverriding {
    public static void main(String[] args) {
        String isNRI="";
        String isNRI1="";
        String isNRI2="";
        String isNRI3="true";
        Boolean aBoolean = checkNRI(isNRI,isNRI1,isNRI2,isNRI3);
        System.out.println(aBoolean);

    }

    private static Boolean checkNRI(String isNRI, String isNRI1,String isNRI2,String isNRI3) {
        if("true".equalsIgnoreCase(isNRI)
                || "true".equalsIgnoreCase(isNRI1)
                || "true".equalsIgnoreCase(isNRI2)
                || "true".equalsIgnoreCase(isNRI3) ){
             return  Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
