package Assignment02;

public class Biofuel extends Oil {
	
	private int discount = 0; //얘는 별도의 세금이 없어서 1000원을 할인 해드려요 

	
	public Biofuel(String name, int maxSales, int cpl, int disc) {
		super(name, maxSales, cpl);
		this.discount = disc;
	}
	
	public String toString() {
		return super.toString() + "\nDiscount: " + this.discount + "\nPrice: "+ getPrice(1) + "\n";
	}
	
	

	public int getPrice(int quantity) {
		//get price는 할인이 감소한 수량을 기준으로 총가격을 반환한
		return (this.costPerLiter - this.discount) * quantity; //이게 -1000인인지, 리터당 -1000인지 확인해보기 
	}
	
}
