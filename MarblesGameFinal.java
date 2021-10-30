import java.util.Scanner;
import java.util.Random;

public class MarblesGameFuncions {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		// IA
		
		int marblesIA = 10;
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
		System.out.println("If you guess right, you'll recieve the smallest bet played that round");
		System.out.println("But if you guess wrong, you'll lose it");
		System.out.println("The game ends when one of the players loses all their marbles");
		System.out.println("-----------------------------------------------------");
		System.out.println("Get ready, you guess first!");
					
		while (marbles>0 && marblesIA>0) 
		{
			//PLAYER TURN
			if(turns==true) {
					// BOTH PLAYERS BET
					System.out.println("Place your bet:");
					bet = scan.nextInt();
					//PLAYER CANT BET LOWER OR HIGHER THAN HIS ACTUAL MARBLES
					while (bet<=0 || bet>marbles) {
						System.out.println("Please try again:");
						bet = scan.nextInt();
					}
					betIA = 1+rand.nextInt(marblesIA);		
					//PLAYER GUESSES
					System.out.println("Make your guess, even or odd:");
					guess = scan.next();
					
						//PLAYER GUESSES RIGHT
						if((guess.contains("even") && betIA%2==0) || (guess.contains("odd") && betIA%2!=0))
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
						//PLAYER GUESSES WRONG
						if((guess.contains("even") && betIA%2!=0) || (guess.contains("odd") && betIA%2==0))
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
						
			}else {//IA TURN
					System.out.println("Place your bet:");
					bet = scan.nextInt();
					while (bet<=0 || bet>marbles) {
						System.out.println("Please try again:");
						bet = scan.nextInt();
					}
					betIA = 1+rand.nextInt(marblesIA);		
					//IA GUESSES
					guessIA = rand.nextInt(choiceIA);
					
					if((guessIA==0 && bet%2==0) || (guessIA==1 && bet%2!=0))
					{
						System.out.println("The IA guessed wrong!");
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
					if((guessIA==0 && bet%2!=0) || (guessIA==1 && bet%2==0))
					{
						System.out.println("The IA guessed right!");
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
		
		if(marbles==0) {System.out.println("GAME OVER");	System.out.println("YOU DIED!");}
		if(marblesIA==0) {System.out.println("GAME OVER");	System.out.println("YOU SURVIVED!");}
		
	}
}
