

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
Scanner s = new Scanner(System.in);
String name = "";
int yrs = 0;
		
System.out.print("gimme yo name! ");
name = s.next();
System.out.println("yo name is, "+name);

System.out.print("Whats yo age? ");
yrs = s.nextInt();
System.out.println("you "+yrs+ " years old." );

System.out.println("yo name is "+name+", you "+yrs+" old. ");

System.out.println("");
System.out.println("check out this sweet array!");

char[] arr ={'S', 'J', 'D', 'M', 'G'};
for (int i = 0; i < 5; i++) {
   // System.out.println("i=" + i); 
	System.out.println("arr["+i+"] = " + arr[i]);
		}
	}
}
