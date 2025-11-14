package week2.day2;

public class ReplaceSpecialCharacters {
	
	    public static void main(String[] args) {
	        String text = "Hi@Karthic! How#are$you%today?";

	        System.out.println("Before removing special characters: " + text);

	        // Keep only letters, numbers, and spaces — remove everything else
	        String cleaned = text.replaceAll("[^a-zA-Z0-9 ]", "");

	        System.out.println("After removing special characters: " + cleaned);
	    }
	}



