package Assignment02;

public class SimTest {

	private static final String INPUTFILE = "resource/inputfile.txt";
	private static final String OUTPUTFILE = "resource/outputfile.txt";
	
	
	public static void main(String[] args) {
	
		System.out.println("이조에 2022001167\n");
		OilSim eSim = new OilSim(INPUTFILE, OUTPUTFILE);
		eSim.runSimulation();
		
	}
}