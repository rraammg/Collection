package a1_List;

import java.util.ArrayList;

public class A4_ArrayListGetAllvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("hi");
		a.add('r');
		a.add(1);
		for (int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));//hi r 1		
			
	}
		
	}
}
