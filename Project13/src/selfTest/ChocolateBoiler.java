package selfTest;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	public ChocolateBoiler() { /*Change the header 완료했음. public -> private */
		empty = true;
		boiled = false;
	}  
	
	private volatile static ChocolateBoiler uniqueInstance;
	public static ChocolateBoiler getInstance() { /*Change the header*/
		if(uniqueInstance == null) {
			synchronized(ChocolateBoiler.class){
					if(uniqueInstance == null) {
						uniqueInstance = new ChocolateBoiler();
					}
			}
		}
		return uniqueInstance;
		
	}
	   
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			System.out.println("Filling with mixture");
		}else {
		System.out.println("Already filled");
		}
	}//보일러에 밀크/초콜릿 믹스를 채워, 보일러를 채우기 위해서 이것은 empty해야 하며, 이게 다 차면 우리는 엠티, boiled, empty flags를 set해야 함 
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
			System.out.println("Draining the mixture");
		}
		else {
		System.out.println("Already drained");
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
			System.out.println("Boiling the mixture");
		}
		else {
		System.out.println("Already boiled");
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
