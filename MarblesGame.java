import java.util.Scanner;
import java.util.Random;

public class MarblesGame {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		// IA
		
		int marblesIA = 10;
		int marblesminIA = 1;
		int betIA;
		int choiceIA = 2;
		int guessIA;
		
		
		// PLAYER
		
		int marbles = 10;
		int bet;
		String guess;
		
		// COMMANDS
		boolean turns=true;
		
		System.out.println("Welcome to the Marble Game from SquidGame!");
		System.out.println("Let's begin by explaining the rules");
		
			System.out.println("-----------------------------------------------------");
			System.out.println("Both you and the IA recieve a bag with 10 marbles");
			System.out.println("Each turn, you bet an amount of the marbles left in your bag");
			System.out.println("You'll have to guess if your opponent chose an even or odd amount");
			System.out.println("If you guess right, you'll recieve the smallest bet amount");
			System.out.println("But if you guess wrong, you'll lose it");
			System.out.println("The game ends when one of the players loses all their marbles");
			System.out.println("-----------------------------------------------------");
			System.out.println("Get ready, you guess first!");
			
			
			
		while (marbles>0 && marblesIA>0) 
		{
			//PLAYER TURN
			if(turns==true) {
				if(marblesIA>marblesminIA) {
					// BOTH PLAYERS BET
					System.out.println("Place your bet:");
					bet = scan.nextInt();
					betIA = 1+rand.nextInt((marblesIA-1)+1);		
										
					//PLAYER GUESSES
					System.out.println("Make your guess:");
					guess = scan.next();
						//PLAYER GUESSES EVEN AND IA BETS EVEN
						if(guess.contains("even") && betIA%2==0)
						{
							System.out.println("You won the round!");
								//PLAYER BETS HIGHER
								if(bet>betIA) {
									
									marbles += betIA;	marblesIA -= betIA;
																											
								}
								//PLAYER BETS LOWER
								if(bet<betIA) {
									
									marbles +=bet; 	marblesIA -=bet;	
									
								}
								//BOTH BET THE SAME AMOUNT
								if(bet==betIA) {
									
									marbles +=bet; 	marblesIA -=bet;	
																		
								}	
														
						}
						//PLAYER GUESSES EVEN AND IA BETS ODD
						if(guess.contains("even") && betIA%2!=0)
						{
							System.out.println("You lost the round!");
								if(bet>betIA) {
	
									marbles -= betIA;	marblesIA += betIA;
																		
								}
								if(bet<betIA) {
									
									marbles -=bet; 	marblesIA +=bet;
								}
								if(bet==betIA) {
									
									marbles -=bet; 	marblesIA +=bet;
																		
								}
								
						}
						//PLAYER GUESSES ODD AND IA BETS ODD
						if(guess.contains("odd") && betIA%2!=0)
						{
							System.out.println("You won the round!");
								if(bet>betIA) {
	
									marbles += betIA;	marblesIA -= betIA;
																		
								}
								if(bet<betIA) {
									
									marbles +=bet; 	marblesIA -=bet;
								}
								if(bet==betIA) {
									
									marbles +=bet; 	marblesIA -=bet;
									
								}	

						}
						//PLAYER GUESSES ODD AND IA BETS EVEN
						if(guess.contains("odd") && betIA%2==0)
						{
							System.out.println("You lost the round!");
								if(bet>betIA) {
	
									marbles -= betIA;	marblesIA += betIA;
																		
								}
								if(bet<betIA) {
									
									marbles -=bet; 	marblesIA +=bet;
								}
								if(bet==betIA) {
									
									marbles -=bet; 	marblesIA +=bet;
																		
								}
								
						}
					
						System.out.println("You have: "+marbles+" marbles now");
						turns = false;
				}
															
				else {
					System.out.println("Place your bet:");
					bet = scan.nextInt();
					betIA = 1;
					
					
					System.out.println("Make your guess:");
					guess = scan.next();
					
						if(guess.contains("even") && betIA%2==0)
						{
							System.out.println("You won the round!");
								if(bet>betIA) {
									
									marbles += betIA;	marblesIA -= betIA;
																											
								}
								if(bet<betIA) {
									
									marbles +=bet; 	marblesIA -=bet;	
									
								}
								if(bet==betIA) {
									
									marbles +=bet; 	marblesIA -=bet;	
																		
								}	
														
						}
						if(guess.contains("even") && betIA%2!=0)
						{
							System.out.println("You lost the round!");
								if(bet>betIA) {
	
									marbles -= betIA;	marblesIA += betIA;
																		
								}
								if(bet<betIA) {
									
									marbles -=bet; 	marblesIA +=bet;
								}
								if(bet==betIA) {
									
									marbles -=bet; 	marblesIA +=bet;
																		
								}
								
						}
						if(guess.contains("odd") && betIA%2!=0)
						{
							System.out.println("You won the round!");
								if(bet>betIA) {
	
									marbles += betIA;	marblesIA -= betIA;
																		
								}
								if(bet<betIA) {
									
									marbles +=bet; 	marblesIA -=bet;
								}
								if(bet==betIA) {
									
									marbles +=bet; 	marblesIA -=bet;
									
								}	

						}
						if(guess.contains("odd") && betIA%2==0)
						{
							System.out.println("You lost the round!");
								if(bet>betIA) {
	
									marbles -= betIA;	marblesIA += betIA;
																		
								}
								if(bet<betIA) {
									
									marbles -=bet; 	marblesIA +=bet;
								}
								if(bet==betIA) {
									
									marbles -=bet; 	marblesIA +=bet;
																		
								}
								
						}
					
						System.out.println("You have: "+marbles+" marbles now");
						turns = false;
						
				}
				
			}
			//IA TURN
			else {
							
				if(marblesIA>marblesminIA) {
					System.out.println("Place your bet:");
					bet = scan.nextInt();
					betIA = 1+rand.nextInt((marblesIA-1)+1);		
										
					//IA GUESSES
					guessIA = rand.nextInt(choiceIA);
					
					if(guessIA==0 && bet%2==0)
					{
						System.out.println("The IA guessed odd!");
						System.out.println("You won the round!");
							if(bet>betIA) {
								
								marbles += betIA;	marblesIA -= betIA;
																										
							}
							if(bet<betIA) {
								
								marbles +=bet; 	marblesIA -=bet;	
								
							}
							if(bet==betIA) {
								
								marbles +=bet; 	marblesIA -=bet;	
																	
							}	
													
					}
					if(guessIA==0 && bet%2!=0)
					{
						System.out.println("The IA guessed odd!");
						System.out.println("You lost the round!");
							if(bet>betIA) {

								marbles -= betIA;	marblesIA += betIA;
																	
							}
							if(bet<betIA) {
								
								marbles -=bet; 	marblesIA +=bet;
							}
							if(bet==betIA) {
								
								marbles -=bet; 	marblesIA +=bet;
																	
							}
							
					}
					if(guessIA==1 && bet%2!=0)
					{
						System.out.println("The IA guessed even!");
						System.out.println("You won the round!");
							if(bet>betIA) {
								
								marbles += betIA;	marblesIA -= betIA;
																										
							}
							if(bet<betIA) {
								
								marbles +=bet; 	marblesIA -=bet;	
								
							}
							if(bet==betIA) {
								
								marbles +=bet; 	marblesIA -=bet;	
																	
							}	
													
					}
					if(guessIA==1 && bet%2==0)
					{
						System.out.println("The IA guessed even!");
						System.out.println("You lost the round!");
							if(bet>betIA) {

								marbles -= betIA;	marblesIA += betIA;
																	
							}
							if(bet<betIA) {
								
								marbles -=bet; 	marblesIA +=bet;
							}
							if(bet==betIA) {
								
								marbles -=bet; 	marblesIA +=bet;
																	
							}
							
					}

					System.out.println("You have: "+marbles+" marbles now");
					turns = true;
										
				}
				
			}
						
		}
		
		if(marbles==0) {System.out.println("GAME OVER");	System.out.println("YOU DIED");}
		if(marblesIA==0) {System.out.println("GAME OVER");	System.out.println("YOU SURVIVED");}
		
	}
}
