package com.appdirect.predefinedFI;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.appdirect.models.Employee;

public class PredefinedFIPredicate {

	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Durga", "CEO", 30000, "Hyd"));
		emps.add(new Employee("Sunny", "Manager", 20000, "Hyd"));
		emps.add(new Employee("Binny", "Developer", 10000, "Hyd"));
		emps.add(new Employee("Penny", "Lead", 15000, "Hyd"));
		emps.add(new Employee("Ben", "CEO", 30000, "Pune"));
		emps.add(new Employee("Eve", "Manager", 220000, "BLR"));
		emps.add(new Employee("gelvin", "Developer", 3000, "Hyd"));
		emps.add(new Employee("Sujit", "Lead", 20000, "Hyd"));
		emps.add(new Employee("Minny", "Developer", 9000, "Hyd"));
		emps.add(new Employee("Benny", "Lead", 13000, "BLR"));
		emps.add(new Employee("Bent", "CEO", 32000, "Pune"));
		emps.add(new Employee("Sujjy", "Manager", 21000, "Hyd"));

		// PREDEICATE 1 - FILTER ALL MANAGERS
		Predicate<Employee> p1 = emp->emp.designation.equals("Manager");
		display(p1,emps);
		
		// PREDEICATE 2 - FILTER ALL MEMBERS OF BLR
		Predicate<Employee> p2 = emp->emp.city.equals("BLR");
		display(p2,emps);

		// PREDEICATE 3 - FILTER ALL DEV HAVING SALARY < 20000
		Predicate<Employee> p3 = emp -> emp.salary<20000;
		display(p3,emps);

		// PREDEICATE 4 - MANAGER AND BANGALORE LOCATION
		display(p1.and(p2),emps);
		
	}
	
	public static void display(Predicate<Employee> p, ArrayList<Employee> emps) {
		for (Employee emp:emps) {
			if(p.test(emp)) {
				System.out.println(emp);
			}
		}
		System.out.println("***********************************************");
	}

}