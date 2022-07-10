package project1;

import java.util.Scanner;
import java.util.Random;

public class LuckyNumber {

	public static void main(String[] args) {
		
		
		System.out.println("Tôi đang nghĩ một số trong khoảng từ 0 đến 100...");
		play();
		
	}
		
		public static void play() {
				final int maxinum =101;
				int number;
				String answer;
				int totalGames =0;
				int totalGuess=0;
				double guessAvg;
				int bestGame=101;
				
				
				do {
						Scanner input = new Scanner(System.in);
						int randNum = (int)(Math.random() * maxinum);
						System.out.println("Random number is " + randNum);
						int guess =0;
						
						
						do {
							System.out.print("bạn đoán?  ");
							number = input.nextInt();
							guess++;
							if(number > randNum) {
								System.out.println("số may mắn nhỏ hơn số dự đoán của bạn. ");	
							}else if(number < randNum){
								System.out.println("số may mắn lớn hơn số dự đoán của bạn. ");	
							}else{
								System.out.println("chúc mừng bạn đã đoán đúng số may mắn sau  "  + guess+ "lần dự đoán.");
								System.out.println("-------------------------*********-----------------------------");
							}
						}while(number != randNum);
						
						System.out.print("bạn có chơi tiếp ?  ");
						answer = input.next();
						
						
						totalGuess+=guess;
						if(bestGame >=guess) {
							bestGame=guess;
						}
						totalGames++;
						
				 }while(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"));		
						guessAvg = (double)totalGuess/totalGames;
					
				report(totalGames, totalGuess, guessAvg, bestGame);
				return ;
		}
			
				//ket qua tong quat game
				public static void report(int totalGames, int totalGuess, double guessAvg, int bestGame) {
					System.out.println("kết quả tổng quát của trò chơi:" );
					System.out.println("Tổng số lần chơi  =" + totalGames);
					System.out.println("tổng số lần dự đoán  =" +totalGuess);
					System.out.println("số lần dự đoán trung bình mỗi lượt  =" + guessAvg);
					System.out.println("số lần dự đoán ít nhất  =" + bestGame);
					
				}
		
}

