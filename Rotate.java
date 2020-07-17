import java.util.*;

public class Rotate{

	public static int[] rotate(int[] input, int length, int numOfRotations) { 
		for (int i = 0; i < numOfRotations; i++) { 
			// temp value to be added at last
			int temp = input[0]; 
			for (int j = 0; j < length - 1; j++) { 
					// changing the value at jth Index by value at j+1 th index 
					input[j] = input[j + 1]; 
					// System.out.println(input[j]);
			}

			input[length - 1] = temp; 
		} 
		return input; 
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lengthOfArray;
		System.out.println("Enter length of array :");
		lengthOfArray = in.nextInt();
		int arr[] = new int[lengthOfArray];
		System.out.println("Enter elements inside array :");
		for (int i = 0;i < lengthOfArray; i++ ) {
			arr[i] = in.nextInt();
		}

		System.out.println("Enter index to rotate given array");
		int k = in.nextInt();
		if(k > lengthOfArray){
			System.out.println(k + " is greater the size of given array");
			System.exit(0);
		}

		System.out.println("Given array : "+Arrays.toString(arr));
		int[] rotatedArray = rotate(arr, lengthOfArray, k);
		System.out.println("Rotated array : "+Arrays.toString(rotatedArray));
		
	}
}