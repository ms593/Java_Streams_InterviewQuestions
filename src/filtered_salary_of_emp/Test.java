package filtered_salary_of_emp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Print all employees with salry greater than 20000 and inrease
//their salary by 1000
public class Test {
	
	public static void main(String[] args) {
	 Emp e1 = new Emp("Ravi",15000.00);
	 Emp e2 = new Emp("Raj",22000.50);
	 Emp e3 = new Emp("Mohit",25500.50);
	 
	 List<Emp> empList = Arrays.asList(e1,e2,e3);
	 
	 empList.stream().filter(x->x.getSalary()>20000).peek(x->x.setSalary(x.getSalary()+1000)).collect(Collectors.toList()).forEach(System.out::println);
	}

}
