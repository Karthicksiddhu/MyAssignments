package week2.day2;

import org.apache.xmlbeans.impl.soap.Text;

public class SpaceRemover {

	public static void main(String[] args) {
		String content = "I Love Being Human And Being Animal";
		System.out.println("With vowels "+ content);
		String textUser = content.replaceAll("[AEIOUaeiou]", "*");
		System.out.println("Without vowels  "+ textUser);
	

		for (int i = 0; i < textUser.length(); i++) {
			System.out.print(textUser.charAt(i));
			
		}
		System.out.println();
	}

}


