package selfTest;

public class EmployeeManager {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Walter White", 42, "Manager", 20000);
		Employee employee2 = new Employee("Jesse Pinkman", 32, "Assistant Manager", 12000, 7);
		Employee employee3 = new Employee("Jimmie McGill", 38);
		Employee employee4 = new Employee("Chunk McGill", 40);
		Employee employee5 = new Employee("Walter White", 42, "Manager", 20000);
		
		employee1.setSalary(21000);
		
		employee1.outInfo();
		System.out.println("");
		employee2.outInfo();
		System.out.println("");
		
		String vac1 = employee3.vacation(10);
		System.out.println(vac1);
		System.out.println("");
		String vac2 = employee2.vacation(10);
		System.out.println(vac2);
		System.out.println("");
		
		employee3.outInfo();
		System.out.println("");
		
		boolean b1 = employee1.equals(employee2);
		boolean b2 = employee1.equals(employee5);
		System.out.println(b1);
		System.out.println(b2);
		
		
	}

}
