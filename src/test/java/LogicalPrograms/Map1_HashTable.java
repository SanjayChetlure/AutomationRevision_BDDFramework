package LogicalPrograms;
import java.util.Hashtable;
public class Map1_HashTable
{
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht=new Hashtable<>();
		ht.put(5, "ganesh");
		ht.put(1, "mahesh");
		ht.put(2, "suresh");
		ht.put(4, "ramesh");
		ht.put(3, "rahul");
//		ht.put(null, null);    //Hashtable doesn't allow any null key or value.
		
		System.out.println(ht);	
	}
}
