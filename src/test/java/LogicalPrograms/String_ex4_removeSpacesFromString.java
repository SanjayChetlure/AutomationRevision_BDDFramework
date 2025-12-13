package LogicalPrograms;

public class String_ex4_removeSpacesFromString
{
	public static void main(String[] args)
	{	
		String org = "a b   c d";   // out -> abcd
		System.out.println(org);
		
		String org1=org.replace(" ", "");
		System.out.println(org1);	
		
	}
}