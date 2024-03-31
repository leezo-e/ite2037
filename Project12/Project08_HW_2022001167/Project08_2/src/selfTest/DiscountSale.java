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
	
	public DiscountSale(DiscountSale originalObject) {
		super(originalObject);
		discount = originalObject.discount;
	}

	public static void announcement() {	System.out.println("This is the Discount class."); }
	
	public double bill() { return (1 - discount/100)*getPrice(); }
	
	public double getDiscount() { return discount; }
	
	public void setDiscount(double newDiscount) {
		if (newDiscount >= 0)
			discount = newDiscount;
		else {
			System.out.println("Error: Negative discount.");
			System.exit(0);
		}
	}
	
	public String toString() { return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + " Deliver Fee = $" + deliverFee()); }
	
	public boolean equal(Object obj) {
		if(obj==null)
			return false;
		else if(getClass()!=obj.getClass())
			return false;
		else {
			DiscountSale temp = (DiscountSale) obj;
			return (super.equals(temp) && (discount == temp.discount));
		}
	}
	
	public double deliverFee() {
		
		if(discount >= 80)
			return 3;
		else if (discount < 80 && discount >= 30)
			return 2;
		else 
			return 0;
		/* 매장에서는 제품의 할인율이 낮을 경우 무료 배송을 해주는 서비스를 진행 중
		 * 할인율에 따라 달라지는 메소드를 정의
		 * 할인율 >= 80% shipping cost $3 
		 * 30퍼 <= 할인율 < 80퍼 : 배송비용 2달러
		 * 할인율 < 30퍼: 배송비용 없음 */
	}
}
