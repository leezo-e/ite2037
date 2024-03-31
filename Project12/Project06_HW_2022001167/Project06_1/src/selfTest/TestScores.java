package selfTest;

import java.util.Scanner;

public class TestScores {
	public static final int MAX_NUMBER_SCORES = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] scores = new double[MAX_NUMBER_SCORES];
		int counting = 0;
		
		System.out.println("This program reads test scores and shows");
		System.out.println("how much each differs from the average.");
		System.out.println("Enter test scores:");
		
		counting = fillArray(scores);
		showDifference(scores, counting);
		
	}

	public static int fillArray(double[] scores) {
		
		int cnt = 0;
		System.out.println("Mark the end of the list with a negative number.");	
		Scanner keyboard = new Scanner (System.in);
		for (int i = 0; i < scores.length; i++) {
			double temp = keyboard.nextDouble();
			if (temp < 0)
				break;
			else
				scores[i] = temp;
			cnt++;
			if (cnt >MAX_NUMBER_SCORES)
				break;
		}
		
		return cnt;
	}
	
	public static void showDifference(double[] scores, int count)
	{
		double average = computeAverage(scores, count);
	
		System.out.println("Average of the "+count+ " scores = " + average);
		System.out.println("The scores are: ");
		
		for (int i = 0; i < count; i++) {
			System.out.println(scores[i]+" differs from average by " + (scores[i] - average));
		}
	}
	
	public static double computeAverage(double [] scores, int count)
	{	
		double sum = 0;
		for (int i = 0; i < count; i++) {
			sum += scores[i];
		}
		
		return sum/count;
	}
}
