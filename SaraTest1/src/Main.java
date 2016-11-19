import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Get user input example i.e. scanner

		Scanner inp = new Scanner(System.in);
		String[] ids= new String[5];
		int[] old= new int[5];
		String name="";
		int age=0;
		int x=0;
		
		x=0;
		while (x<5) {
			System.out.print("Enter name: ");
			ids[x] = inp.next();
			System.out.print("Enter Age: ");
		    old[x] = inp.nextInt();
		    x++;
		}
		System.out.println("");
		for (x = 0; x < 5; x++) {
			System.out.println("Your name is "+ids[x]+" and you are "+old[x]+" years old.");

		        }
	}
}

