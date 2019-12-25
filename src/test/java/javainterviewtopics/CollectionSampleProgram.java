package javainterviewtopics;


public class CollectionSampleProgram {

	public static void main(String[] args) {

		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				if (i == 2 & j == 2 || i == 3 & j == 3|| i == 3 & j == 2|| i == 2 & j == 3)   {
					System.out.print("# ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println("Another Method is::::");
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if (i == 1 || i == 5|| j == 1|| j == 5)   {
					System.out.print("* ");
				} else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
		
		/***
			* * * * 
			* # # * 
			* # # * 
			* * * * 
			Another Method is::::
			* * * * * 
			* # # # * 
			* # # # * 
			* # # # * 
			* * * * * 
		 */
		
	}

	
}
