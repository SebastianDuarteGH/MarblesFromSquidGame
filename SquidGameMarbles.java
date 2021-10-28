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
		int guessIA;
		
		// PLAYER
		
		int marbles = 10;
		int bet;
		String guess;
		
		// COMMANDS

		boolean turns=true;
		
		
		while (marbles>0 && marblesIA>0){
			
			if (turns==true)
			{
				System.out.println("Place your bet:");
				bet = scan.nextInt();
				betIA = rand.nextInt(marblesIA);
				
				System.out.println("Make your guess:");
				guess = scan.next();
					if (guess.equalsIgnoreCase("even") && betIA%2==0) 
					{
						System.out.println("You win the round!");
						marbles = marbles + betIA;
						marblesIA = marblesIA - betIA;
					}
					if (guess.equalsIgnoreCase("odd") && betIA%2!=0) 
					{
						System.out.println("You win the round!");
						marbles = marbles + betIA;
						marblesIA = marblesIA - betIA;
					}
					if (guess.equalsIgnoreCase("even") && betIA%2!=0) 
					{
						System.out.println("You lose the round!");
						marbles = marbles - bet;
						marblesIA = marblesIA + bet;
					}
					if (guess.equalsIgnoreCase("odd") && betIA%2==0) 
					{
						System.out.println("You lose the round!");
						marbles = marbles - bet;
						marblesIA = marblesIA + bet;
					}
											
				turns = false;
			}
			
			
			if (turns==false) 
			{
				System.out.println("Place your bet:");
				bet = scan.nextInt();
				betIA = rand.nextInt(marblesIA);
				
				
				
				
				turns = true;
			}
			
		}
		
		
		
		
		
		
	}
}
