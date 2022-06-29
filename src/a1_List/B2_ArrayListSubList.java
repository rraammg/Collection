package a1_List;

import java.util.ArrayList;

public class B2_ArrayListSubList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("hi");
		a.add("hello");
		a.add("welcome");
		a.add("bye");
		a.add("INDIA");//in Sublist always O/P will be end index - 1 
		
		System.out.println(a.subList(2, 4));//[welcome bye]
	}

}
 