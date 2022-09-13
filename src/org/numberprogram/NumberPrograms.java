package org.numberprogram;

public class NumberPrograms {
	
	public static void main(String[] args) {
		
		

		//to find the given number is odd or even
		
	/*	int num=11;
		if(num%2==0) {
			System.out.println("the given number is even");
		}else {
			System.out.println("the given number is odd");
		}
		*/
		
		// find the odd and even numbers
		
		/*for (int i=1; i<=100; i++) {
			if (i%2==0) {
				System.out.print("even number" +i+ "\n");
			}else {
			System.out.print("odd numbers" +i+ "\t");
			}
		}*/
	
		
		// find the count even number and odd number
		
		int oddcount=0;
		int evencount=0;
		
		for(int i=1; i<=1250; i++) {
			if (i%2==0) {
				evencount=evencount+1;
			}else {
				oddcount=oddcount+1;
			}
		}
		System.out.println("oddcount"+oddcount);
		System.out.println("evencount"+evencount);
	}
	
	
}
