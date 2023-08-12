package org.programeee;

import java.util.Arrays;
import java.util.Scanner;

//anagram or not
public class Anagram {
	public static void main(String[] args) {
String s1= "barkavi";
String s2 = "kavirba";
System.out.println(s1+"  "+s2);
char[] c1 = s1.toCharArray();//oouput--{'b',a,r,k,a,v,i}
char[] c2 = s2.toCharArray();

Arrays.sort(c1);
Arrays.sort(c2);
if (Arrays.equals(c1, c2)) {
	System.out.println("Its a Anagram");
	
} else {
	System.out.println("Its a NOT Anagram");

}

////OR
//Scanner s = new Scanner(System.in);
//System.out.println("Enter a two words to find Anagram\n");
//String a = s.next();
//String b = s.next();
//System.out.println("Your given words are  :"+a+"  "+b);
//char[] c3=a.toCharArray();
//char[] c4=b.toCharArray();
//
//

System.out.println();


}
}