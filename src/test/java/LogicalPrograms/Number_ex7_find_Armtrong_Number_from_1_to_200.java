package LogicalPrograms;
public class Number_ex7_find_Armtrong_Number_from_1_to_200
{
	public static void main(String[] args)
	{
		for(int i=100; i<=999; i++)
		{
			findArmstrongNum(i);
		}
	}

	public static void findArmstrongNum(int orgNum) 
	{
		int sum = 0;    
		
		for (int i=orgNum;  	i>0;  	i=i/10)
		{
			int rem = i % 10; 
			sum = sum + (rem * rem * rem);    
		}
		
		if (orgNum == sum)
		{
			System.out.println("given number " + orgNum + " is an armstrong number");
		}
	}
}
