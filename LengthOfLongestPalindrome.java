import java.util.*;

public class LengthOfLongestPalindrome {

    static void getLength(String str) 
    { 
        int n = str.length(); 
        int length = 1; //a single char is also a palindrome
        //table[i][j] , will maintain a table to check the palindromic string
        boolean table[][] = new boolean[n][n]; 
  		
  		for (int i = 0; i < n; ++i) 
            table[i][i] = true; 
  
        int start = 0; 
        for (int i = 0; i < n - 1; ++i) { 
            if (str.charAt(i) == str.charAt(i + 1)) { 
            	//comapring adjacent for same for length 2
                table[i][i + 1] = true; 
                start = i; 
                length = 2; 
            } 
        } 
  
        //string greater than 2
        for (int p = 3; p <= n; ++p) { 
            for (int i=0; i < n-p+1; ++i) { 
                 
                int j = i+p-1;  //last index, length p
                // System.out.println("i:"+i+" j:"+j+" p:"+p);
  				//Checking for adjacent
                if (table[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) { 
                    table[i][j] = true; 
                    if (p > length) { 
                        start = i; 
                        length = p; 
                        // System.out.println("start "+start+" length :"+p);
                    } 
                } 
            } 
        } 
        System.out.println("Longest palindrome : "+str.substring(start, (start+length-1)+1)); 
    } 
  
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String :");
		String input = in.nextLine();
		getLength(input);
	}
}