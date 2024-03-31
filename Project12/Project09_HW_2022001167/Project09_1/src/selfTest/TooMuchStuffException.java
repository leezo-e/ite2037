package selfTest;

public class TooMuchStuffException extends Exception {

    private int inputNumber;

    public TooMuchStuffException() {
        super("Too much stuff!");
    }

    public TooMuchStuffException(int number) {
        super("Too much stuff!");
        this.inputNumber = number;
    }

    public int getNumber() {
        return inputNumber;
    }
}


/*
– 10 이상의 숫자를 입력하면 발생하는 exception
– 인자가 없는 생성자를 지녀야 함
– 해당 생성자를 통해 exception이 발생할 경우 getMessage() 메소드는 “Too much stuff!”를 반환해야 함
– 하나의 int type 인자를 가지는 생성자를 지녀야 함
– 해당 생성자를 통해 exception이 발생할 경우 getNumber() 메소드는 생성자의 인자 로 사용된 값을 반환함 */