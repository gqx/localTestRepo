package test1;

import java.util.ArrayList;

public class Test {
	final ArrayList<String> l = new ArrayList<String>();
	protected String a = "hello";
	public static void main(String[] args){
		float f = (float) 3.5;
		new Test().testMethord();
		
	}
	
	public void testMethord(){
		String s = "aaa";
//		l.add("");
		setS(s);
		System.out.println(s);
	}
	
	public void setS(String s){
		s = "bbb";
	}
}
