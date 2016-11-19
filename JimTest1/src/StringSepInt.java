import java.util.*;
import java.io.*;

public class StringSepInt 
{

	public static void main(String[] args) 
	{
		
		int keepNum1 = 3;
		String sRoll;
		String[] diceStr = new String[20];
		int[] keepValidate = new int[20];
		Scanner scn = new Scanner(System.in);
		
//		System.out.println("Which dice do you wish to keep? (separated by spaces i.e. 1 2 3");
//		sRoll = scn.nextLine();
//		diceStr = sRoll.split(" ");
//		for(int a=0; a<keepNum1; a++){keepValidate[a]= (Integer.parseInt(diceStr[a]));}
		
//		for(int b=0; b<keepNum1; b++){System.out.println("keepValidate int Value "+keepValidate[b]);}
		

		
		

		  
		      String Str1 = new String("Welcome to Tutorialspoint.com");
		      System.out.print("Return Value :" );
		      System.out.println(Str1.substring(10) );

		      String Str2 = new String("Welcome to Tutorialspoint.com");
		      System.out.print("Found Index :" );
		      System.out.println(Str2.indexOf( 'o' ));
		      
		      String s = "Strings ,are immutable";
		      char result = s.charAt(8);
		      System.out.println(result);
		      if(result==','){System.out.println("The SpaceLocater works ");}
	
	}
}