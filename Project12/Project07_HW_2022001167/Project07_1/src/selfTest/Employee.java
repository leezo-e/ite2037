package selfTest;

public class Employee {

	private String name;
	private int employeeNum;
	private String department = "No Dept";
	
	public Employee(String name, int employeeNum) {
		this.name = name;
		this.employeeNum = employeeNum;
	}
	
	public Employee(String name, int employeeNum, String deaprtment) {
		this.name = name;
		this.employeeNum = employeeNum;
		this.department = department;
	}
	
	public String getDepartment() {
		
		return department; 
	}
	
	public String getName() {

		return name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Employee anotherEmp) {
		if(this.name.equals(anotherEmp.name)&&this.employeeNum == anotherEmp.employeeNum)
			return true;
		else 
			return false;
		/* employee name 과 employeeNum이 같은 경우 true, 아닐 경우 false를 반환 */
	}
	
	public String toString() {
		String info = "";
		
		info += "Name : "+ getName() +"\nEmp# : "+employeeNum;
		
		return info;
		/* name과 employeeNum을 반환하는 method
		 * 형식 : "Name : [name] \nEmp# : [employeeNum] */
	}
}
