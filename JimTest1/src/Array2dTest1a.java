

public class Array2dTest1a {
	public static void main (String[] args){
		
		String[][] people = {{ "Jim", "6.0", "Blond", "Blue", "Male", "50" }, { "Deb", "5.5", "Blond", "Brown", "Female", "50'ish" }, { "Sara", "5.6", "Blond", "Blue", "Female", "26" }, { "Matthew", "5.11", "Red", "Blue", "Male", "24" }};

		System.out.println("NAME\tHEIGHT\tHAIR\tEYES\tGENDER\tAGE");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				if (j < 5) {
					System.out.print(people[i][j] + "\t");
				} else {
					System.out.println(people[i][j] + "\t");
				}
			}
		}
	}
}