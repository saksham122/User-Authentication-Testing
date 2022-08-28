package com.testing.JunitTesting;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest(classes = verification.class)


class JunitTestingApplicationTests {

	
	@Test
	@DisplayName("User ID Auth Test")
	void userauth() 
	{
		assertNotNull(verification.id);
		assertEquals(verification.userid,verification.id);
		
	} 
	
	@Test
	@DisplayName("User Password Auth Test")
	void passdauth() 
	{
		assertNotNull(verification.passd);
		assertEquals(verification.userpassd, verification.passd);
	}
	
	@BeforeAll
	
	 static void testcase1() 
	{
		verification.inputid();
		verification.inputpassd();
		
		assertNotNull(verification.id);
		assertNotNull(verification.passd);
	}
	
	@AfterAll
	static void testcase2() 
	{
		if(verification.auth()) 
		{
			System.out.println("Congratulations!!! Authentication Successfull :)");
			
		}
		else 
		{
			System.out.println("Sorry! Authentication Failed, Please try again with valid User ID & Password ");
		}
		
		verification.id=null;
		verification.passd=null;
		
		assertNull(verification.id);
		assertNull(verification.passd);
	}
	



}
