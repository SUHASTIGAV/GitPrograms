package org.programeee;
//print vowels and consonants
public class CountVowel {
public static void main(String[] args)
{
	String str= "Barkavi@123";
	
	System.out.println(str);
	String s = str.replaceAll("[^A-Za-z]", "");
	
	//	
//	String vowels=s.replaceAll("[^AEIOUaeiou]", "");
//	System.out.println("Vowels Length total"+vowels.length());
//	System.out.println("No. of:"+vowels);
	
	
	//consonants
	String cons=s.replaceAll("[AEIOUaeiou]", "");
	System.out.println("Lenth of cons:   "+cons.length());
	System.out.println("given cons:  "+cons);
	
	}
}
