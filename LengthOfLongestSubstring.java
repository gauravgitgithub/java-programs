import java.util.*;

public class LengthOfLongestSubstring{

	static int getLengthOfLongestSubstring(String input){
        int n = input.length(), toReturn = 0;
        int[] index = new int[256]; //assuming int array as direct access table (extended ASCII)
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[input.charAt(j)], i);
            toReturn = Math.max(toReturn, j - i + 1);
            index[input.charAt(j)] = j + 1;
            // System.out.println('length :'+toReturn);
        }
        //Time Complexity : O(n) , j will iterate upto n times ie. input.length
        return toReturn;
	}


	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String input = in.nextLine();
		int length = getLengthOfLongestSubstring(input);
		System.out.println(length);
	}
}
