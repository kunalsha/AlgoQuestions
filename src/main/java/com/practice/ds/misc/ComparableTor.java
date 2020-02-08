package com.practice.ds.misc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ComparableTor {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Aunal", 50, LocalDate.of(2018, 1, 20));
		Employee emp2 = new Employee("Bunal", 40, LocalDate.of(2018, 1, 21));
		Employee emp3 = new Employee("Cunal", 30, LocalDate.of(2018, 1, 22));
		Employee emp4 = new Employee("Dunal", 20, LocalDate.of(2018, 1, 23));
		Employee emp5 = new Employee("Eunal", 10, LocalDate.of(2018, 1, 24));
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		//employees.forEach(System.out::println);
		
		Collections.sort(employees);
		//employees.forEach(System.out::println);

		Comparator<Employee> nameComp = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getName().compareTo(o1.getName());
			}
			
		};
		
		Comparator<Employee> dobComp = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getDob().getDayOfMonth()-o1.getDob().getDayOfMonth();
			}
			
		};
		
		
		Collections.sort(employees, nameComp);
		employees.forEach(System.out::println);
		
		
		Collections.sort(employees, dobComp);
		employees.forEach(System.out::println);
		
	}

}

class Employee implements Comparable<Employee>{
	private String name;
	private int age;
	private LocalDate dob;
	public Employee(String name, int age, LocalDate dob) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return o.age-this.age;
	}	
}