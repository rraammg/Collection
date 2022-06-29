package a1_List;

import java.util.ArrayList;

public class B5_ArrayListInsideArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList>c= new ArrayList<ArrayList>();
		ArrayList a=new ArrayList();
		a.add("hi");
		a.add("hello");
		a.add("welcome");
		ArrayList b=new ArrayList();
		b.add("dhaswin");
		b.add("ram");
		b.add("India");
		c.add(a);
		c.add(b);
		System.out.println(c);//[[hi hello welcome] [dhaswin ram India]]
	}

}
