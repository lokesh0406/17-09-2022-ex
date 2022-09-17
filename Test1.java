package com.ticket.demo;

import java.util.Arrays;
import java.util.Scanner;

class Ticket {
	  
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



public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] tickets = {2,3,3,2} ;
		
		System.out.println("input Array"+Arrays.toString(tickets));
		
        System.out.println("Enter the index value to find the seconds  ");
		
		int k1 = sc.nextInt();
		
		System.out.println("Total Seconds to buy the tickets =  " + new Ticket().TimeTaken(tickets, k1));
		
		sc.close();
	}

}
