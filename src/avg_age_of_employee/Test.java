package avg_age_of_employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given an employee object,print the average age  of male 
//and female employees

public class Test {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Mohit", "Mohit@gmail.com",24, "M");
		Employee e2 = new Employee("Ramesh", "Ramesh@gmail.com",45, "M");
		Employee e3 = new Employee("Radha", "Radha@gmail.com",27,"F");
		Employee e4 = new Employee("Monika", "Monika@gmail.com",19,"F");
		
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4);
		
		
		
		Map<String, Double> ans = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(ans);
		
		
		
	}

}
