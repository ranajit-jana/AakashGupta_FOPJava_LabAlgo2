package com.iitr.greatlearning.dsalab2;

import java.util.Scanner;

public class NotesCounter {
	
	
       public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Size of Currency Denominations:");
			
			int noOfDenominations = sc.nextInt();
			
			int arr[]= new int[noOfDenominations];
			
			System.out.println("Enter the Currency Denomination Values:");
			
			for(int i=0; i<arr.length;i++) {
				
				arr[i]= sc.nextInt();
				
			}
				
				System.out.println("Enter the amount you want to pay:");
				
				int payment = sc.nextInt();
				
				sortArray(arr);
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
				
				CountNotes(arr,payment);
				
		}

		private static void CountNotes(int[] arr, int payment) {
			
			int[] notesCounter = new int[arr.length];
			
				try {
					
			for(int i=0; i<arr.length;i++) {
				
				if(payment>=arr[i]) {
					notesCounter[i]= payment/arr[i];
					payment = payment-notesCounter[i] * arr[i];		
					
				}
			}
			if(payment>0) {
				
				System.out.println("your payment amount can not be achieved with the heighest denomination:");
				
			}else {
				
			
			System.out.println("your Payment approach in order to give min number of notes will be:");
			
			    for(int i=0;i<arr.length;i++) {
				
			    	if(notesCounter[i] !=0 ) {
					
					System.out.println(arr[i] + " : " + notesCounter[i]);				
					
				}
			}
			
			}
			}
			
				catch(ArithmeticException e) {
					
			         System.out.println("Denomination cannot be zero");
						
				}
				
				}

		private static void sortArray(int[] arr) {
			
			for(int i=0;i<arr.length-1; i++) {
				
				for(int j=0; j<arr.length-1-i;j++) {
					
					if(arr[j]<arr[j+1]) {	
					
						int temp = arr[j];
					
						arr[j]=arr[j+1];
					
						arr[j+1]=temp;
					
					
					}
				}
			}
			
		}

	}


