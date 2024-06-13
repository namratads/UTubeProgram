package com.pattern;


public class TriAstricMidNum {

	public static void main(String[] args) {
		int number = 7;
		for (int line = 1; line < number; line++) {
			for (int space = number; space>line; space--) {
				System.out.print(" ");
			}
			
			if(line==3 || line==4 || line==5) {
				if(line==3) {
					for (int num = 1; num <= line; num++) {
						if(num==1 || num==line) {
							System.out.print("* ");
						}else{
							System.out.print(num-1+" ");
						}
					}
				}else if(line==4){
					for (int num = 1; num <= line; num++) {
						if(num==1 || num==line) {
							System.out.print("* ");
						}else{
							System.out.print(num-1+" ");
						}
					}
				}else if(line==5){
					for (int num = 1; num <= line; num++) {
						if(num==1 || num==line) {
							System.out.print("* ");
						}else{
							System.out.print(num-1+" ");
						}
					}
				}
			}else {
				for (int ast = 1; ast <= line; ast++) {
					System.out.print("* ");
				}
			}			
			System.out.println();
		}
	}
}


  