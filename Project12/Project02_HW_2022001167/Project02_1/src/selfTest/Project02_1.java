package selfTest;

import java.util.Scanner;

public class Project02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generate the Scanner class
		
		int n = 0;
		
		System.out.print("Enter the number: ");
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		
		if (n < 0) {
			System.out.println(n + " is less than 0");
			
		}else if (n >= 0 && n < 100){
			System.out.println(n+" is greater than or equal to 0 and less than 100");
		}else {
			System.out.println(n+" is greater than or equal to 100");
		}
		
		
	}

}
