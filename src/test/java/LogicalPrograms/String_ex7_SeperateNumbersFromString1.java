package LogicalPrograms;
public class String_ex7_SeperateNumbersFromString1
{
	public static void main(String[] args)
	{
		String s1="abc123";
		String s2=s1.substring(3); //123
		int n1 = Integer.parseInt(s2);
		System.out.println(n1+7);
	}
}
