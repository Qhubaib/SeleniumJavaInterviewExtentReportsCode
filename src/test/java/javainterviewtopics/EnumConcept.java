package javainterviewtopics;

/***
 * 
 * @author Qhubaib:: enum class can be declared inside class/outside class also
 *         but we can't declare enum inside methods NOTE: inside enum it is OK
 *         if you not specify the semicolon at the end(;) enum is by default
 *         extends Enum class - so it is not possible to extends any other class
 *         for enum But we can implements interface for enum classes
 *
 */

enum Mobile {
	APPLE(100), ONEPLUS(90), SAMSUNG, HTC, VIVO(50);

	int price;

	Mobile() {
		price = 20;
	}

	Mobile(int price) {
		this.price = price;
	}

	public int getprice() {
		return this.price;
	}
}

/***
 * internally what happens for the above enum class, it will create the object
 * for every constants exist in enum like below 
 * class Mobile
 *  { 
 *    final static Mobile APPLE = new Mobile(int i);
 *    final static Mobile ONEPLUS = new Mobile(int i);
 *    final static Mobile SAMSUNG = new Mobile(); 
 *    final static Mobile HTC = new Mobile(); 
 *    final static Mobile VIVO = new Mobile(int i);
 *  }
 *    
 *
 */

public class EnumConcept {

	static Mobile mobile;

	public static void main(String[] args) {
		mobile = Mobile.APPLE;
		mobileReference(mobile);
		System.out.println(mobile.price);
		System.out.println(mobile.ordinal() + "\n");// it will tell at which index we have declared this constant
													// (indexing Starts with Zero)

		mobile = Mobile.VIVO;
		mobileReference(mobile);
		System.out.println(mobile.price);
		System.out.println(mobile.ordinal() + "\n");

		mobile = Mobile.ONEPLUS;
		mobileReference(mobile);
		System.out.println(mobile.getprice());
		System.out.println(mobile.ordinal() + "\n");

		Mobile[] mob = Mobile.values();
		for (Mobile mobi : mob) {
			System.out.println(mobi);
		}

		/**
		 * APPLE 100 0
		 * 
		 * VIVO 50 4
		 * 
		 * ONEPLUS 90 1
		 * 
		 * APPLE ONEPLUS SAMSUNG HTC VIVO
		 * 
		 */
	}

	public static void mobileReference(Mobile mob) {
		switch (mob) {
		case APPLE:
			System.out.println(Mobile.APPLE);
			break;
		case HTC:
			System.out.println(Mobile.HTC);
			break;
		case SAMSUNG:
			System.out.println(Mobile.SAMSUNG);
			break;
		case VIVO:
			System.out.println(Mobile.VIVO);
			break;
		case ONEPLUS:
			System.out.println(Mobile.ONEPLUS);
			break;
		}
	}

}
