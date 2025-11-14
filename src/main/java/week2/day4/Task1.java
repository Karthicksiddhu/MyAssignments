package week2.day4;

public class Task1 {
	public static void main (String[] args) {
		//  1 - I Love my India country and India is my country
		String Sentence = ("I Love my India country and India is my country");
		System.out.println("before removing duplicates  "+ Sentence);
		String[] words = Sentence.split(" ");
		for(int i =0; i < words.length; i++) {
			for (int j = i +1; j<words.length; j++) {
				if (words[i].equals(words[j])) {
					System.out.println("After removing Duplicates  " +words[i]);
				
			
			}
			
		}
		
	}

}
}
