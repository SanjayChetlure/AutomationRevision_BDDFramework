package LogicalPrograms;
public class String_ex01_SplitStatement
{
	public static void main(String[] args) 
	{		
		String s1="my name is abc";    		
		
		String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}
		
		System.out.println(ar[3]);
		
		System.out.println("----------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}		
	}
}