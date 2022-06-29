package a5_Map;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class A3_LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap a=new LinkedHashMap();
a.put("name", "ram");
a.put("club", "Manchesterunited");
a.put("city", "madurai");
a.put(null, "country");

Iterator b=a.keySet().iterator();

while(b.hasNext())
{
	String key=(String) b.next();
	System.out.println(key+"="+a.get(key));

	}
	}
}
