import java.util. * ;

public class turn {

	//Initialization and setup

	int rollNum2; //amount of dice rolled after first turn kept dice are subtracted.
	int rollNum3; //amount of dice to be rolled after first turn kept dice are subtracted.
	int dRoll[]; // return array for current dice roll
	ArrayList < Integer > tDiceHolder = new ArrayList < Integer > (); //  Replaced diceKeep[] with this ArrayList
	ArrayList < Integer > tKeepDice = new ArrayList < Integer > ();
	boolean end = false; //try catch error proofing.

	public ArrayList turnRoll() {

		//	-----  ----- //  *** FIRST DICE ROLL ***  //-----  ----- 
		dice diceObject = new dice();
		dRoll = diceObject.rollDice(5);

		System.out.print("Roll Number One -> ");

		diceList diceListObject1 = new diceList();
		tKeepDice = diceListObject1.turnProcess(dRoll, "One");
		tDiceHolder.addAll(tKeepDice); 

		System.out.println("Dice being Saved after Roll One: " + tKeepDice);
		
		//	-----  ----- //  *** SECOND DICE ROLL ***  //-----  ----- 
		rollNum2 = (5 - tKeepDice.size());
		if ( tDiceHolder.size() !=5){
		dice diceObject2 = new dice();
		dRoll = diceObject2.rollDice(rollNum2);

		System.out.print("\n\nRoll Number Two -> ");

		diceList diceListObject2 = new diceList();
		tKeepDice = diceListObject2.turnProcess(dRoll, "Two");
		tDiceHolder.addAll(tKeepDice);

		System.out.println("Contents of tKeepDice ArrayList after Roll Two: " + tKeepDice);
		} 
		//	-----  ----- //  *** THIRD DICE ROLL ***  //-----  ----- 
		rollNum3 = 5 - tDiceHolder.size();
		if (tDiceHolder.size() != 5){
		dice diceObject3 = new dice();
		dRoll = diceObject3.rollDice(rollNum3);

		System.out.print("\n\nRoll Number Three -> ");

		diceList diceListObject3 = new diceList();
		tKeepDice = diceListObject3.turnProcess(dRoll, "Three");
		tDiceHolder.addAll(tKeepDice);
		}
		//	-----  ----- //  *** Print out the tDiceHolder ArrayList ***  //-----  ----- 
		System.out.println("");
		System.out.println("Final Saved Hand :: " + tDiceHolder);

		return tDiceHolder;

	}
}