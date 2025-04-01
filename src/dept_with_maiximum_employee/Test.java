package dept_with_maiximum_employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
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
	Employee e6 = new Employee("Sneha", "HR", 65000);
	
	
	List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);
	
	
	Map<String, Long> ans = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
	
	System.out.println(ans);
	
	Optional<Entry<String, Long>> max = ans.entrySet().stream().max(Map.Entry.comparingByValue());
	
	max.ifPresent(x->System.out.println(x.getKey()+" ="+x.getValue()));
	
	}

}
