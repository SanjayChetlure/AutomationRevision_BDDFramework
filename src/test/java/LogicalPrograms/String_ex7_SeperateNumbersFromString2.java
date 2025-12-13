package LogicalPrograms;
public class String_ex7_SeperateNumbersFromString2
{
	public static void main(String[] args)
	{
		String s1="ab12cd4xyz";
		String s2="";  //1
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			char charValue = s1.charAt(i);  //2
			
			if(Character.isDigit(charValue))
			{
				s2=s2+charValue;  //1+2= 12
			}
		}
		
		System.out.println(s2);
				
		int n1 = Integer.parseInt(s2);
		System.out.println(n1+6);
	}
}
