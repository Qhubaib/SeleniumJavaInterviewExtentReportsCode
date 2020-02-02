package javainterviewtopics;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedMaxCharInString {

	public static void main(String[] args) {

		String s = "syedahmedhhhd";
		Map<Character,Integer> map = new LinkedHashMap<>();
		char c = ' ';
		int num = 0;
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					count++;
				}
			}
			
			String rep=String.valueOf(s.charAt(i));
			map.put(s.charAt(i), count);
			s=s.replaceAll(rep, "");
			count=0;
			i--;
		}
		
		System.out.println(map);
		Set<Entry<Character,Integer>> entry=map.entrySet();
		for(Entry<Character,Integer> data:entry)
		{
			if(data.getValue()>num)
			{
				c = data.getKey();
				num=data.getValue();
			}
		}
		System.out.println("Maximum repeated character is: "+c);
	}

}
