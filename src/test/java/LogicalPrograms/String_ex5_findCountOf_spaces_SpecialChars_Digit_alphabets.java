package LogicalPrograms;
public class String_ex5_findCountOf_spaces_SpecialChars_Digit_alphabets
{
	public static void main(String[] args)
	{
		String str="5abcd123xyz #";   
		int specialCharCount=0;  
		int alphbetsCount=0;  
		int spaceCount=0;
		int digitCount=0;  
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char s1 = str.charAt(i); 
			  
			if(Character.isDigit(s1))  
			{
				digitCount++;
			}
			else if(Character.isWhitespace(s1))
			{
				spaceCount++;
			}
			else if(Character.isLetter(s1))
			{
				alphbetsCount++;
			}
			else
			{
				specialCharCount++;
			}
		}
		
		System.out.println("digit Count: "+digitCount);		
		System.out.println("space Count: "+spaceCount);		
		System.out.println("alphbets Count: "+alphbetsCount);		
		System.out.println("special Char Count: "+specialCharCount);		
	}
}