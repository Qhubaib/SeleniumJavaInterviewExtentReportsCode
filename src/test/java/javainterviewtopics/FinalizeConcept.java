package javainterviewtopics;


/**
 * 
 * @author Qhubaib
 * Lets discuss about GC(garbage collector)
 * Normally objects are created inside heap memory - we can create lakh's of objects inside memory
 * Which means heap memory is a very huge on.
 * 
 * Whenever we are creating an object inside a class it will go inside heap memory, if it is having 
 *  any reference for that particular object -- then it is not eligible for GC
 *  if object is pointing to null/nothing then -- that particular object is eligible for Garbage Collector
 *  the objects which are eligible for GC -- GC wont destroy those objects immediately 
 *  It will wait until the Heap memory is running out of memory -- if it is so then it will destroy the unused objects
 *  Before destroying the GC will call "finalize()" method for clean up activity
 *  which means if we have 10/20/30 etc objects are eligible for GC -- GC wont destroy them 
 *  For GC Destroy we need certain big amount of objects 10000/50000 etc.. which are eligible for GC 
 *  
 * OUTPUT:
 *  This is finalize() -- performs clean up activity -- before destroying an object
	This is finalize() -- performs clean up activity -- before destroying an object
	
	the output here is :: called from finalize() -- which means whenever you call GC -- it will call finalize() method before 
	   destroying an object
 */
public class FinalizeConcept {
	
	public void finalize()
	{
		System.out.println("This is finalize() -- performs clean up activity -- before destroying an object");
	}
	public void finaliz()
	{
		System.out.println("This is finaliz");
	}
	public static void main(String[] munna)
	{
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();
	}

}
