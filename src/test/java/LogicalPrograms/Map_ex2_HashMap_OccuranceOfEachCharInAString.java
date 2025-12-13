package LogicalPrograms;
import java.util.HashMap;
import java.util.Set;
public class Map_ex2_HashMap_OccuranceOfEachCharInAString
{
	public static void main(String[] args)
	{
		String str="abcaba";
		HashMap<Character, Integer> mp=new HashMap();
	
					 //5<=5
		for(int i=0; i<=str.length()-1; i++)
		{						//5
			char s1 = str.charAt(i); //a
			if(mp.containsKey(s1)) //a => true
			{
				mp.put(s1, mp.get(s1)+1); // a, 2+1=3
			}
			else
			{
				mp.put(s1, 1); //c, 1
			}
		}
		
		Set<Character> allKeys = mp.keySet(); //[a, b, c]
		
//		 //Occurance of each character
//		 for(Character key:allKeys)
//		 {
//			 System.out.println(key+"-"+mp.get(key));
//		 }
		 

//		//print only duplicate chars
//		for(Character key:allKeys)
//		{
//			if(mp.get(key)>1) //condition for duplicate key
//			{
//				System.out.println(key+"-"+mp.get(key));
//			}
//		}
		
		//print only unique chars
		for(Character key:allKeys)
		{
			if(mp.get(key)==1) //condition for duplicate key
			{
				System.out.println(key+"-"+mp.get(key));
			}
		}
	}
}