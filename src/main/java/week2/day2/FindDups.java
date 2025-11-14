package week2.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		int [] num = {2,5,7,7,5,2,13,3,13};
		Arrays.sort(num);
		System.out.println("The Duplicate values are");
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
			for (int j = i + 1; j < num.length; j++) {
				if (num[i]==num[j]) {
					System.out.println(num[i]+" Duplicate");
					
				}
}
		}
		
}
		
		
	}

			
		
	


