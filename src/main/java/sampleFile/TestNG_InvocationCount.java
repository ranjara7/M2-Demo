package sampleFile;

import org.testng.annotations.Test;

public class TestNG_InvocationCount {
	
	@Test(invocationCount = 3)
	public void createUser()
	{
		System.out.println("Hi there");
	}

}
