package selfTest;

public class ExpiredSale extends Sale {
	
	private double expired;
	
	public ExpiredSale() {
		super();
		setExpired(0);
	}
	
	public ExpiredSale(String theName, double thePrice, double theExpired) {
		super(theName, thePrice);
		setExpired(theExpired);
	}
	
	public void setExpired(double theExpired) {
		expired = theExpired;
	}
	
	public String toString() { return (getName() + " Price = $" + getPrice() + " Expired = " + expired + " left\n" + " Deliver Fee = $" + deliverFee()); }
	
	public double deliverFee() {
		if (expired >= 10)
			return 3;
		else if (expired < 10 && expired >=3)
			return 2;
		else if (expired < 3 && expired >1)
			return 0;
		else 
			return -1;
		/* 유통기한이 얼마 남지 않을 경우 무료배송 서비스 제공
		 * 유통기한에 따라 달라지는 메소드
		 * 유통기한 >=10: 송비용 3달러
		 * 3 <= 유통기한 < 10: 배송비용 2달러
		 * 1 < 유통기한 < 3 배송비용 없음
		 * 유통기한이 1일 이하일 경우 현장판매만 가능하므로 -1 return
		 * */
	}
	
}
