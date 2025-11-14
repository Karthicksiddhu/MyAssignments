package week2.day4;

public class LearnUppercase {

	public static void main(String[] args) {
		String textvalue = ("I LoVE PEOple In ThE EArth");
		System.out.println(textvalue   +  "  Before removing uppercase");
		String removelowercase = textvalue.replaceAll("[^A-Z]", "@");
		System.out.println(removelowercase  + "  After removing uppercase");

	}

}


