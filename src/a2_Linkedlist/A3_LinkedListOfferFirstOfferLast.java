package a2_Linkedlist;

import java.util.LinkedList;

public class A3_LinkedListOfferFirstOfferLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a=new LinkedList();
		a.add("MUN");
		a.add("LIV");
		a.add("CSK");
		System.out.println(a);
		
		a.offerFirst("MI");
		a.offerLast("RCB");
		System.out.println(a);
		
	}

}
