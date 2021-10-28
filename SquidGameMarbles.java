package otros;
import java.util.Scanner;
import java.util.Random;

public class SquidGameMarbles {
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
		int res;
		
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
			
		
		
		while (marbles>0 && marblesIA>0){
			
			if (turns==true)
			{
				System.out.println("Place your bet:");
				bet = scan.nextInt();
				betIA = rand.nextInt(marblesIA)+1;
				System.out.println(betIA);
				System.out.println("Make your guess:");
				guess = scan.next();
					if (guess.equalsIgnoreCase("even") && betIA%2==0) 
					{
						System.out.println("You win the round!");
						if (bet<betIA) 
						{	
							res=bet;
							marbles = marbles + res;	marblesIA = marblesIA - res;
							System.out.println("You won: "+res+" marbles");		System.out.println("You have "+marbles+" marbles left");
							turns = false;
						}
						
						if (betIA<bet) 
						{	
							res=betIA;
							marbles = marbles + res;	marblesIA = marblesIA - res;
							System.out.println("You won: "+res+" marbles");		System.out.println("You have "+marbles+" marbles left");
							turns = false;
						}else if (bet==betIA){
							res=betIA;
							marbles = marbles + res;	marblesIA = marblesIA - res;
							System.out.println("You won: "+res+" marbles");		System.out.println("You have "+marbles+" marbles left");
							turns = false;
						}
						
					}
					if (guess.equalsIgnoreCase("odd") && betIA%2!=0) 
					{
						System.out.println("You win the round!");
						if (bet<betIA) 
						{	
							res=bet;
							marbles = marbles + res;	marblesIA = marblesIA - res;
							System.out.println("You won: "+res+" marbles");		System.out.println("You have "+marbles+" marbles left");
							turns = false;
						}
						
						if (betIA<bet) 
						{	
							res=betIA;
							marbles = marbles + res;	marblesIA = marblesIA - res;
							System.out.println("You won: "+res+" marbles");		System.out.println("You have "+marbles+" marbles left");
							turns = false;
						}else if (bet==betIA){
							res=betIA;
							marbles = marbles + res;	marblesIA = marblesIA - res;
							System.out.println("You won: "+res+" marbles");		System.out.println("You have "+marbles+" marbles left");
							turns = false;
						}
						
					}
					if (guess.equalsIgnoreCase("even") && betIA%2!=0) 
					{
						System.out.println("You lose the round!");
						if (bet<betIA) 
						{	
							res=bet;
							marbles = marbles - res;	marblesIA = marblesIA + res;
							System.out.println("You lost: "+res+" marbles");	System.out.println("You have "+marbles+" marbles left");
							turns = false;
						}
						
						if (betIA<bet) 
						{	
							res=betIA;
							marbles = marbles - res;	marblesIA = marblesIA + res;
							System.out.println("You lost: "+res+" marbles");	System.out.println("You have "+marbles+" marbles left");
							turns = false;
						}else if (bet==betIA){
							res=betIA;
							marbles = marbles - res;	marblesIA = marblesIA + res;
							System.out.println("You lost: "+res+" marbles");	System.out.println("You have "+marbles+" marbles left");
							turns = false;
						}
					}
					if (guess.equalsIgnoreCase("odd") && betIA%2==0) 
					{
						System.out.println("You lose the round!");
						if (bet<betIA) 
						{	
							res=bet;
							marbles = marbles - res;	marblesIA = marblesIA + res;
							System.out.println("You lost: "+res+" marbles");	System.out.println("You have "+marbles+" marbles left");
							turns = false;
						}
						
						if (betIA<bet) 
						{	
							res=betIA;
							marbles = marbles - res;	marblesIA = marblesIA + res;
							System.out.println("You lost: "+res+" marbles");	System.out.println("You have "+marbles+" marbles left");
							turns = false;
						}else if (bet==betIA){
							res=betIA;
							marbles = marbles - res;	marblesIA = marblesIA + res;
							System.out.println("You lost: "+res+" marbles");	System.out.println("You have "+marbles+" marbles left");
							turns = false;
						}
					}
											
				
			}
			
			
			if (turns==false) 
			{
				System.out.println("Place your bet:");
				bet = scan.nextInt();
				betIA = rand.nextInt(marblesIA);
				
				guessIA = rand.nextInt(choiceIA);
				
				if (guessIA==1 && bet%2==0) 
					{
					System.out.println("The IA guessed even");
					System.out.println("You lost the round!");
					if (bet<betIA) 
					{	
						res=bet;
						marbles = marbles - res;
						marblesIA = marblesIA + res;
						System.out.println("You lost: "+res+" marbles");
						System.out.println("You have "+marbles+" marbles left");
						turns = true;
					}else if (bet==betIA){
						res=betIA;
						marbles = marbles - res;
						marblesIA = marblesIA + res;
						System.out.println("You lost: "+res+" marbles");
						System.out.println("You have "+marbles+" marbles left");
						turns = true;
					}
					
					if (betIA<bet) 
					{	
						res=betIA;
						marbles = marbles - res;
						marblesIA = marblesIA + res;
						System.out.println("You lost: "+res+" marbles");
						System.out.println("You have "+marbles+" marbles left");
						turns = true;
					}else if (bet==betIA){
						res=betIA;
						marbles = marbles - res;
						marblesIA = marblesIA + res;
						System.out.println("You lost: "+res+" marbles");
						System.out.println("You have "+marbles+" marbles left");
						turns = true;
					}
					}
				if (guessIA==0 && bet%2!=0)
					{
					System.out.println("The IA guessed odd");
					System.out.println("You lost the round!");
					if (bet<betIA) 
					{	
						res=bet;
						marbles = marbles - res;
						marblesIA = marblesIA + res;
						System.out.println("You lost: "+res+" marbles");
						System.out.println("You have "+marbles+" marbles left");
						turns = true;
					}
					
					if (betIA<bet) 
					{	
						res=betIA;
						marbles = marbles - res;
						marblesIA = marblesIA + res;
						System.out.println("You lost: "+res+" marbles");
						System.out.println("You have "+marbles+" marbles left");
						turns = true;
					}else if (bet==betIA) {
						res=betIA;
						marbles = marbles - res;
						marblesIA = marblesIA + res;
						System.out.println("You lost: "+res+" marbles");
						System.out.println("You have "+marbles+" marbles left");
						turns = true;
					}
					}
				if (guessIA==0 && bet%2==0) 
					{
					System.out.println("The IA guessed odd");
					System.out.println("You won the round!");
					if (bet<betIA) 
					{	
						res=bet;
						marbles = marbles + res;
						marblesIA = marblesIA - res;
						System.out.println("You won: "+res+" marbles");
						System.out.println("You have "+marbles+" marbles left");
						turns = true;
					}
					
					if (betIA<bet) 
					{	
						res=betIA;
						marbles = marbles + res;
						marblesIA = marblesIA - res;
						System.out.println("You won: "+res+" marbles");
						System.out.println("You have "+marbles+" marbles left");
						turns = true;
					}else if (bet==betIA){
						res=betIA;
						marbles = marbles + res;
						marblesIA = marblesIA - res;
						System.out.println("You won: "+res+" marbles");
						System.out.println("You have "+marbles+" marbles left");
						turns = true;
					}
					
					}
				if (guessIA==1 && bet%2!=0)
					{
					System.out.println("The IA guessed even");
					System.out.println("You won the round!");
					if (bet<betIA) 
					{	
						res=bet;
						marbles = marbles + res;
						marblesIA = marblesIA - res;
						System.out.println("You won: "+res+" marbles");
						System.out.println("You have "+marbles+" marbles left");
						turns = true;
					}				
					
					if (betIA<bet) 
					{	
						res=betIA;
						marbles = marbles + res;
						marblesIA = marblesIA - res;
						System.out.println("You won: "+res+" marbles");
						System.out.println("You have "+marbles+" marbles left");
						turns = true;
					}else if (bet==betIA){
						res=betIA;
						marbles = marbles + res;
						marblesIA = marblesIA - res;
						System.out.println("You won: "+res+" marbles");
						System.out.println("You have "+marbles+" marbles left");
						turns = true;
					}
											
					}
			
			}
		
		}
		if (marbles==0) {System.out.println("GAME OVER");System.out.println("YOU DIED");}
		if (marblesIA==0) {System.out.println("GAME OVER");System.out.println("YOU SURVIVED");}
		
		
		
		
		
	}
}
