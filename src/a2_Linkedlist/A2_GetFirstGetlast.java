package a2_Linkedlist;

import java.util.LinkedList;

public class A2_GetFirstGetlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a=new LinkedList();
		a.add("MUN");
		a.add("LIV");
		a.add("CSK");
		
		System.out.println(a.getFirst());
		System.out.println(a.getLast());//MUN CSK
		System.out.println(a.get(1));//LIV
	}

}
