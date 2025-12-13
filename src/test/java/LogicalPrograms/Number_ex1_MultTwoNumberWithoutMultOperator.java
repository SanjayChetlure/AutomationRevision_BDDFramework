package LogicalPrograms;
public class Number_ex1_MultTwoNumberWithoutMultOperator
{
	public static void main(String[] args)
	{
		int num1=4;     //4+4+4=12
		int num2=3;     
		int sum=0;   //12
		//           4<=3
		for(int i=1; i<=num2; i++)   
		{
			sum=sum+num1;   // 0+4+4=8+4=12
		}
		System.out.println(sum);
	}
}