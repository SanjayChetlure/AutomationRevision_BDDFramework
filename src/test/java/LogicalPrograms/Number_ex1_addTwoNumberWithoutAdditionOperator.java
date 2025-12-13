package LogicalPrograms;
public class Number_ex1_addTwoNumberWithoutAdditionOperator
{
	
	public static void main(String[] args)
	{
		System.out.println(add(6, 5));
	}	
	
	public static int add(int a, int b)
	{
		//           1<=6
		for(int i=1; i<=b; i++)
		{
			a++;   //6 7 8 9 10 11
		}
		return a;
	}

}