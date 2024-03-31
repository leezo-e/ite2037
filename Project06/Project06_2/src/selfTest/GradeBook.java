package selfTest;

import java.util.Scanner;

public class GradeBook {
	private int numberOfStudents;
	private int numberOfQuizzes;
	
	private int [][] grade;
	
	private double[] studentAverage;
	private double[] quizAverage;

	public GradeBook()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of Students:");
		numberOfStudents = keyboard.nextInt();
		
		System.out.println("Enter the number of Quizzes:");
		numberOfQuizzes = keyboard.nextInt();
		
		int array[][] = new int [numberOfStudents][numberOfQuizzes];
		for (int i = 0 ; i < numberOfStudents; i++) {
			for (int j = 0 ; j < numberOfQuizzes; j++) {
				System.out.println("Enter the score for student "+ (i+1) + " on quiz " + (j+1));
				int tmp=  keyboard.nextInt();
				array[i][j] = tmp;
			}
		}
		grade = array;
		
		/* 행 퀴즈 개수, 열 학생 수 Take inputs from the keyboard and store the score  */
		
		fillStudentAverage();
		fillQuizAverage();
	}
	

	
	private void fillStudentAverage()
	{	
		double arrayStu[] = new double[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			int temp = 0;
			for (int j = 0; j < numberOfQuizzes; j++) {
				temp += grade[i][j];
			}
			arrayStu[i] = temp/(double)numberOfQuizzes;
		}
		
		studentAverage = arrayStu;
	}
	
	private void fillQuizAverage()
	{
		double arrayQuiz[] = new double[numberOfQuizzes];
		for (int j = 0; j < numberOfQuizzes; j++) {
			int temp = 0;
			for (int i = 0; i < numberOfStudents; i++) {
				temp += grade[i][j];
			}
			arrayQuiz[j] = temp/(double)numberOfStudents;


		}
		quizAverage = arrayQuiz;
	}
	
	
	public void display()
	{
		for(int studentNumber =1; studentNumber <= numberOfStudents; studentNumber++)
		{
			System.out.print("Student " + studentNumber + " Quizzes: ");
			for(int quizNumber = 1;quizNumber <= numberOfQuizzes; quizNumber++)
				System.out.print(grade[studentNumber-1][quizNumber-1] + " ");
			System.out.println("Ave = " + studentAverage[studentNumber-1]);
		}
		
		System.out.println("Quiz average : ");
		
		for(int quizNumber = 1; quizNumber <= numberOfQuizzes;quizNumber++)
			System.out.print("Quiz "+quizNumber + " Ave = "+ quizAverage[quizNumber - 1] + " ");
		System.out.println();
	}
	
	
}