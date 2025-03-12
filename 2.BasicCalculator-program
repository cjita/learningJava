//Build a Basic Calculator (Addition, Subtraction, Multiplication, Division).

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    //using scanner class to read user inputs
    Scanner scanner = new Scanner(System.in);
    System.out.println("Basic Calculator App");
    System.out.println("____________________");
    System.out.println("Enter first number: ");
    double num1=scanner.nextDouble();
    System.out.println("Enter second number: ");
    double num2=scanner.nextDouble();
    double result;
    
    
    System.out.println("Select operation number");
    System.out.println("1 Addition");
    System.out.println("2 Subtraction");
    System.out.println("3 Multiplication");
    System.out.println("4 Division");
    
    int operation=scanner.nextInt();

    switch(operation){
        case 1:
                result=num1+num2;
                System.out.println("Result: "+result);
                break;
        case 2:
                result=num1-num2;
                System.out.println("Result: "+result);
                break;
        case 3:
                result=num1*num2;
                System.out.println("Result: "+result);
                break;
        case 4:
            if(num2!=0){
                result=num1/num2;
                System.out.println("Result: "+result);
            }
            else{
                System.out.println("cannot be divided by zero");
            }
                break;
        default:
                System.out.println("Invalid input");
                break;

    }
    scanner.close();

    }
    
}
