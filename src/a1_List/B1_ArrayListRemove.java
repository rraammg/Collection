package a1_List;

import java.util.ArrayList;

public class B1_ArrayListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("hi");
		a.add('r');
		a.add(1);
		a.remove(2);
		
		System.out.println(a);//[hi r]
		a.remove("hi");
		System.out.println(a);//[r]
	}

}
