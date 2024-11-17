package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("good");
		System.out.println("I will execute last999999");
	}
	
	@Test(groups={"Smoke2"})
	public void TESTTESTTEST()
	{
		System.out.println("TESTTESTTEST");
		System.out.println("TESTTESTTESTTEST");
		System.out.println("TESTTESTTESTTESTTEST");
		System.out.println("TESTTESTTESTTESTTESTTEST");
		System.out.println("TESTTESTTESTTESTTESTTESTTEST");
		System.out.println("TESTTESTTESTTESTTESTTESTTESTTEST");
		System.out.println("I will execute last999999");
		
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}
}
