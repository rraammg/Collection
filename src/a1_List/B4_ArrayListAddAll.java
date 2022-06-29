package a1_List;

import java.util.ArrayList;

public class B4_ArrayListAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("hi");
		a.add("hello");
		a.add("welcome");
		ArrayList b=new ArrayList();
		b.add("dhaswin");
		b.add("ram");
		b.add("India");
		a.addAll(b);
		System.out.println(a.size());
		for(int i=0;i<6;i++)
		{
			System.out.println(a.get(i));
		}
	}

}
