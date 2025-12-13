package LogicalPrograms;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class Map4_TreeMap
{
	public static void main(String[] args) {
		
		TreeMap<Integer, String> trmp=new TreeMap<>();
		trmp.put(5, "ganesh");
		trmp.put(11, "mahesh");
		trmp.put(2, "suresh");
		trmp.put(4, "ramesh");
		trmp.put(3, "rahul");
		trmp.put(6, null); 
		
		System.out.println(trmp);	
	}
}
