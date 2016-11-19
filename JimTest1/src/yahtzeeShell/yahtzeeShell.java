package yahtzeeShell;

import java.util.*;


public class yahtzeeShell {
	
	
	
	public static void main(String[] args) {
		// Main class for Yahtzee
		
		viewerGUI viewTest = new viewerGUI();
		viewTest.viewer();
		
		String players[] = new String[13];  // players[0]= # of players - players[1] to [13]= names of players
		int x = 0; // Counter
		int numberOfPlayers = 0; // Number of players
		int die; // die object for dice rolls
		int roll[] = new int[5];
		int number=0;
		ArrayList < Integer > rollDiceHolder = new ArrayList < Integer > ();
		
		player playerObj1 = new player();
		players = playerObj1.names();
		
		numberOfPlayers = Integer.parseInt(players[0]);
		System.out.println("The "+ numberOfPlayers +" player names are: ");
		for (x=1 ; x <= numberOfPlayers ; x++){System.out.println(players[x]);}
		
		turn turnObject1 = new turn();
		rollDiceHolder = turnObject1.turnRoll();

	//	for (x=1 ; x <= number ; x++){System.out.println("Die = "+roll[x]);}

//		scn.close(); // Closing the scanner
	}
}




class player {
	public String[] names(){
		boolean end = false;
		String players[] = new String[13];  // players[0]= # of players - players[1] to [13]= names of players
		int x = 0; // Counter
		Scanner scn = new Scanner(System.in); // Get keyboard input
		
		//people[] humans;
		//humans = new people[13];	
		
		
		System.out.print("Enter the players names? (enter / to quit)\n");		
		end = false;
		x=0;
		while(end == false){
			x++;
			players[x] = scn.next();
			if (players[x].equals("/") || x > 11){end = true;}
			}
		
		players[0] = Integer.toString(x-1);

		return players;
	}
}
	



class dice {
	public ArrayList die(int number){
		boolean end = false;
		ArrayList < Integer > rollDiceHolder = new ArrayList < Integer > ();
		
		Random dice = new Random();

        for(int counter=1; counter<=number;counter++){
        	rollDiceHolder.add(1 + dice.nextInt(6));
        	//System.out.print(" "+roll[number] + " ");
        }
		return  rollDiceHolder;
	}     
}




class turn {
	
	
	public ArrayList turnRoll(){
		Boolean end = false;
		int number=5;
		String rollNumber = new String();
		ArrayList < Integer > rollDiceHolder = new ArrayList < Integer > ();
		ArrayList < Integer > turnDiceHolder = new ArrayList < Integer > ();
		Scanner scn = new Scanner(System.in); // Get keyboard input
		rollNumber = "First";
		int[] keepRoll = new int[5];
		
		if (rollNumber == "First"){System.out.println("Press enter to roll dice. "); scn.nextLine();} else
		{System.out.println("Enter number dice to roll: "); number = scn.nextInt(); }
		
		dice rollObject1 = new dice();
		rollDiceHolder = rollObject1.die(number);
		

        System.out.println("rollDiceHolder = "+rollDiceHolder);
        
        
    	turn rollProcObject1 = new turn();
    	turnDiceHolder = rollProcObject1.processRoll(rollDiceHolder, "One");
        
		return rollDiceHolder;
		
	}

	
	public ArrayList processRoll(ArrayList rollDiceHolder, String turn){
		Boolean end = false;
		Boolean stop = false;
		int number = 0;
		int keepNum = 0;
		int[] roll= new int[5];
		ArrayList < Integer > turnDiceHolder = new ArrayList < Integer > ();
		Scanner scn = new Scanner(System.in); // Get keyboard input
		String sRoll = new String();
		String diceStr[] = new String[20]; 
		int[] keepValidate = new int[20];
		
		//------------ *** HOW MANY DICE *** ------------//
        System.out.print("\nHow many dice would you like to keep from roll "+turn+": ");
        end = false;
        while (end == false) {
            try {
                keepNum = scn.nextInt();
                if (keepNum >= 0 && keepNum <= rollDiceHolder.size()) {
                    end = true;
                } else {
                    System.out.println("Please enter a number 0 to "+rollDiceHolder.size());
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                scn.nextLine();
            }
        }   
        
        
      //------------ *** WHICH DICE *** ------------//
        if(keepNum > 0){
        System.out.println("Which dice do you wish to keep? (separated by a comma i.e. 1,2,3");
        end=false; 
		while(end == false){
			try{
				sRoll = scn.next();
				if (sRoll.matches("^[0-6,]+$") && sRoll.length()==((keepNum*2)-1)) 
				{for (int x=0;x<=6;x++){diceStr[x+1]=diceStr[x];}diceStr = sRoll.split(",");
				for(int a=1; a<=keepNum; a++){keepValidate[a]= (Integer.parseInt(diceStr[a-1]));}; 
				keepValidate[0] = keepNum; end=true;} 
				else {System.out.println("Invalide input entered!");
					System.out.println("Please enter number(s) 1 to 6 separated by commas");}
			}catch (InputMismatchException e){
					System.out.println("Please enter number(s) 1 to 6 separated by commas");
					scn.nextLine();	
				}	
			}
        
		//for(int a=1; a<=keepNum; a++){keepValidate[a]= (Integer.parseInt(diceStr[a-1]));}
		//keepValidate[0] = keepNum;
        } else {
        		System.out.println("Roll all the dice again");
        }
	  
        

//        while (stop == false) {
//        	int returnVal=rollDiceHolder.indexOf(number); 
//        	if(returnVal == -1){System.out.println("Sorry, try again or press 0 to move to next turn");} 
//        	else if(number == 0){ stop = true;}
//        	else { rollDiceHolder.remove(returnVal); turnDiceHolder.add(number);}        
//        	}
        

//----------------
        
       
	return turnDiceHolder;
	}
}



