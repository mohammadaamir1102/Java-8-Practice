package com.session;

import java.util.*;

public class ArrayListBookObjectExample {
    public static void main(String[] args) {
        List<BookOfList> bookDetails = getElements();
        for (BookOfList bookDetail : bookDetails) {
            System.out.println(bookDetail);
        }
    }
    private static List<BookOfList> getElements() {
        List<BookOfList> bookOfLists = new ArrayList<>();

        BookOfList bookOfList = new BookOfList();
        bookOfList.setBookId(1);
        bookOfList.setBookName("Java");
        bookOfList.setAuthor("Games Goslin");

        bookOfLists.add(bookOfList); // first way for adding the elements
        bookOfLists.add(new BookOfList(2,"Spring","Rod Jhonson"));// second way to create the object and add elements
        //ignore the spelling
        return bookOfLists;
    }
}
