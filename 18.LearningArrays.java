import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		//to define a integer array 
		int[] number = new int[3];
		
		//to add a number into integer array
		number[0]=1;
		number[1]=2;
		number[2]=3;
		/*
		//to print all integer array list
		System.out.println(Arrays.toString(number));
		
		//to print only single integer from array list
		System.out.println(number[1]);
		
		
		//to update element from array
		number[1]=9;
		System.out.println(number[1]);
		
		//to find length 
		System.out.println(number.length);
		
		//to iterate over an array
		for (int i = 0; i < number.length; i++) {
          System.out.println(number[i]);
		}
        //iteratng using for eaach loop 
        for (int num : number) {
          System.out.println(num);
           }
           
        //searching for a element   
         int target = 5;
         boolean found = false;
         for (int num : number) {
         if (num == target) {
            found = true;
            break;
            }
              }
            System.out.println("Found: " + found);
        
        //sorting array 
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));  // Output will be [1, 2, 3] if number is [3, 2, 1]
        
        
        //reversing array
        for (int i = 0; i < number.length / 2; i++) {
           int temp = number[i];
           number[i] = number[number.length - 1 - i];
           number[number.length - 1 - i] = temp;
         }
        System.out.println(Arrays.toString(number));  // Reversed array
        
        
        //filling with zeros
        Arrays.fill(number, 0);  // Fills the array with 0s
        System.out.println(Arrays.toString(number));  // Output will be [0, 0, 0]
        
        
        //copying array
        int[] newArray = Arrays.copyOf(number, 3);  // Copies 'number' into a new array with size 5
        System.out.println(Arrays.toString(newArray));  // New array, [1, 2, 3, 0, 0]
        
        //multidimensional Arrays
        int[][] matrix = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
         };
         // Access an element:
         System.out.println(matrix[1][2]);  // Output: 6
         
        //array equality
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean isEqual = Arrays.equals(array1, array2);  // true
        System.out.println(isEqual);
        
        //removing element
        int indexToRemove=1;
        int[] newArray = new int[number.length - 1];
        for (int i = 0, j = 0; i < number.length; i++) {
        if (i != indexToRemove) {
           newArray[j++] = number[i];
         }
        }
        System.out.println(Arrays.toString(newArray));
        */
        //finding minimum and maximum value 
        int min = number[0];
        int max = number[0];
        for (int num : number) {
            if (num < min) {
               min = num;
            }
            if (num > max) {
               max = num;
           }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        
		}
}
