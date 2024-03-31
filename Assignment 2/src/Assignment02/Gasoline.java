package Assignment02;

public class Gasoline extends Oil {
	
	private int vat = 0;

	
	public Gasoline(String name, int maxSales, int cpl, int vt) {
		super(name, maxSales, cpl);
		this.vat = vt;
	}
	
	public String toString() {
		return super.toString() + "\nVAT: " + this.vat + "%\nPrice: " + getPrice(1) + "\n";
	}
	
	

	public int getPrice(int quantity) {
		double vatPercent = vat / 100.0;
		double totalCostPerLiter = this.costPerLiter + (this.costPerLiter * vatPercent);
	    return (int) (totalCostPerLiter * quantity);
		
	}
	
}
