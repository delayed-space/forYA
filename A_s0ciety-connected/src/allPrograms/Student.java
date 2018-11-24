package allPrograms;

import java.sql.Date;

public class Student {
	String name;
	String lastname;
	int age;
	BirthDate date;
	
	public Student(String name, String lastname, int age, BirthDate date) {
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.date = date;
	}
	
	String getName() {
		return this.name;
	}
	String getLastName() {
		return this.lastname;
	}
	int getAge() {
		return this.age;
	}
	String getDate() {
		return this.date.getDate();
	}
}
