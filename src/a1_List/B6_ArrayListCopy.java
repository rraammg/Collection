package a1_List;

import java.util.ArrayList;

public class B6_ArrayListCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("hi");
		a.add("hello");
		a.add("welcome");
		ArrayList b=a;
	a.remove(1);
	
		
		for (int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("-----");
	

		{
	for (int i=0;i<b.size();i++)
	{
		System.out.println(b.get(i));
	}
		}
	}
}
	
		
