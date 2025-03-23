import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    try{
	        System.out.println("Enter a number!!!");
	        int number = sc.nextInt();
	        System.out.println(number);
		//System.out.println(1/0);
	    }
	    
	    //for catching input mismatch exception only
	   // catch(InputMismatchException e){
	   //     System.out.println("You cannot enter string!!!");
	   // }
	    
	    //for catching arithmetic exception only
	   // catch(ArithmeticException e){
	   //     System.out.println("You cannot divide by zero!!!");
	   // }
	    
	    //for catching all exceptions we generally use below
	    catch(Exception e){
	        System.out.println("Something went wrong!!!");
	    }
	    
	    //this will executes no matter what
	    finally{
	        sc.close();
	        System.out.println("No matter what this executes anyway!!!");
	    }
	    
	    //System.out.println("You reached end of program!!!");
	}
	
	
}
