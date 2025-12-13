package LogicalPrograms;
public class String_ex8_ReverseStringWithoutStringClassMethod
{
	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("abcd");
		System.out.println(s1);
		System.out.println(s1.reverse());
		
		StringBuilder s2=new StringBuilder("xyz");
		System.out.println(s2);
		System.out.println(s2.reverse());
	}
}
