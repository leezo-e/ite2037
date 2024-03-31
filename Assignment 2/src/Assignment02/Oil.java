package Assignment02;

public abstract class Oil implements Comparable {
	private String name; //오일 종
	private int numSales = 0; //오일 판매갯수 
	private Sale[] sales; //각 오일별로 판매갯수 배열 
	protected int costPerLiter = 0; //각 오일별로 리터당 가격 

	
	public Oil(String name, int maxSales, int cpl) {
		this.name = name;
		this.sales = new Sale[maxSales];
		this.costPerLiter = cpl;
	}
	
	public String toString() {
		return "Name: " + name + "\nTotal Sales: " + numSales; 
	}
	
	public int totalSales(int regionNum) {
		//the number of sales in the region. 그 지역의 sales 합계
		int total = 0;
        for (int i = 0; i < numSales; i++) {
            if (sales[i].regionNum == regionNum) {
                total ++;
            }
        }
        return total;
		
	}
	
	public int totalCost(int regionNum) {
		int totalCost = 0;
        for (int i = 0; i < numSales; i++) {
            if (sales[i].regionNum == regionNum) {
                totalCost += sales[i].cost;
            }
        }
        return totalCost;
	}
	
	public int totalQuantity(int regionNum) {
		 int totalQuantity = 0;
	     for (int i = 0; i < numSales; i++) {
	    	 if (sales[i].regionNum == regionNum) {
	    		 totalQuantity += sales[i].liters;
	         }
	     }
	     return totalQuantity;
	}
	
	public abstract int getPrice(int quantity);
	
	
	@Override
	public int compareTo(Object obj) {
	    Oil tmp = (Oil) obj;
	    /*if (this.numSales > tmp.numSales) {
	        return -1;
	    } else if (this.numSales < tmp.numSales) {
	        return 1;
	    } else {
	        return 0;
	    }
	    
	    */
	    return tmp.numSales-this.numSales;
	}
	
	public synchronized void addSale(Sale s) {

		sales[numSales++] = s;	
	}

}
