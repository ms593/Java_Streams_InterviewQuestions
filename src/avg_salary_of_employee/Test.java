package avg_salary_of_employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of employee,where each employee has a name,department,
//and salary.Write a Stream API solution to calculate the average salary
//for each department and display the results.
public class Test {
	
	public static void main(String[] args) {
		
	Employee e1 = new Employee("Mohit","IT",110000);
	Employee e2 = new Employee("Arjun","HR",80000);	
	Employee e3 = new Employee("Sunil","Finance",50000);	
	Employee e4 = new Employee("Mohan","Operations",90000);
	Employee e5 = new Employee("Rohan","HR",70000);
	
	
	List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);
	
	
	Map<String, Double> ans = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingInt(Employee::getSalary)));
	
	ans.forEach((dept,salary)->System.out.println(dept+" "+salary));
	
	
	
	}

}
