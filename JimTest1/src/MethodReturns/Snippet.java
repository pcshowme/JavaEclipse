package MethodReturns;

public class Snippet {
	public static void main(String args[]) 
	{
	    String[] res = demo();
	    for(String str : res)
	        System.out.println(str);  //Will print the strings in the array that
	}                                 //was returned from the method demo()
	
	
	public static String[] demo() //for the sake of example, I made it static.
	{
	     String[] xs = new String[] {"a","b","c","d"};
	     String[] ret = new String[4];
	     ret[0]=xs[0];
	     ret[1]=xs[1];
	     ret[2]=xs[2];
	     ret[3]=xs[3];
	     return ret;
	 }
}

