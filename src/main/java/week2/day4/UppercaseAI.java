package week2.day4;

public class UppercaseAI {

	public static void main(String[] args) {
		
		        String text = "I Love Java Programming 101";

		        System.out.println("Original text: " + text);
		        System.out.print("Uppercase letters only: ");

		        // Loop through each character
		        for (int i = 0; i < text.length(); i++) {
		            char ch = text.charAt(i); // Get one character at a time

		            // Check if character is uppercase
		            if (Character.isLowerCase(ch)) {
		                System.out.print(ch);
		            }
		        }
		    }
		

	}

