package com.testing.JunitTesting;

import java.util.Scanner;

public  class verification {
	public static String userid= "saksham.gg";
	public static String userpassd = "1234";
	public static String id;
	public static String passd;
	
	public static boolean auth() 
	{
		if(id.equals(userid) && passd.equals(userpassd)) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	 static void inputid() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User ID : ");
		id = sc.next();	
	}
	
	 static void inputpassd() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Password : ");
		passd = sc.next();
	}

}
