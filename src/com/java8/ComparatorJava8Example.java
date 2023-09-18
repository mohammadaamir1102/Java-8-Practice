package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class ComparatorJava8Example {

	List<StudentBook> bookData = null;
	public static void main(String[] args) {
		ComparatorJava8Example comparatorJava8Example = new ComparatorJava8Example();
		List<StudentBook> studentBook = getStudentBook();
		studentBook.forEach(System.out::println);
//		Map<Integer , List<String>> records = studentBook.stream()
//				.collect(Collectors.groupingBy(StudentBook::getId)).entrySet().stream()
//				.collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue()
//						.stream().map(StudentBook::getPages).collect(Collectors.toList())));
	}


	public static List<StudentBook> getStudentBook() {
		List<StudentBook> bookData = new ArrayList<>();
		bookData.add(new StudentBook(1, "Java", 10081));
		bookData.add(new StudentBook(2, "Hibernate", 13534));
		bookData.add(new StudentBook(3, "Mysql", 134534));
		bookData.add(new StudentBook(1, "Java", 6756));
		bookData.add(new StudentBook(5, "Servlet", 23423));
		bookData.add(new StudentBook(2, "Hibernate", 365654));
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
