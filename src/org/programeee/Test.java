package org.programeee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//anandh Shankar   op--> @n@@ndh -->sh@@@nk@@@@r
public class Test {
public static void main(String[] args) {
	String str = "anandh";
	String str1 = " Shankar";
	System.out.println("Input String is : "+str+str1);
	String c=str.replaceFirst("a","@");
	String d = c.replaceAll("a", "@@");
	System.out.println("Output:");
	//System.out.println(d);

	
	String e=str1.replaceFirst("a", "@@@");
	String f=e.replaceAll("a","@@@@");
	System.out.println(d+f);
	
}

	
}
