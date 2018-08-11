package com.practice.interview.IntPrep;

public class SingletonClient {
	
	public static void main(String[] args) {
		EmployeeN emp = EmployeeN.getInstance("Kunal", 36);
		System.out.println(emp.getName());
		emp.setName("lunal");
		System.out.println(emp.getName());

		EmployeeN emp1 = EmployeeN.getInstance("unal", 136);
		System.out.println(emp1.getName());
	}

}


class EmployeeN {
	
	private String name;
	private int age;
	private static EmployeeN singleton = null;
	
	private EmployeeN(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public static EmployeeN getInstance(String name, int age) {
		if(singleton ==null) 
			singleton = new EmployeeN(name, age);

		return singleton;
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
}
