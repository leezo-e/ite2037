package selfTest;

public class DiscountSale extends Sale {

	private double discount;
	
	public DiscountSale() {
		super();
		discount = 0;
	}
	
	public DiscountSale(String theName, double thePrice, double theDiscount) {
		super(theName, thePrice);
		setDiscount(theDiscount);
	}
	
	public DiscountSale (DiscountSale originalObject) {
		super(originalObject);
		discount = originalObject.discount;
	}
	
	public static void announcement() {	System.out.println("This is the Discount class."); }
	
	public double bill() { 
		
		return (super.bill()*(1-discount/100));
		/* sale class의 bill(메소드를 discountslae클래스의 할인율이 적용된 값을 반환하는 bill() method override 할 것
		 * discount 값은 %이  */ 
		}
	
	public double getDiscount() { return discount; }
	
	public void setDiscount(double newDiscount) {
		if (newDiscount >= 0)
			discount = newDiscount;
		else {
			System.out.println("Error: Negative discount.");
			System.exit(0);
		}
	}
	
	public String toString() { return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + " Total cost = $" + bill()); }
	
	public boolean equal(Object obj) {
		if(obj == null)
			return false;
		else{
			DiscountSale otherEmp = (DiscountSale)obj;
			return super.equals(obj) && otherEmp.discount == discount;
		}
		/* 두 객체의 name, bill, discount가 동일할 경우 true를 반환하는 메소 */
	}
}
