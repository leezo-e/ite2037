package selfTest;

import java.util.ArrayList;
import java.util.Collections;

import javax.lang.model.element.Element;

public class GenericManager <T extends Comparable <T>>{
	/*generic 매개변수 T를 갖는다 generic 매개변수 타입 T는 comparable로 bound된다*/
	private ArrayList<T> cList; 

	public GenericManager() {
		/* 새로운 ArrayList 객체를 만든다 */
		cList = new ArrayList<T>();
	}
	
	public void add(T a) {
		/* generic type을 매개변수로 가지며 이를 Array list에 추가한*/
		cList.add(a);
	}
	
	public void sort() {
		Collections.sort(cList);
	}
	
	public String find(T a) {
		String result = "";
		for (int i = 0; i < cList.size(); i++){
			T element = cList.get(i);
			if(element.equals(a)) {
				result += element.toString();
			}
		}
		
		return result;
		/*generic type을 매개변수로 가지며 매개변수와 동일한 모든 객체의 문자열을 반환한 */
	}
	
	public String toString() {
		/* 이 메소드는 arraylist의 각 항목을 모두 거치며 array list 안에 있는 
		 * 모든 객체의 문자열을 반환한다  */
		String result = "";
		
		for (int i = 0; i < cList.size(); i++) {
			T element = cList.get(i);
			result += element.toString();
		}
		
		return result;
	}
}



 