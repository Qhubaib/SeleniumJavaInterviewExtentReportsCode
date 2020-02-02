package recapjavatopics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * When you create the object we can get the memory but we wont get the data of previously stored in previously created object
 * it wont store the state of an object if we create another object
 * if you copy the object as 
 * 
 * 		Cricket obj1 = obj; (What it will do here is - it will take the memory & it will take the value)
 * Let suppose we are playing a game  - scored 55/1 with 4 overs done, if we exit from the application then the app store
 * the state the of score again when we resume it.
 * 
 * when we dont implements the Serializable interface 
 * 	Exception in thread "main" java.io.NotSerializableException: recapjavatopics.Cricket
 * 
 * OUTPUT:
 *  165
	0
	After doing serializable with object input stream by passing the object into writeObject(): 165
 * 
 */

public class SerializableConcept {

	public static void main(String[] args) throws Exception {

		Cricket c = new Cricket();
		c.score=165;
		System.out.println(c.score);
		
		Cricket c1 = new Cricket();
		System.out.println(c1.score);
		
		FileOutputStream fileout = new FileOutputStream("obj.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(c);
		
		FileInputStream filestream = new FileInputStream("obj.txt");
		ObjectInputStream input = new ObjectInputStream(filestream);
		Cricket c2 = (Cricket) input.readObject();
		System.out.println("After doing serializable: "+c2.score);
		
		out.close();
		input.close();
	}

}

class Cricket implements Serializable
{
	int score;
}