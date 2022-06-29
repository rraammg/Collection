package a1_List;

import java.util.ArrayList;
import java.util.Iterator;

public class B9_ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(0,"hi");
		a.add(1,"hello");
		a.add(2,"welcome");
		
	Iterator It=a.iterator();
	{
while(It.hasNext())
{
	System.out.println(It.next());
}
}
	}
}
