import java.util.ArrayList;

/*  Yahtzee Dice Class
	Created on 2016-10-07 by Jim & Sara Bodden
	Modified Last: 2016-11-08 by Jim & Sara Bodden
*/

public class yahtzee {

	// Main yahtzee routine.
	public static void main(String[] args) {

		//Initialization and setup
		int[] categoryXfer = new int[25];
		ArrayList<Integer> saveDice = new ArrayList<Integer>();
		String sChoice = null;
		int nPlayers=0; // Number of Players
		String[] playerNames = new String[9]; // String array with player names starting at [1]
		int[][] playerScoreTotal = new int[9][25]; //
		Boolean proceed = false;
		
		player pnTest = new player();
		playerNames = pnTest.names();
		
		for( int j=1; j<8; j++) {
            if(playerNames[j] != null) {
                nPlayers++; // Count the number of players
                for (int t = 1; t < 14; t++) {playerScoreTotal[j][t] = -1;} // Fill categories w/ -1
            } // End of playerNames if statement
        } // End of for j loop

		// Start of players turn
		
		for (int round = 0; round < 13; round++){
			for( int playerNumber=1; playerNumber<=nPlayers; playerNumber++) {
				System.out.println("\n"+playerNames[playerNumber]+" it's your turn to roll the dice... ");
	
				turn turnObject = new turn();
				saveDice = turnObject.turnRoll();
			
				for (int t = 1; t < 14; t++) {categoryXfer[t] = playerScoreTotal[playerNumber][t];} // Fill categoryXfer with player category info
				
				
				
				proceed = false;
				while (proceed == false){
					rules scoreChoice = new rules();
					sChoice = scoreChoice.chooseCatagory(categoryXfer);
					sChoice = sChoice.toUpperCase();
					int categoryUsed = "ABCDEFGHIJKLM".indexOf(sChoice) + 1;
					
					rules scorePoints = new rules();
					categoryXfer = scorePoints.checkRoll(sChoice, saveDice, categoryXfer);
					
					if(categoryXfer[21] == 1){proceed=true;}
					else{System.out.println("Please choose a different category... ");}
				} // End proceed while loop
				

					
				for (int t = 1; t < 24; t++) {playerScoreTotal[playerNumber][t] = categoryXfer[t];} // Fill playerScoreTotal with player category info
				
				System.out.println("\nYou get "+categoryXfer[0]+" in the catagory!");
				playerScoreTotal[playerNumber][0] = playerScoreTotal[playerNumber][0] + categoryXfer[0];
				System.out.println(playerNames[playerNumber]+" your TOTAL at this time is "+playerScoreTotal[playerNumber][0]);
			
			} // End of playerNumber loop
		} // End of round for loop
		System.out.println("\n Game Over \n");
		for( int playerNumber=1; playerNumber<=nPlayers; playerNumber++) {
			if(playerScoreTotal[playerNumber][22] >= 63){playerScoreTotal[playerNumber][0] = playerScoreTotal[playerNumber][0] + 35;}
			System.out.println(playerNames[playerNumber]+ " your final score is: " + playerScoreTotal[playerNumber][0]);
		}
	} // End of Main Method
} // End of Yahtzee Class