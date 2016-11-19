
public class candycane {
	public static void main(String[] args) {
		System.out.println(average(45,65,76,68,99,89,62));
	}

	
	public static int average(int...numbers){
		int total=0;
		for(int x:numbers)
		total+=x;
		
		return total/numbers.length;
		}
	}




	/*	int firstarray [][]={{8,9,10,11},{12,13,14,15}};
		int secondarray [][]={{30,31,32,33},{43},{4,5,6}};
		
		System.out.println("This is the first array.");
		display(firstarray);
		
		System.out.println("This is the second array.");
		display(secondarray);
	}
		public static void display(int x[][]){
			for(int row=0;row<x.length;row++){
			for (int column=0;column<x[row].length;column++){
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();


				}
		}
*/