import java.util.Random;

public class dice {

	/* Yahtzee Dice Class
		Created on 2016-10-07 by Jim & Sara Bodden
		Modified Last: 2016-10-07 by Jim & Sara Bodden
		*/

	int roll[] = new int[10]; //array for the dice roll.
	int number = 0; //holds individual dice and sends them to roll[].

	public int[] rollDice(int x) {
		//int x=5;
		Random dice = new Random(); {
			for (int counter = 1; counter <= x; counter++) {
				number = 1 + dice.nextInt(6);
				roll[counter] = number;
			} //End for counter loop

			return roll;
		} //End object dice

	} //End method rollDice

} //End class dice