package selfTest;

public class PositiveNumberException extends Exception {
	public PositiveNumberException() {
		super("Positive Number");
	}
	
	public PositiveNumberException(String message) {
			super(message);
	}
}


/*
• 양수 값을 입력할 경우 기존에 자바에 정의되어 있는 Exception이 발생 – exerciseMethod는 해당 Exception을 main method로 propagate 함.
– main method는 해당 Exception을 처리해야 함.*/