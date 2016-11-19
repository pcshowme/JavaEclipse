import java.util.*;
public class ArrayListDemo {

	public static void main(String args[]) {
		// create array list
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial size of al: " + al.size());

		// add elements to array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");	//element
		al.add(1, "A2");   //index position, element
		System.out.println("Size of al after additions: " + al.size());

		// display array list
		System.out.println("Contents of al: " + al);

		// Remove elements from array list
		al.remove("F");
		al.remove(2);
		System.out.println("Size of al after deletions: " + al.size());
		System.out.println("Contents of al: " + al);
      
		//-----
		
		
		String string = "004-034556";
		String[] parts = string.split("-");
		String part1 = parts[0]; // 004
		String part2 = parts[1]; // 034556
		System.out.println("Part 1 "+part1+" Part 2 "+part2+" YES!");
		
		
		
		
		
		//-------------
      
		//creates array for each possible dice value (1-3)
    
	ArrayList <Integer> ones = new ArrayList<Integer>();  
	ArrayList <Integer> twos = new ArrayList<Integer>(); 
	ArrayList <Integer> threes = new ArrayList<Integer>(); 
	// Counter for Yahtzee Full House only
	String match="Just Dice";
	int[] dice = {2,1,2,1,2};
	int nDice=5;
	for(int i = 0; i < nDice; i++) {
		if(dice[i] == 1) {
			ones.add(1);
		}
		else if(dice[i] == 2) {
			twos.add(1);
		}
		else if(dice[i] == 3) {
			threes.add(1);
		}
	}
	System.out.println("One's size: "+ones.size());
	System.out.println("Two's size: "+twos.size());
	System.out.println("Three's size: "+threes.size());
		
	if( (ones.size() == 2 || twos.size() == 2 || threes.size() == 2) 
			&& (ones.size() == 3 || (twos.size() == 3 || threes.size() == 3))) 
			{match = "Full House!!!";}
	System.out.println(match);
   }
}