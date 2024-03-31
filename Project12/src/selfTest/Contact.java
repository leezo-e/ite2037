package selfTest;

public class Contact implements Comparable<Contact>{

	/*contact class는 comparable을 implements한다 */

	private String name;
	private String telNum;
	private String email;
	
	public Contact(String name, String telNum, String email) {
		this.name = name;
		this.telNum = telNum;
		this.email = email;
	
	}
	
	public Contact(String name) {
		this.name = name;
		this.telNum = null;
		this.email = null;
	}
	
	public String getTelNum() {	return this.telNum; }
	public void setTelNum(String telNum) { this.telNum = telNum; }
	public String getEmail() { return this.email; }
	public void setEmail(String email) {this.email = email; }
	public String getName() { return this.name; }
	public void setName(String name) {this.name = name;  }
	
	public String toString() {
		return "Name: " + name + "\ttelNum: " + telNum + "\temail: " + email + "\n";
	}
	
	public boolean equals(Object obj) {
		
		if (this == obj) 
			return true;
		
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		

		Contact other = (Contact)obj;
		
		if(!this.name.equals(other.getName())) 
			return false;
		
		return true;
			
}
	
	public int compareTo(Contact obj) {
		if(obj==null) throw new NullPointerException("Object is null");
		else if(this.getClass()!=obj.getClass()) throw new ClassCastException("Object not of the same type");
		else {
			Contact otherManager = (Contact) obj;
			int compare = this.getName().compareTo(otherManager.getName());
			return compare;
		}
	}
}







