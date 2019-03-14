package com.app.atm;

import java.util.*;
class  Cheek
{
boolean k;
boolean verify(int pinno)
	{
	switch(pinno)
		{
		case 1111: k=true;
		break;
		case 2222: k=true;
		break;
		case 3333: k=true;
		break;
		case 4444: k=true;
		break;
		case 5555:k=true;
		break;
		default: k=false;
		}
		return(k);
	}
}

class Atmpin
{ 
	
	public static void main(String [] ag)
	{
		int count=0;
		Scanner s=new Scanner(System.in);
		while(true)
		{
		System.out.println("enter the PIN NO ");
		int pinno=s.nextInt();
		if(pinno>=1111 && pinno<=9999)
		{
			Cheek c=new Cheek();
			boolean k=c.verify(pinno);
			if(k)
			{
				System.out.println("ENTER THE AMOUNT ");
				int am=s.nextInt();
				System.out.println(" TRANSATION IS COMPLETED ");
				System.out.println("**** THANKS MYDEAR********");
				System.exit(0);
			}
			else
			{
				System.out.println( " PIN NUMBER  IS WRONG \n ");
				count ++;
			}
		}

			else
				{
				System.out.println("INVALID PIN NO ****\n");
				count ++;
			}
			if(count==3)
			{
				System.out.println(" UR PIN NO IS BLOCK FOR 24 HOUR's");
			System.exit(0);

			}else{}
		}
		}
	}

