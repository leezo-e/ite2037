package selfTest;

public class Manager extends Employee{

	private int officeNum;
	private String team;
	
	public Manager(String name, int employeeNum, int officeNum, String team) {
		super(name, employeeNum);
		this.officeNum = officeNum;
		this.team = team;
	}
	
	public String toString() {
		return ("Name : " + getName() + "\nLocation : " + getDepartment() + ", " + officeNum);
	}
	
	public boolean equals(Object obj) {
		
		if(this.getClass() != obj.getClass())
			return false;
		Manager otherEmp = (Manager)obj;
		return super.equals(obj) && otherEmp.officeNum == officeNum && otherEmp.team == team;
		
		/* 네임, 임플로이넘, 오피스넘, 팀이 동일할 경우 true ,
		 *  
		아닐 경우 false를 반환하는 메소드 작성.
		이 때 Superclass의 equals()를 사용한다~~~
		상속받아서 수정?
		this.equals()하면 부모클래스거야~~~~~~~~~~~
		*/
	}

}
	//self test 2 