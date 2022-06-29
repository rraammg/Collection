package set;

import java.util.HashSet;
import java.util.Set;

public class A1_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet a=new HashSet();
//Set a=new HashSet();

a.add("a");
a.add("c");
a.add("b");
a.add(null);
a.add("c");
System.out.println(a);//[null a b c] Set wont allow duplicate
	}

}
