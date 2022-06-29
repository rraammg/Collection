package hashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class A1_Hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable a=new Hashtable();
a.put("name", "ram");
a.put("club", "Manchesterunited");
a.put("city", "madurai");
//a.put("domain", null);
//a.put(null, "country");
a.put("city", "chennai");
Enumeration b=a.keys();

while(b.hasMoreElements())
{
	String key=(String) b.nextElement();
	
	System.out.println(key+"="+a.get(key));//club =manchesterunited name=ram city=chennai
}

		

	}

}
