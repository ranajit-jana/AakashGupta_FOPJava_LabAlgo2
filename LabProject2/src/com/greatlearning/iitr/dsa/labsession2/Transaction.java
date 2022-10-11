package com.greatlearning.iitr.dsa.labsession2;

import java.util.Scanner;
      
public class Transaction {
	

		public static void main(String[] args) {
			
			Scanner sc =new Scanner(System.in);
			
			System.out.println("Enter the Size of transaction Array");
			
			int noOFTransactions = sc.nextInt();
			
			int arr[] = new int[noOFTransactions];
			
			System.out.println("Enter the values of Array");
			
			for(int i = 0; i < arr.length ; i++) {
				
			arr[i] = sc.nextInt();
				
			}
			
			System.out.println("Enter the total number of targets that needs to be achieved");
			
			int noOFTargets = sc.nextInt();
			
			while( noOFTargets-- !=0);
			
			System.out.println("Enter the Value Of Target");
			
			long targetValue = sc.nextInt();
			 
			boolean isTargetAchieved = false;
			
			long sum=0;
			 
			for(int i=0; i<arr.length; i++) {
			
				sum=sum+arr[i];
			
				if(sum>=targetValue) {
					
					System.out.println("target is achieved after "+ (i+1)+"transactions");
					
					isTargetAchieved= true;
					break;	
				}	
				
			}
			if(isTargetAchieved==false) {
				
				System.out.println("Given Target can not be Achieved");
				
			}
							
		}

	}


