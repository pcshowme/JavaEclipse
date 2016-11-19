import java.util. * ;
import java.lang.Error;
import java.lang.Exception;

public class diceList {

	int testDice = 0; // Dice we are testing to see if we should keep
	Scanner scn = new Scanner(System. in ); // Keyboard input scanner
	int keepNum = 0;
	int dieKept = 0;

	//-----------------------------------------------------------

	public ArrayList turnProcess(int[] testRoll, String nRoll) {
		ArrayList < Integer > diceHolder = new ArrayList < Integer > ();
		ArrayList < Integer > keepDice = new ArrayList < Integer > ();
		Boolean end = false;

		// Place Array testRoll[] into ArrayList diceHolder //-----  ----- 
		for (int r = 1; r <= 5; r++) {diceHolder.add(testRoll[r]);}
		
		while (end == false) {int returnVal = diceHolder.indexOf(0); if (returnVal == -1) {end = true;} else {diceHolder.remove(returnVal);}}
		System.out.println(diceHolder);

		if (nRoll != "Three") {
			System.out.print("\nHow many dice would you like to keep from roll " + nRoll + ": ");
			end = false;
			while (end == false) {
				try {
					keepNum = scn.nextInt();
					if (keepNum >= 0 && keepNum <= diceHolder.size()) {
						end = true;
					} else {
						System.out.println("Please enter a number 0 to " + diceHolder.size());
					}
				} catch(InputMismatchException e) {
					System.out.println("Please enter a number");
					scn.nextLine();
				}
			}

			//Choose WHICH dice you wish to keep.  //-----  ----- 
			if (keepNum > 0 && keepNum < 5) {
				System.out.println("\n Which dice do you wish to keep? ");
				for (int t = 0; t < keepNum; t++) {
					end = false;
					while (end == false) {
						try {
							dieKept = scn.nextInt();
							if (diceHolder.contains(dieKept)) {
								keepDice.add(dieKept);
								diceHolder.remove(diceHolder.indexOf(dieKept));
								end = true;
							} else {
								System.out.println("Enter the corrct value(s)");
							}
						} catch(Exception e) {
							System.out.println("Please enter a number");
							scn.nextLine();
						}
					}
				}
			} else if (keepNum == 0) {
				keepDice.clear();
			} else if (keepNum == 5) {
				keepDice.clear();
				keepDice.addAll(diceHolder);
			}
		} else {
			keepDice.clear();
			keepDice.addAll(diceHolder);
		}
		while (end == false) {int returnVal = keepDice.indexOf(0); if (returnVal == -1) {end = true;} else {keepDice.remove(returnVal);}}
		return keepDice;

	}
}