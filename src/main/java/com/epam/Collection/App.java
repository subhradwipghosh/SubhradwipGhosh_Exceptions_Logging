package com.epam.Collection;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger lgr = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {	
    	Scanner s= new Scanner(System.in);
    	lgr.info("\n1.Calculate Simple Interest.\n" +
    					  "2.Calculate Compound Interest.\n" +
   						  "3.Calculate House Construction Cost.\n" +
   					  	  "Enter Your Choice: ");
   		int x = s.nextInt();
   		switch(x)
   		{
   			case 1:
   				lgr.info("\nAmount after Simple Interest is " + Solve.input(x) + "\n");
   				break;
   			case 2: 
   				lgr.info("\nAmount after Compound Interest is " + Solve.input(x) + "\n");
    			break;
    		case 3:
    			lgr.info("Your total cost will be " + Solve.ConstructionCost() +" INR\n\n" );
   				break;
    		default:
   				lgr.error("\nWrong Choice! \n");
   		}
    	s.close();
    	lgr.debug("Program Closed. \n");
    }
}
