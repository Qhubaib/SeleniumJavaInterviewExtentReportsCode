package recapjavatopics;

public class BoxingUnboxing {

	public static void main(String[] args) {

		int i=5; //this "i" is a primitive variable 
		Integer ii = new Integer(i); //this is called boxing --> this "ii" is a reference variable
		//here we are putting primitive value inside an object - this concept is called as boxing in object oriented programming
		//the same concept in java we called this as "Wrapping"
		Integer iii = i; //this is called auto-boxing
		
		int j=ii.intValue(); //taking the value from object is called as unboxing - unwrapping
		int k=iii;//java will automatically give the value of iii to primitive int k -- this is called as Auto-Unboxing/Auto-Unwrapping
		
		/*
		 * When it comes to speed primitive works faster than wrapper classes.
		 * But Collection API will work with only wrapper classes
		 */
	}

}
