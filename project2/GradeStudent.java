package project2;

import java.util.Scanner;

public class GradeStudent {

	public static void main(String[] args) {
		
		begin(); 
		report();

	}
	
	static Scanner input = new Scanner(System.in);
	static int totalWeightScore=100;
	
	public static void begin() {
		System.out.println("This program reads exam/homework scores and reports your overall course grade");
		System.out.println("");
	}
	
	//nhap va tinh toan diem thi giua ki
	public static double midTerm() {
		System.out.println("midTerm:");
		System.out.print("Weight (0-100)?  ");
		int	weightScore;

		do {
			weightScore = input.nextInt();
		}while(weightScore<0 || weightScore>totalWeightScore);
		totalWeightScore -=weightScore;
		
		System.out.print("Score earned?  ");
		int midScore = input.nextInt();
		System.out.print("Were scores shifted (1=yes, 2=no)? ");
		int n = input.nextInt();
		
		int totalPoint;
		if(n==1) {
			System.out.print("Shift amount? ");
			int amountScore = input.nextInt();
			totalPoint = midScore + amountScore;
			if(totalPoint>=100) {
				totalPoint=100;
			}
		}else {
			
			totalPoint = midScore;
		}
		 
		System.out.println("total Points =  " + totalPoint +" / 100");
		
		double WeightedMidtermore =(double)(totalPoint * weightScore) / 100 ;
		System.out.println("Weighted score =  " +Math.round(WeightedMidtermore*10.0)/10.0 +" / " +weightScore);
		System.out.println("-------------------------*********-----------------------------");
				
		return WeightedMidtermore;
			 
		}
	
	//nhap va tinh toan diem thi cuoi ki	
	public static double finalTerm() {
		System.out.println("Final term:");
		
		System.out.print("Weight (0-100)?  ");
		int weightScore;
		do {
			weightScore = input.nextInt();	
		}while(weightScore<0 || weightScore>totalWeightScore);
		totalWeightScore -=weightScore;
		
		System.out.print("Score earned?  ");
		int midScore = input.nextInt();
		System.out.print("Were scores shifted (1=yes, 2=no)? ");
		int n = input.nextInt();
		
		int totalPoint;
		if(n==1) {
			System.out.print("Shift amount? ");
			int amountScore = input.nextInt();
			totalPoint = midScore + amountScore;
			if(totalPoint>=100) {
				totalPoint=100;
			}
		}else{
			
			totalPoint = midScore;
		}
		 
		System.out.println("total Points =  " + totalPoint +" / 100");
		
		double weightedFinalScore =(double) (totalPoint * weightScore) / 100;
		System.out.println("Weighted score =  " + Math.round(weightedFinalScore*10.0)/10.0 +" / " +weightScore);
		System.out.println("-----------------------*********-----------------------------");
		
		return weightedFinalScore;
	}
	
	//nhap va tinh toan diem baitap ve nha 	
	public static double homework() {
		System.out.println("Homework:");
		System.out.print("Weight (0-100)?  ");
		int weightScore;
		do {
			weightScore = input.nextInt();	
		}while(weightScore!=totalWeightScore);
		
		System.out.print("Number of assignments?  ");
		int numberAsm = input.nextInt();
		int totalPointAsm=0;
		int totalMaxAsm =0;
		for(int i=1; i<=numberAsm; i++) {
			System.out.print("Assignment " + i + " score and max? ");
			int score = input.nextInt();
			int max = input.nextInt();
			totalPointAsm += score;
			totalMaxAsm += max;
		}
		if(totalPointAsm>150) {
			 totalPointAsm=150;
		 }
		 if(totalMaxAsm>150) {
			 totalMaxAsm=150;
		 }
		System.out.print("How many sections did you attend? ");	
		int section = input.nextInt();
		final int maxPointsSection = 30;
		int sectionPoint = section *5;
		if(sectionPoint>maxPointsSection) {
			sectionPoint = maxPointsSection;
		}
		System.out.println("Section points = " + sectionPoint +" / " +maxPointsSection);
		totalPointAsm += sectionPoint;
		 
		 System.out.println("Total Points = " + totalPointAsm + " / " + (totalMaxAsm + maxPointsSection));
		 double weightedHomeworkScore = (double)(totalPointAsm * weightScore)/(totalMaxAsm + maxPointsSection);
		 System.out.println("Weighted score = " + Math.round(weightedHomeworkScore * 10.0)/10.0 + " / " + weightScore);
		 System.out.println("-----------------------*********-----------------------------");
		 System.out.println("");
		 return weightedHomeworkScore;
		 
	}
	
	//tinh toan hien thi kq gap va nhan xet
	public static void report() {
		
		double grade =  midTerm() + finalTerm() +  homework();
		System.out.println("Overall percentage = " + Math.round(grade*10.0)/10.0);
		double GAP;
		if(grade>=85) {
			GAP = 3.0;
			System.out.println("Your grade will be at least: " + GAP);
			System.out.println("perfectly");
			
		}else if(grade>=75) {
			GAP = 2.0;
			System.out.println("Your grade will be at least: " + GAP);
			System.out.println("quite good");
		}else if(grade >=60) {
			GAP = 1.0;
			System.out.println("Your grade will be at least: " + GAP);
			System.out.println("must try harder");
		}else {
			GAP = 0.0;
			System.out.println("Your grade will be at least: " + GAP);
			System.out.println("Retest");
		}
		
		
	}


	
}
