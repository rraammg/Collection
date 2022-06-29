package a2_Linkedlist;

import java.util.LinkedList;

public class A5_PollFirstPollLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a=new LinkedList();
		a.add("MUN");
		a.add("LIV");
		a.add("CSK");
		a.add("Chelsea");
		System.out.println(a);

		System.out.println(a.pollFirst());
		System.out.println(a.pollLast());
		System.out.println(a);
	}

}
