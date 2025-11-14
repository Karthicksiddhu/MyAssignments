package week2.day2;

public class ReplaceNumbers {
	
	    public static void main(String[] args) {
	        String text = "My phone number is 9876543210 and I have 2 dogs";

	        System.out.println("Before replacing numbers: " + text);

	        // Replace all digits (0-9) with '*'
	        String replaced = text.replaceAll("[0-9]", "*");

	        System.out.println("After replacing numbers: " + replaced);
	    }
	}



