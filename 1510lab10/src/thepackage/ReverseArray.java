/**
 * 
 */
package thepackage;
import java.util.Scanner;

/**
 * @author A00815934
 *
 */
public class ReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arraySize;
		int[] array;
		System.out.print("Please enter the size of the array as an integer: ");
		arraySize = scan.nextInt();
		System.out.println("");
		array = new int[arraySize];
		
		//user populates array
		for (int i=0; i<arraySize; i++){
			System.out.print("Enter index " + i +": ");
			array[i] = scan.nextInt();
		}
		
		//reverse the array
		for (int i=0; i<arraySize/2; i++){      //arraySize divided by 2, otherwise it reverses, then reverses again
			int temp; 
			temp = array[i];
			array[i] = array[arraySize -1 -i];
			array[arraySize -1 -i] = temp;
		}
		
		//prints the array
		System.out.println("");
		System.out.println("The array holds: ");
		for (int i=0; i<arraySize; i++){
			System.out.println("index[" + i + "] = " + array[i]);
		}
		
	}

}
