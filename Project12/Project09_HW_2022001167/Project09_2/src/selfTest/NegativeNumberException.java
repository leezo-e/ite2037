package selfTest;

public class NegativeNumberException extends Exception {
	public NegativeNumberException() {
		super("This number is negative!");
	}
	
	public NegativeNumberException(String message) {
		super(message);
	}
}


/*• NegativeNumberException은 Exception 클래스를 extends 하는 프로 그래머 정의 exception 클래스
• NegativeNumberException 클래스의 구성은 프로그래머 정의 exception 클래스 권고 사항에 따라 2개의 생성자를 작성해야 함
– This number cannot be accepted!! 출력은 getMessage() 메소드를 통해 이 루어져야 함.*/