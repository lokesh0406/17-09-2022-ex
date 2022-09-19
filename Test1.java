/*There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.

You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].

Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.

Return the time taken for the person at position k (0-indexed) to finish buying tickets.*/



package com.ticket.demo;

import java.util.Arrays;
import java.util.Scanner;

class s1 {
	public int TimeTaken(int tickets[],int e) {
		int seconds = 0;
		
		while (tickets[e]!=0)
		{
			for(int i=0; i<tickets.length; i++ )
			{
				if(tickets[i]==0)
					continue;
				
				if(tickets[e]==0)
					return seconds;
				
				tickets[i] = tickets[i] -1;
				seconds ++;
				
			}
		}
		return seconds;
		
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the length of the Array ");
		
		  
    	int	j=sc.nextInt();
		   
	    int[] tickets1 = new int[j] ;
	   
	    System.out.println("Enter the Array Values");
			
		   for(int i=0; i<tickets1.length;i++)
		   {
			   tickets1[i]=sc.nextInt();
		   }
		
		System.out.println("Array  "+Arrays.toString(tickets1));
		System.out.println("");
		
                System.out.println("Enter the index value to find the seconds  ");
		
		int k1 = sc.nextInt();
		
		System.out.println("Total Seconds Taken To Buy the Tickets =  " + new Ticket().TimeTaken(tickets1, k1));
		
		sc.close();
	}

}


