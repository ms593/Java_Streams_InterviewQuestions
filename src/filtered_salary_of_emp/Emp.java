package filtered_salary_of_emp;

public class Emp {
	
	private String name;
	private Double salary;
	
	

	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + "]";
	}

	public Emp(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
