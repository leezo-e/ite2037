package selfTest;

public class Employee {
	
	private String name;
	private int age;
	private String Position;
	private int salary;
	private int vacationDays;
	
	public Employee() {}
	
	public Employee(String name_, int age_) {
		name = name_;
		age = age_;
		Position = "Engineer";
		salary = 15000;
		vacationDays = 20;
	}
	
	public Employee(String name_, int age_, String Position_, int salary_) {
		name = name_;
		age = age_;
		Position = Position_;
		salary = salary_;
		vacationDays = 20;
	}
	 
	public Employee(String name_, int age_, String Position_, int salary_, int vacationDays_) {
		name = name_;
		age = age_;
		Position = Position_;
		salary = salary_;
		vacationDays = vacationDays_;
	}
	
	public void setSalary(int salary_) {
		this.salary = salary_;
		/* instance variable salary를 변경하는 set public method*/
	}
	
	public void outInfo() {
		
		System.out.println("name : "+ name);
		System.out.println("age : " + age);
		System.out.println("position : " + Position);
		System.out.println("salary : " + salary);
		System.out.println("vacationDays : "+vacationDays);
	}
	
	public String vacation(int days) {
		
		String command;
		
		if (days <= vacationDays) {
			vacationDays -= days;
			command = "Possible";
		}
		else {
			command = "impossible";
		}
		return command;
	}
	
	public boolean equals(Employee employee) {
		
		if (this.name.equals(employee.name) && this.age == employee.age)
				return true;
		else
				return false;
		
	}
	
}
