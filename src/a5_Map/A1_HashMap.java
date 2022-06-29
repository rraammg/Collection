package a5_Map;

import java.util.HashMap;
import java.util.Iterator;

public class A1_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap a= new HashMap();
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
