
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String people[][] = {{"Jim","6.0","Grey","Blue","Male","50"},{"Deb","5.5","Blond","Brown","Female","50ish"},
				{"Sara","5.4","Blond","Blue","Female","26"},{"Matthew","5.11","Blond","Blue","Male","24"}};
		
		System.out.println("NAME\tHEIGHT\tHAIR\tEYES\tGENDER\tAGE");
		display(people);
	}
	
	public static void display (String x [][]){
		for(int row=0;row <x.length;row++){
			for(int column=0;column < x[row].length;column++){
				System.out.print(x[row][column]+"\t");
			}
		    System.out.println();
		}
	}

}
