package day_12_Method_Reference.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class UseMaxMini {
	public static void main(String[] args) {
		Employee emp1 = new Employee(001, "Ravindhiran", 29, 52000, 7);
		Employee emp2 = new Employee(003, "Ravi", 30, 62000, 7);
		Employee emp3 = new Employee(002, "Indhiran", 27, 5000, 5);
		Employee emp4 = new Employee(010, "Rax", 25, 2500, 2);
		
		
		List <Employee> emps = Arrays.asList(emp1,emp2,emp3,emp4);
		
		MaxMini obj = new MaxMini();
		getSalaryMax g = obj::findMax;
		g.findSalaryMax(emps);
		
		
	}

}

interface getSalaryMax {
	public void findSalaryMax(List <Employee> a);
}


class MaxMini{
	
	public void findMax(List <Employee> a) {
		Employee max = a.get(0);
		for(Employee x: a) {
			if(x.getSalary()>max.getSalary()) {
				max = x;
				
			}	
		}
		System.out.println(max);
		
		
		 
	}
}
	
	


//class1

class Employee {
	private int id;
	private String name;
	private int age;
	private int salary;
	private int experience;
	
	
	public Employee(int id, String name, int age, int salary, int experience) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.experience = experience;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", experience="
				+ experience;
	}
	
}









