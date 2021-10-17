package com.revature.app.collection;

import java.util.ArrayList;
import java.util.List;

public class ListObjectDemo {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		
		List<Person> personList = new ArrayList<>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		personList.add(person5);		
	}

}
