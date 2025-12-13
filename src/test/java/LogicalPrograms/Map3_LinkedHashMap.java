package LogicalPrograms;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
public class Map3_LinkedHashMap
{
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> hm=new LinkedHashMap<>();
		hm.put(5, "ganesh");
		hm.put(11, "mahesh");
		hm.put(2, "suresh");
		hm.put(4, "ramesh");
		hm.put(3, "rahul");
		hm.put(null, null); 
		hm.put(6, null); 	
		System.out.println(hm);	
	}
}
