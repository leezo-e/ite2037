package Assignment02;

public class Region extends Thread {

	private String regionName;			// The name of the area
	private int regionNum;			// The number of the area
	private int overallSales;			// Overall sales of the area
	private Oil[] oil;	// An array of the candidates of the election
	
	public Region(String regionName, int regionNum, int totalSales, Oil[] oil) {
		this.regionName = regionName;
		this.regionNum = regionNum;
		this.overallSales = totalSales;
		this.oil = oil;
	}
	
	public String getRegionName() {
		return regionName;
	}
	
	public int getRegionNum() {
		return regionNum;
	}
	
	public void generateSales() {
		int all = overallSales;
		for (int i = 0; i < oil.length; i++) {
			int sale;
			if(i==oil.length - 1) {
				sale = all;
	        }
			else {
				sale = (int)(Math.random()*all);
			}
			all -= sale;
			for (int j = 0; j < sale; j++) {
				int liter = (int)(Math.random()*10);
				int cost = oil[i].getPrice(liter);
				Sale s = new Sale(regionNum, liter, cost, sale);
				oil[i].addSale(s);
			}
			
		}
	}
	
	
	public void run() {
		generateSales();
	}
}
