package a5_Map;

import java.util.Iterator;
import java.util.TreeMap;

public class A2_TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap a= new TreeMap();
a.put("name", "ram");
a.put("club", "Manchesterunited");
a.put("city", "madurai");
//a.put(null, "country");
a.put("domain", null);

Iterator b=a.keySet().iterator();

while(b.hasNext())
{
	String key=(String) b.next();
	System.out.println(key+"="+a.get(key));
}
	}

}
