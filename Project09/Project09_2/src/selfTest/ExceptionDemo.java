package selfTest;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int inputNum;
        while (true) {
            try {
                inputNum = keyboard.nextInt();

                if (inputNum == 808)
                    break;

                exerciseMethod(inputNum);
            } catch (PositiveNumberException e) {
                System.out.println("This number is positive!");
                System.out.println("Exception is caught in main");
            }
        }
        System.out.println("End of loop");
    }

    public static void exerciseMethod(int number) throws PositiveNumberException {
        try {
            if (number > 0)
                throw new PositiveNumberException();
            else if (number < 0)
                throw new NegativeNumberException();
            else
                System.out.println("No Exception");
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            System.out.println("Exception is caught in exerciseMethod");
        } finally {
            System.out.println("In finally block");
        }
        System.out.println("After finally block");
    }
}
/*
 
• Exception을 발생시키는 ExceptionDemo 클래스를 작성할 것
– ExceptionDemo 클래스에는 사용자로부터 정수 값을 받는 main 메소드와 입력 값에
따라 exception을 발생시키는 메소드인 exerciseMethod가 있음
– ExceptionDemo 프로그램을 수행 시 다음과 같이 출력되도록 ExceptionDemo 클래 스와 NegativeNumberException을 수정할 것
• 입력값:양의정수
– In finally block
– Exception is caught in main 
• 입력값:음의정수
– This number cannot be accepted!!
– Exception is caught in exerciseMethod
– In finally block
– After finally block
• 입력값:0
– No Exception
– In finally block
– After finally block
• 입력 값: 808
– End of loop
*/
