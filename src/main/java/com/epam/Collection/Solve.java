package com.epam.Collection;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.Math;
public class Solve {
	private static final Logger lgr = LogManager.getLogger(Solve.class);
	//Input method for Simple & Compound Interest called from App Class
    public static double input(int x)
    {
    	Scanner s= new Scanner(System.in);
    	double a=0d;
    	
    	lgr.info("\nEnter Principle Balance: ");
		double p = s.nextDouble();
    
		lgr.info("Enter Annual Interest Rate (in percentage): ");
		double r = s.nextDouble();
		r/=100;
		
		lgr.info("Enter Time Period (in year) : ");
		double t = s.nextDouble();
		switch(x)
    	{
    		case 1:
    			a=SI(p,r,t);
    			break;
    		case 2:
    			lgr.info("Enter number of times interest applied (per Time Period) : ");
    			double n = s.nextDouble();
    			a=CI(p,r,n,t);
    	}
		s.close();
        return(a);
    }
    
	public static double SI(double p, double r, double t)
    {
		return( p*r*t ); //Calculating Simple Interest
	}
	
    public static double CI(double p, double r, double n, double t)
    {
    	return( p * Math.pow( (1+(r/n)), n*t) - p ); //Calculating Compound Interest
    }
    
    public static int ConstructionCost()
    {
    	Scanner s= new Scanner(System.in);
    	lgr.info("\nCost List of Home (per square feet):\n" +
    			          "1.Standard Materials: 12,000 INR\n" +
   						  "2.Above Standard Materials: 15,000 INR\n" +
   				          "3.High Standard Materials: 18,000 INR\n" +
   						  "4.High Standard Materials & Fully Automated: 25,000\n" +
   				          "Enter Your Choice: ");    		
    	int x = s.nextInt();
    	if(x>4 || x<1)
    	{
    		lgr.error("\nWrong Choice! \n" );
    		lgr.debug("Program Closed. \n");
    		System.exit(0);
    	}
    	lgr.info("Enter the required area (in square feet): " );   
    	int area = s.nextInt();
    	int price[] = {12000,15000,18000,25000};
    	int cost= area * price[x-1];
    	s.close();
    	return cost;
    }
    
}
