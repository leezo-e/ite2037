package selfTest;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class HasNextLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2022001167 이조에");
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		
		try {
			inputStream = new Scanner(new FileInputStream("resource/BladeRunner.txt"));
			outputStream = new PrintWriter(new FileOutputStream("resource/NumberedRunner.txt"));
			
			String line = null;
			int count = 0;
			
			while(inputStream.hasNextLine())
			{
				line = inputStream.nextLine();
				count++;
				outputStream.println(count+ " " +line);
			}
			
			/* your code */
			/* Input File Location Example: resource/BladeRunner.txt */
			
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening files.");
			System.exit(0);
		}

		finally {

			if(inputStream != null) {
				inputStream.close();
			}
			if(outputStream != null){
				outputStream.close();
			}
		
		}
		
	}

}

/*
 * Read BladeRunner.txt using Scanner and FileInputStream (BladeRunner.txt is available in the project folder)
 * Write NumberedRunner.txt using PrintWriter and FileOutputStream
 * Add the line number at the beginning of each line in the contents of the BladeRunner.txt text file 
 * and write to the contents of the NumberedRunner.txt text file.
 */
