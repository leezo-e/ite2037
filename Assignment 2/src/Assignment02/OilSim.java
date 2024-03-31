package Assignment02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class OilSim {

	private String outputFile;
	private int overallSales;
	private Oil[] oiltypes;
	private Region[] regions;
	
	public OilSim(String inputFile, String outputFile) {
		this.outputFile = outputFile;
		try {
			int tmpCandidate = 0;
			int tmpRegion = 0;
			
			Scanner inputStream = new Scanner(new FileInputStream(inputFile));
			while(inputStream.hasNextLine()) {
				String tmpToken = inputStream.next();
				switch(tmpToken) {
				case "TOTALSALES":
					this.overallSales = inputStream.nextInt();
					break;
				case "OIL":
					this.oiltypes = new Oil[inputStream.nextInt()];
					break;
				case "REGIONS":
					this.regions = new Region[inputStream.nextInt()];
					break;
				case "GASOLINE":
					this.oiltypes[tmpCandidate++] = new Gasoline(tmpToken, this.overallSales, inputStream.nextInt(), inputStream.nextInt());
					break;
				case "DIESEL":
					this.oiltypes[tmpCandidate++] = new Diesel(tmpToken, this.overallSales, inputStream.nextInt(), inputStream.nextInt(), inputStream.nextInt());
					break;
				case "BIOFUEL":
					this.oiltypes[tmpCandidate++] = new Biofuel(tmpToken, this.overallSales, inputStream.nextInt(), inputStream.nextInt());
					break;
				default:
					if(inputStream.hasNextInt())
						this.regions[tmpRegion++] = new Region(tmpToken, inputStream.nextInt(), inputStream.nextInt(), this.oiltypes);
					break;
					
				}
			}
			inputStream.close();
		} catch(FileNotFoundException e) {
			System.out.println("Can't read the file");
		}
	
	}
	
	public void saveData() {
		Arrays.sort(oiltypes);
		try {
			PrintWriter outputStream = new PrintWriter(new FileOutputStream(outputFile));
			for(int i=0; i<oiltypes.length; i++) {
				outputStream.println(this.oiltypes[i].toString()); //부정확 
				for(int j=0; j<regions.length; j++) {
					outputStream.println(this.regions[j].getRegionName() + ":");
					outputStream.println("Regional Sales: " + this.oiltypes[i].totalSales(this.regions[j].getRegionNum()));
					outputStream.println("Total Cost:     " + this.oiltypes[i].totalCost(this.regions[j].getRegionNum()));
					outputStream.println("Total Quantity: " + this.oiltypes[i].totalQuantity(this.regions[j].getRegionNum()));
					outputStream.println();
				}
				outputStream.println("\n=================================");	
			}
			outputStream.close();
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
	
	public void runSimulation() {
		for(int i=0; i<regions.length; i++)
			regions[i].run();
		for(int j=0; j<regions.length; j++) {
			try {
				regions[j].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Interrupted");
			}
		}
		saveData();
	}
}
