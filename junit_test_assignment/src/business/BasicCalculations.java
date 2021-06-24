package business;

import com.util.Console;

public class BasicCalculations {
	
	
	// accept an int and return the square
	public static int square(int nbr) {
			return nbr * nbr;
	}
	
	
	//accept a string and return an int
	
	public static int countA(String str) {
		int aCount = 0; 
		
		str = str.toLowerCase();
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == 'a') {
				aCount++;
			}
		}
	
		return aCount;
		
	}

}
