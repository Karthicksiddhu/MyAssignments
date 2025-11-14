package week2.day4;

import java.util.Arrays;

public class LearnDupLetters {

	public static void main(String[] args) {
		String [] Dupvalue = {"A","A","B","C","V","V","D","E","F","F","G","G","H"};
		System.out.println("Duplicate values are");
		
		for(int i=0 ; i < Dupvalue.length; i++) {
			for( int j= i + 1; j <Dupvalue.length; j++) {
				if (Dupvalue[i].equals(Dupvalue[j])) {
				System.out.println(Dupvalue[i]);
				break;
			}
			}
			
		}
	
	}

}
