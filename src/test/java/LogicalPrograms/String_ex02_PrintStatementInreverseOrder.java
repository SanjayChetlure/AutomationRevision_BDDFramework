package LogicalPrograms;
public class String_ex02_PrintStatementInreverseOrder
{
	public static void main(String[] args) 
	{		
		String s1="my name is abc";    		
		
		String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}
		
	
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.print(ar[i]+" ");
		}		
	}
}