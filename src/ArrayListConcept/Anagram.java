package ArrayListConcept;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anagram m=new Anagram();
		m.getAnagram("listen","sint");

		
		System.out.println("Diwakar Patil");
		System.out.println("I am from local");

	}
	
	public void getAnagram(String a, String b) {

		System.out.println("I am from Remote");
		if(a.length()!=b.length()) {
			System.out.println("Two strings are not palindrome");
		}
		else {
			char c[]=a.toCharArray();
			char d[]=b.toCharArray();
			
			Arrays.sort(c);
			Arrays.sort(d);
			
			boolean e=Arrays.equals(c,d);
			
			if(e) {
				System.out.println("Strings are palindrome");
			}
			else {
				System.out.println("Two strings are not palindrome");
			}
		}
		
	}

}
