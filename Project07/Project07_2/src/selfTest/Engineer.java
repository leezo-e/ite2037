package selfTest;

public class Engineer extends Employee{
	private String workZone;
	private String project;
	
	public Engineer(String name, int employeeNum, String workZone, String project) {
		super(name, employeeNum);
		this.workZone = workZone;
		this.project = project;
	}
	
	public boolean equals(Object obj) {
		
		if(this.getClass() != obj.getClass())
			return false;
		Engineer otherEmp = (Engineer)obj;
		return super.equals(obj) && otherEmp.workZone == workZone;
	}
		
		
		 /* engineer class's name, empnum, workzone 동일할 때 
		 * + workzone만 하면 되는
		 * 반환하는 건 superclass Method*/
	
	//engineer class 자체가 
	public String toString() {
		
		return ("Name :" + getName() + "\nEmp# : "+getEmployeeNum() +"\nlocation : "+ getDepartment()+", "+ workZone);
		
	}
}
