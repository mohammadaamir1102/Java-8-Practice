package com.java8;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class StreamSorting {

	public static void main(String[] args) {
		List<College> college = new ArrayList<>();
		college.add(new College(77, "GIC", "Basti", LocalDate.of(1911, 05, 01)));
		college.add(new College(82, "GKP", "GKP", LocalDate.of(1999, 05, 01)));
		college.add(new College(66, "BKGINC", "Basti", LocalDate.of(1945, 05, 01)));
		college.add(new College(98, "GGIC", "Basti", LocalDate.of(1978, 05, 01)));
		college.add(new College(13, "KIC", "Basti", LocalDate.of(1966, 05, 01)));
		college.add(new College(76, "KDC", "Basti", LocalDate.of(1938, 05, 01)));
		college.add(new College(65, "APNPGC", "Basti", LocalDate.of(2005, 05, 01)));
		// here also will be use method reference
		Collections.sort(college, Comparator.comparingInt(idBaseShorting -> idBaseShorting.getCollegeID()));
		college.forEach(a -> System.out.println(a));
		System.out.println("______________________________________");
		
		Collections.sort(college, Comparator.comparing(dateBaseSorting -> dateBaseSorting.getCollegeESTD()));
		college.forEach(a -> System.out.println(a));
		
		System.out.println("______________________________________");
		Collections.sort(college, Comparator.comparing(College::getCollegeESTD));
		college.forEach(a->System.out.println(a));
		System.out.println("below grouping ");
		Map<Integer, List<College>> collect = college.stream().collect(Collectors.groupingBy(College::getCollegeID));
		collect.forEach((k,v) -> System.out.println(k +" "+v));
	}
}
