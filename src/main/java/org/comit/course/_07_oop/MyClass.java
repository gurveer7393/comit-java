package org.comit.course._07_oop;


class Employee{
	/*
	 * Attributes --- Fields --- Properties --- Instance Variables 
	*/
	int id;
	String name;
	double salary;
	String position;
	
	public Employee() {
		
	}
	/**
	 *Method is a bloc of code that runs when it is called
	 * has return type --- method name --- parameters --- block of code
	 * 
	
	*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(position);
	}
	double bonusEmploee(double percentage) {
		double empBonus = (salary * percentage)/100;
		
		return empBonus;
	}
	
}

public class MyClass {

	public static void main(String[] args) {
		
		/*
		 * The new keyword allocates memory for the object 
		*/
		Employee emp1 = new Employee();
		/*
		 * we are breaking the encapsulation OOP concept.
		 */
		emp1.id = 1020;
		emp1.name = "John";
		emp1.salary = 80_000;
		emp1.position = "Manager";
		
		emp1.display();
		
		double bonus = emp1.bonusEmploee(10);
		System.out.println("bonus: "+bonus);
		
		
		// second object using getter/setter 
		
		Employee emp2 = new Employee();
		emp2.setId(1030);
		emp2.setName("jane");
		emp2.setSalary(100_000);
		emp2.setPosition("Director");
		
		emp2.display();

		bonus = emp2.bonusEmploee(8);
		System.out.println("bonus: "+bonus);
		
	}

}
