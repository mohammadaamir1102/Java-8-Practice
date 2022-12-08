package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorJava8Example {

	List<StudentBook> bookData = null;
	public static void main(String[] args) {
		List<StudentBook> studentBook = ComparatorJava8Example.getStudentBook();
		studentBook.forEach(System.out::println);
	}

	public static List<StudentBook> getStudentBook() {
		List<StudentBook> bookData = new ArrayList<>();
		bookData.add(new StudentBook(1, "Java", 100));
		bookData.add(new StudentBook(2, "Hibernate", 100));
		bookData.add(new StudentBook(3, "Mysql", 100));
		bookData.add(new StudentBook(4, "JSP", 100));
		bookData.add(new StudentBook(5, "Servlet", 100));
		bookData.add(new StudentBook(6, "PHP", 100));
		List<StudentBook> sortingData = methodForShorting(bookData);
		System.out.println("size is "+sortingData.size());
//		Collections.sort(bookData, (o1, o2) -> o1.getBookName().compareTo(o2.getBookName()));
		return sortingData;

	}
	// here we are sorting the data by java stream
	private static List<StudentBook> methodForShorting(List<StudentBook> bookData) {
		List<StudentBook> sortingData = bookData.stream().sorted(Comparator.comparing(StudentBook::getBookName))
				.collect(Collectors.toList());
		return sortingData;
	}
}
