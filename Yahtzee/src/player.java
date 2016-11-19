import java.util.InputMismatchException;
import java.util.Scanner;

public class player {

	Scanner scn = new Scanner(System.in);
	int players = 1;//keeps track of number of players.
	boolean end = false;
	int[][] categoryScore = new int[9][25];
	String[] names = new String[9];
	
	
	public String[] names(){

		System.out.print("How many players (1 to 8)? ");		
		end = false;
		while(end == false){
			try{
				players = scn.nextInt();
				if (players >=1 && players <=8){end = true;} 
				else {System.out.println("Enter a number between 1 and 8");}
			}catch (InputMismatchException e){
				System.out.println("Please enter a number");
				scn.nextLine();
			} // End of Catch	
		} // End of while loop
		
	   for (int x = 1; x <= players; x++) {
			System.out.print("Enter player " + x + "'s name: ");
			names[x] = scn.next();
			} // End of for players loop
	   return names;
	   
	} // End of the names() method
	
	
	  public void scoring(int turnScore){
		  
  
	  } // End of the scoring() method
	  
	  
} // End of the player class