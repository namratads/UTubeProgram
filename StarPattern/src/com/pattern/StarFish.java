package com.pattern;

public class StarFish {

	public static void main(String[] args) {
		int number = 7;
		for (int line = 1; line <= number ; line++) {
			
			for (int ast = 1; ast <= number; ast++) {
			    
				System.out.print("* ");
			}
            
            System.out.println();
		}
	}
}
