package com.pattern;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
	
		for ( int i=1; i<=num; i++) {
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
				for (int j=i; j<=num; j++) {
                     if(i%2==0) {
                    	 System.out.print(i+" ");
                     }else {
				    	System.out.print(j+" ");
                     }
					
				}
			System.out.println();
		}
	}
}

