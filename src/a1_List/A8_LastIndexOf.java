package a1_List;

import java.util.ArrayList;

public class A8_LastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("hi");//0
		a.add('r');//1
		a.add(1);//2
		a.add("hi");//3
		System.out.println(a.lastIndexOf("hi"));//3
	}

}
