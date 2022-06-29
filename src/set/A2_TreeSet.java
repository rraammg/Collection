package set;

import java.util.TreeSet;

public class A2_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet a=new TreeSet();
a.add("a");
a.add("c");
a.add("b");
//a.add(null);
a.add("c");

System.out.println(a);//[a,b,c] tree wont allow NULL
	}

}
