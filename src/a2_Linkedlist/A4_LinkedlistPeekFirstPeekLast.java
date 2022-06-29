package a2_Linkedlist;

import java.util.LinkedList;

public class A4_LinkedlistPeekFirstPeekLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a=new LinkedList();
		a.add("MUN");
		a.add("LIV");
		a.add("CSK");
		System.out.println(a);
		a.peekFirst();
		a.peekLast();
		System.out.println(a.peekFirst());//MUN
		System.out.println(a.peekLast());//CSK
		System.out.println(a);
	}

}
