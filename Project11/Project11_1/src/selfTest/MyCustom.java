package selfTest;

import java.util.Arrays;

public class MyCustom implements MyInterface {
	private Integer move_type = 0;
	private Boolean isAttack = false;
	
	public void move(String key) {
		if (key == "w")
			move_type = 1;
		else if (key == "s")
			move_type = 2;
		else if (key == "a")
			move_type = 3;
		else if (key == "d")
			move_type = 4;
		else 
			move_type = 5;
	}
	
	public void attack(String key) {
		
		if (key == "spacebar")
			isAttack = true;
		else 
			isAttack = false;
	}
	
	public void sortItem(Item[] itemList) {
		
		Arrays.sort(itemList);
		//이게 안 되면 아예 직접 구현 해보도록 하자..
	}
	
	public Integer getMoveType() {
		
		return this.move_type;
	}
	
	public Boolean getIsAttack() {
		
		return this.isAttack;
	}
}

/*이 클래스는 추상 클래스가 아님! 그래서 모든 메소드가 아래의 조건의 맞게 구현되어야 함

 */