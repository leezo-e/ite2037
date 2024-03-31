package selfTest;

public class DateFirstTry {

	String month;
	int day;

	public void makeItNewYears() {
		
		month = "January";
		day = 1;
		
	}
	
	public String yellIfNewYear() {
		
		String command;
		
		if (month == "January" && day == 1){
			command = "Happy New Year!";
		}
		 else {
			 command = "Not New year's Day.";
		 }
		 return command;
		 
	}
	
}
