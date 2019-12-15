package javainterviewtopics;

public class ObjectsForGarbageColletion {

	public static void main(String[] args) {

		ObjectsForGarbageColletion obj1 = new ObjectsForGarbageColletion();
		ObjectsForGarbageColletion objinstance = ObjectsForGarbageColletion.instance(obj1);
		ObjectsForGarbageColletion obj2 = obj1.instance(objinstance); // this statement goes to GC
		obj2 = obj1;
	}
	
	public static ObjectsForGarbageColletion instance(ObjectsForGarbageColletion obj)
	{
		obj = new ObjectsForGarbageColletion();
		return obj;
	}

}
