public class Array2dTest1 {

    public static void main(String[] args) {

	// Create two 1D arrays for People and Attributes to populate 2D array later.
	String[] names = { "Jim", "Deb", "Sara", "Matthew" };
	String[] traits = { "6.0", "Blond", "Blue", "Male", "50", "5.5", "Blond", "Brown", "Female", "50ish", "5.6", "Blond", "Blue", "Female", "26", "5.11", "Red", "Blue", "Male", "24"  };

	// Create a 2D array for People & attributes  (Row Person | Column Attributes)
	String[][] attributes = new String[4][6];   // Define the 2D array attributes
	// System.out.println("Length " + attributes.length); System.out.println("n="+n+" x="+x);
	
	// Populate the 2D array 'attributes'
	int n=0; int x=0 ; int i=0;   // Define and zero all counters
	for (n = 0; n < 4; n++) {   // Person column loop/counter
		attributes[n][0]=names[n];   // Populate the person field [n][0] i.e first column
		for (x = 1; x<6; x++) {   // Attribute column loop/counter
			attributes[n][x]=traits[i];   // Populate the attributes fields [n][x] i.e last five columns
			i++;   // This counter 'i' is to [populate the attribute columns from the 1D array traits
			}
		}
			
	// Print the 2D array 'attributes' for Person | Attributes.
	System.out.println("NAME\tHEIGHT\tHAIR\tEYES\tGENDER\tAGE");   // Print out the column headers
	for (n = 0; n < attributes.length; n++) {   // Person column loop/counter
		System.out.print(attributes[n][0] + "\t");   // Print out the persons name
		for (x = 1; x < 6; x++) {   // Attribute column loop/counter
			if (x < 5) {   // Decides whether to print the column with a carriage return or not
				System.out.print(attributes[n][x] + "\t");   // Print out the first four attribute columns
			} else {
				System.out.println(attributes[n][x] + "\t");   // Print out the last column with a carriage return
			}
		
		}
	}
	
    }
}