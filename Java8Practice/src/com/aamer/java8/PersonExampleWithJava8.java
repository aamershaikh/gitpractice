package com.aamer.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonExampleWithJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Aamer", "Shaikh", 28),
					  new Person("John", "Doe", 29),
					  new Person("Heath", "Ledger", 60),
					  new Person("Dan", "Brown", 38));
		
		sortByFirstName(people);
		
		sortByLastName(people);
		
	}

	private static void sortByFirstName(List<Person> people) {
		//sort person alphabetically on the basis of first name
				people.sort((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
				
				//print the sorted list
				for (Person person1 : people) {
					System.out.println("First Name Sorted : "+person1.toString());
				}		
			
		
	}

	private static void sortByLastName(List<Person> people) {
		//sort person alphabetically on the basis of last name
				people.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
				
				//print the sorted list
				for (Person person : people) {
					System.out.println("Last Name sorted : "+ person.toString());
				}
	}

}
