
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
// 		int[] numbers={1,2,3,4,5,6,7,8,9,10};
// 		int index = Arrays.binarySearch(numbers,4);
// 		System.out.println("The index of element 4 in the array is "+index);
		
		int[] numbers={10,2,32,11,15,76,19,48,79,5};
		Arrays.sort(numbers);
		
		Arrays.fill(numbers,13);
		for (int i:numbers){
		System.out.print(i+" ");}
	}
}
