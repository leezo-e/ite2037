package selfTest;

public class PersonInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person("Juhyun", new Date("March", 29, 1993), null);
		Person person2 = new Person("Hoohyun", new Date("March", 29, 1993), new Date("March", 2, 2018));
		
		Person person3 = new Person(person2); // Modify with Copy Constructor
		
		person3.set("Fakehyun", new Date("March", 29, 1993), new Date("April", 5, 2019));
		
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		System.out.println();
		
		Date fakeDate = person1.getBirthDate();
		fakeDate.setDate("March", 1, 1893);
		System.out.println(person1.toString());
	}
}

/*person3 person2를 분리시키기 위해 deep copy
1. copy constructor를 작성하기
2. person3 객체를 copy constructor를 통해 생성하는 것으로 수정
즉, shallow를 deep으로 바꿔. person3을 수정해도 person2가 수정되 않도록 변

수정 전 코드에서는 person1 객체를 통하지 않아도 사람1의 출생일을 변경할 수 있는 privacy leak 발생
-> person 클래스에서 privacy leak 없애기, person클래스의 출생일을 반환하는 Mutator method를 수정해서 출생일을 변경할 수 없도록 변경 

*/