package LogicalPrograms;

import java.util.Arrays;

public class String_Ex9_Anagram 
{
	public static void main(String[] args) 
	{
		String s1="abcd";
		String s2="cdab";
		
		//converts strings to lower case
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
			
		
		//converts string to array
		char [] ar1=s1.toCharArray();     //[a[0]     b[1]    c[2]   d[3]]
		char [] ar2=s2.toCharArray();     //[c[0]     d[1]    a[2]   b[3]]
		
		//sort array
		Arrays.sort(ar1);              //[a[0]     b[1]    c[2]   d[3]]
		Arrays.sort(ar2);              //[a[0]     b[1]    c[2]   d[3]]
		
		//compare 2 Arrays
		if(Arrays.equals(ar1, ar2)) 
		{
			System.out.println("given string are Anagram");
		}
		else
		{
			System.out.println("given string are not Anagram");
		}
		
	}

}
