//Student Grades Analyzer: Write a program that accepts an array of student grades and provides the average, highest, and lowest grades.

import java.util.Scanner;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
	    int numStudents = scanner.nextInt();
	    int[] grades = new int[numStudents];
	    
	    for(int i=0;i<grades.length;i++)
	    {
	        System.out.println("Enter the grade of student "+(i+1)+": ");
	        grades[i]=scanner.nextInt();
	        
	    }
	    scanner.close();
	    double average = averageGrade(grades);
	    int highest = highestGrade(grades);
	    int lowest = lowestGrade(grades); 
	    
	    System.out.println("The average grade is: "+average);
	    System.out.println("The highest grade is: "+highest);
	    System.out.println("The lowest grade is: "+lowest);
	}
	
	public static double averageGrade(int[] grades){
	    if(grades.length==0){
	        return 0;
	    }
	    int sum = 0;
	    for(int grade:grades)
	    {
	        sum+=grade;
	    }
	    return (double)sum/grades.length;
	    
	}
	
	public static int highestGrade(int[] grades){
	    if(grades.length==0){
	        throw new IllegalArgumentException("the highest grade cannot be determined if grade is zero");
	    }
	    int highest=grades[0];
	    for(int grade:grades)
	    {
	        if(grade>highest){
	        highest=grade;
	        }
	    }
	    return highest;
	}
	
	public static int lowestGrade(int[] grades){
	    if(grades.length==0){
	        throw new IllegalArgumentException("the lowest grade cannot be determined if grade is zero");
	    }
	    int lowest=grades[0];
	    for(int grade:grades)
	    {
	        if(grade<lowest){
	        lowest=grade;
	        }
	    }
	    return lowest;
	}
}
