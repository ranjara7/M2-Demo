package sampleFile;

import org.testng.annotations.Test;

public class TestNG_Priority {
	
	@Test(priority = 1)
	public void createUser()
	{
		System.out.println("1.User created");
	}
	
	@Test(priority = 2)
	public void modifyUser()
	{
		System.out.println("2.User modify");
	}
	
	@Test(priority = 3)
	public void deleteUser()
	{
		System.out.println("3.User deleted");
	}

}
