package set;

import java.util.HashSet;
import java.util.TreeSet;

public class A4_CompareHashAndTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet a=new TreeSet();
				//HashSet a=new HashSet();
		a.add("a");
		a.add("c");
		a.add("b");
		a.add(null);
		a.add(1);
		a.add(true);
		a.add(1.1);
		a.add("c");
		System.out.println(a);// tree wont allow multiple datatypes but hash allows 
	}

}
