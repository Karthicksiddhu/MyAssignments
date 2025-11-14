package week2.day4;

import java.util.Iterator;

public class LearnDuplicate {

	public static void main(String[] args) {
		String sentence = ("II Loovve beeing huuman and aanimmal");
		System.out.println("Before remvoing duplicates  " + sentence);
		 for (int i=0; i <sentence.length(); i++) {
			 for(int j= i +1;j<sentence.length(); j++) {
				 if (sentence.charAt(i)==sentence.charAt(j)) {
					 
					 System.out.print(sentence.charAt(i));
					 
					 
				 }
			 }
			 
			 
			 
		 }
		
		 System.out.println("After removing duplicates  ");

	}

}
