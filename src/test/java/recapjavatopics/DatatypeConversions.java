package recapjavatopics;

public class DatatypeConversions {

	public static void main(String[] args) {

		System.out.println("Convert Integer String Data types::: ");
		int a = 55;
		String s = Integer.toString(a);
		String s1=String.valueOf(a);
		System.out.println(s+" "+s1);
		
		String s2 = "1123";
		int b = Integer.parseInt(s2);
		System.out.println(b);
		/*String s3="Qhubaib123";  if you try to convert like this type of string to interger
		Integer.parseInt(s3);
		Exception in thread "main" java.lang.NumberFormatException: For input string: "Qhubaib123"*/
		
		System.out.println("Convert character String Data types::: ");
		char c = '2';
		String s3=String.valueOf(c);
		System.out.println(s3);
		char d = s2.charAt(0);
		System.out.println("Convertiong string into char: "+d);
		
		System.out.println("Converting int - char:: ");
		char e=(char)a;
		System.out.println(e);
	}

}
