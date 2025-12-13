package LogicalPrograms;
public class String_ex3_ReverseEvenOddIndexWords
{
	public static void main(String[] args) 
	{	
		String s1="my name is abc";      // ym name si abc
		String [] ar=s1.split(" ");      // {my(0), name(1), is(2), abc(3)} 
		
		//           1<=3
		for(int i=0; i<=ar.length-1; i++)      
		{				
			String org = ar[i];     //name
			
			if(i%2!=0)   //1%2=1==0
			{
				String revValue = reverseString(org);
				System.out.print(revValue+" ");      // 
			}
			else
			{
				System.out.print(org+" ");      // 
			}			
		}	
	}
	
	
	public static String reverseString(String org)
	{
		String rev="";
		for(int j=org.length()-1; j>=0; j--) 
		{
			rev=rev+org.charAt(j);
		}
		return rev;
	}
}