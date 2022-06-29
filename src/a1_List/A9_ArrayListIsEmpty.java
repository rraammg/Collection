package a1_List;

import java.util.ArrayList;

public class A9_ArrayListIsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("hi");
		a.add('r');
		a.add(1);
		System.out.println(a);//[hi r 1]
		System.out.println(a.isEmpty());//false
		a.clear();
		System.out.println(a);
		System.out.println(a.isEmpty());//true
		
	}

}
