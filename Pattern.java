import java.util.*;

public class Pattern {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter height of pyramid :");
		int height = in.nextInt();
		int i,space, k = 0, count = 0, count1 = 0;
		for (i = 1; i <= height; ++i) {
	      count1 = count = k = 0;
		  //print space in every iteration
	      for (space = 1; space <= height - i; ++space) {
	         System.out.print(" ");
	         ++count;
	      }

	      // assuming  i = k  as pivot
	      // count = left of pivot
	      // count1 = right of pivot
	      while (k != 2 * i - 1) {
	         if (count <= height - 1) {
	         	// System.out.print(" count"+count);
	            System.out.print(i+k);

	            // System.out.print("Count :"+count);
	            ++count;
	         } else {
	            // System.out.print("Count1 :"+count1);
	            ++count1;
	             // System.out.print(" i :"+i);
	             // System.out.print(" k :"+k);
	             // System.out.print(" count1 :"+count1);
	            System.out.print(i + k - 2 * count1);
	         }
	         ++k;
	      }
	      System.out.print("\n");
		}
	}
}