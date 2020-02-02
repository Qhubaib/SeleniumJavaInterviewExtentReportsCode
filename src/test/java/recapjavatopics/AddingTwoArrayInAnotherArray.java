package recapjavatopics;

import java.util.Arrays;

public class AddingTwoArrayInAnotherArray {

	public static void main(String[] args) {

		int a[] = { 11, 22, 44, 33, 66, 55 };
		int b[] = { 99, 77, 88, 10,101,111 };
		
		System.out.println("******  Logic simply by using two for loops  **********");
		int d[] = new int[a.length+b.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			d[i]=a[i];
			index++;
		}
		for(int ele:b)
		{
			d[index] = ele;
			index++;
		}
		System.out.println(Arrays.toString(d));
		
		System.out.println("******  Logic simply by using one for loops  **********");
		int c[] = Arrays.copyOf(a, a.length+b.length);
		for(int i=a.length,j=0;i<a.length+b.length;i++,j++)
		{
			c[i] = b[j];
		}
		System.out.println(Arrays.toString(c));
	}

}
