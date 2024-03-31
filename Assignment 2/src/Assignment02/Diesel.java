package Assignment02;

public class Diesel extends Oil {
	
	private int vat = 0; //부가가치세.. 리터당 
	private int envtax = 0; //환경부담금 ... 리터당 
	
	public Diesel(String name, int maxSales, int cpl, int vt, int ent) {
		super(name, maxSales, cpl);
		this.vat = vt;
		this.envtax = ent;
	}
	
	public String toString() {
		return super.toString() + "\nVAT: " + this.vat + "%\nEnvTax: " + this.envtax + "%\nPrice: " + getPrice(1) + "\n"; 
		
    
	}
	
	
	
	public int getPrice(int quantity) {
		double vatPercent = vat / 100.0;
        double envTaxPercent = envtax / 100.0;
        double totalCostPerLiter = this.costPerLiter + (this.costPerLiter * vatPercent) + (this.costPerLiter * envTaxPercent);
        return (int) (totalCostPerLiter * quantity);
		
	}
	
}
