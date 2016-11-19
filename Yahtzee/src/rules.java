import java.util.ArrayList;
import java.util.Scanner;

public class rules {
	
	 ArrayList < Integer > ones = new ArrayList < Integer > ();
     ArrayList < Integer > twos = new ArrayList < Integer > ();
     ArrayList < Integer > threes = new ArrayList < Integer > ();
     ArrayList < Integer > fours = new ArrayList < Integer > ();
     ArrayList < Integer > fives = new ArrayList < Integer > ();
     ArrayList < Integer > sixes = new ArrayList < Integer > ();
     ArrayList < Integer > rollScore = new ArrayList < Integer > ();
     String match;
     static Scanner scn = new Scanner(System.in);
     String choice;
     String choiceUpper;
     String category;
     int upperTotal=0;
     int lowerTotal=0;
     
     public String chooseCatagory(int[] catAvailability){
    	 upperTotal=0;
    	 System.out.println("Sellect a score category: \n");
    	 for(int i=1; i<=7; i++) {if (catAvailability[i]>0)
    	 {upperTotal = upperTotal + catAvailability[i];}; if(upperTotal < 0) {upperTotal = 0;};}
    	 System.out.println("UPPER SCORE: "+ upperTotal +"\n"); // PRINT UPPER SUB-TOTAL
    	 
    	 if (catAvailability[1] > -1) System.out.print(catAvailability[1]); System.out.println("\t[A] Aces"); // A-1
    	 if (catAvailability[2] > -1) System.out.print(catAvailability[2]); System.out.println("\t[B] Twos"); // B-2
    	 if (catAvailability[3] > -1) System.out.print(catAvailability[3]); System.out.println("\t[C] Threes"); //C-3
    	 if (catAvailability[4] > -1) System.out.print(catAvailability[4]); System.out.println("\t[D] Fours"); //D-4
    	 if (catAvailability[5] > -1) System.out.print(catAvailability[5]); System.out.println("\t[E] Fives"); //E-5
    	 if (catAvailability[6] > -1) System.out.print(catAvailability[6]); System.out.println("\t[F] Sixes \n"); //F-6
    	 
    	 
    	 for(int i=7; i<=14; i++) {if (catAvailability[i]>0)
    	 {lowerTotal = lowerTotal + catAvailability[i];};if(lowerTotal < 0) {lowerTotal = 0;};}
    	  System.out.println("LOWER SECTION: " + lowerTotal +"\n");
    	  
    	 if (catAvailability[7] > -1) System.out.print(catAvailability[7]); System.out.println("\t[G] 3 of a kind"); //G-7
    	 if (catAvailability[8] > -1) System.out.print(catAvailability[8]); System.out.println("\t[H] 4 of a kind"); //H-8
    	 if (catAvailability[9] > -1) System.out.print(catAvailability[9]); System.out.println("\t[I] Full house"); //I-9
    	 if (catAvailability[10] > -1) System.out.print(catAvailability[10]); System.out.println("\t[J] Small stright"); //J-10
    	 if (catAvailability[11] > -1) System.out.print(catAvailability[11]); System.out.println("\t[K] Large stright"); //K-11
    	 if (catAvailability[12] > -1) System.out.print(catAvailability[12]); System.out.println("\t[L] YAHTZEE!"); //L-12
    	 if (catAvailability[13] > -1) System.out.print(catAvailability[13]); System.out.println("\t[M] Chance?!? \n"); //M-13
    	  
    	 System.out.println("Enter your choice: ");
    	 choice = scn.nextLine();
    	
    	 return choice;
    		
     }	//End chooseCatagory method
     

     public int[] checkRoll(String choice, ArrayList < Integer > rollScore, int yahtzeeCategory[]){
 	 	int diceScore = 0;
 		int nDice = 5;
 		
		choice = choice.toUpperCase();
		int categoryUsed = "ABCDEFGHIJKLM".indexOf(choice) + 1;
		yahtzeeCategory[20] = categoryUsed;
 		
 	// Sort the Roll into like dice ArrayList
		for(int i = 0; i < nDice; i++) {
			if(rollScore.get(i) == 1) {ones.add(1);}
			else if(rollScore.get(i) == 2) {twos.add(1);}
			else if(rollScore.get(i) == 3) {threes.add(1);}
			else if(rollScore.get(i) == 4) {fours.add(1);}
			else if(rollScore.get(i) == 5) {fives.add(1);}
			else if(rollScore.get(i) == 6) {sixes.add(1);}
		}// End of for i loop

		//System.out.println("rollScore: "+rollScore);
		//System.out.println("Ones: "+ones);
		//System.out.println("Twos: "+twos);
		
		// Scoring Rules Verification & scoring
		
		choiceUpper = choice.toUpperCase();
		switch (choiceUpper){
		case "A" :  // Ones Category
			diceScore = ones.size();
			category = "Aces";
			break;
		case "B" :  // Twos Category
			diceScore = twos.size()*2;
			category = "Twos";
			break;	
		case "C" :  // Threes Category
			diceScore = threes.size()*3;
			category = "Threes";
			break;
		case "D" :  // Fours Category
			diceScore = fours.size()*4;
			category = "Fours";
			break;	
		case "E" :  // Fives Category
			diceScore = fives.size()*5;
			category = "Fives";
			break;
		case "F" :  // Sixes Category
			diceScore = sixes.size()*6;
			category = "Sixes";
			break;	
		case "G" :  // Three of a Kind Category [G]
			if( (ones.size() == 3 || twos.size() == 3 || threes.size() == 3 || fours.size() == 3 || fives.size() == 3 || sixes.size() == 3)) 
				{for (int t=0;t<5;t++){diceScore = diceScore + rollScore.get(t); } category = "Three of a Kind";} 
			else {diceScore = 0; category = "Three of a Kind";}
			break;
		case "H" :  //  Four of a Kind Category [H]
			if( (ones.size() == 4 || twos.size() == 4 || threes.size() == 4 || fours.size() == 4 || fives.size() == 4 || sixes.size() == 4)) 
				{for (int t=0;t<5;t++){diceScore = diceScore + rollScore.get(t); } category = "Four of a Kind";}
			else {diceScore = 0; category = "Four of a Kind";}
			break;
		case "I" :  // Full House Category [I]
			if( (ones.size() == 2 || twos.size() == 2 || threes.size() == 2 || fours.size() == 2 || fives.size() == 2 || sixes.size() == 2) 
				&& (ones.size() == 3 || (twos.size() == 3 || threes.size() == 3 || fours.size() == 3 || fives.size() == 3 || sixes.size() == 3))) 
					{diceScore=25; category = "Full House";}
			else {diceScore = 0; category = "Full House";}
			break;
		case "J" :  // Small Straight Category [J]
			if( (ones.size() >= 1 && twos.size() >= 1 && threes.size() >= 1 && fours.size() >= 1) 
				|| (twos.size() >= 1 && threes.size() >= 1 && fours.size() >= 1 && fives.size() >= 1)
				|| threes.size() >= 1 && fours.size() >= 1 && fives.size() >= 1 && sixes.size() >= 1) 
					{diceScore=30; category = "Small Straight";}
			else {diceScore = 0; category = "Small Straight";}
			break;
		case "K" :  // Large Straight Category [J]
			if( (ones.size() >= 1 && twos.size() >= 1 && threes.size() >= 1 && fours.size() >= 1 && fives.size() >= 1) 
				|| (twos.size() >= 1 && threes.size() >= 1 && fours.size() >= 1 && fives.size() >= 1 && sixes.size() >= 1))
					{diceScore=40; category = "Large Straight";}
			else {diceScore = 0; category = "Large Straight";}
			break;
		case "L" :  // YAHTZEE Category [L]
			if( (ones.size() == 5 || twos.size() == 5 || threes.size() == 5) ||
				(fours.size() == 5 || fives.size() == 5 || sixes.size() == 5)) 
					{diceScore=50; category = "YAHTZEE!!!";}
			else {diceScore = 0; category = "YAHTZEE!!!";}
			break;				
		case "M" : //Chance Category [M]
			for (int t=0;t<5;t++){diceScore = diceScore + rollScore.get(t); }
			category = "Chance";
			break;	
		}// End choice switch/case
		
		
 		if (yahtzeeCategory[categoryUsed] >= 0){yahtzeeCategory[21] = 0;} //  yahtzeeCategory[21] = 0 Used //  yahtzeeCategory[21] = 1 Available
		else 
		{yahtzeeCategory[categoryUsed] = diceScore; yahtzeeCategory[0] = diceScore;yahtzeeCategory[21] = 1;} 
 		
 		yahtzeeCategory[22] = upperTotal;
 		//if(upperTotal>=63){yahtzeeCategory[22] = upperTotal + 35;}
 		
 		yahtzeeCategory[23] = lowerTotal;

 		
 		return yahtzeeCategory;
 	} //end method checkRoll
     
}	//end rules class


