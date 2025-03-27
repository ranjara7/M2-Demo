package sampleFile;

import org.testng.annotations.Test;

public class TestNG_dependsOnMethods {
	
	@Test(priority = 1, dependsOnMethods = {"modifyUser"})
	
	public void createUser()
	{
		System.out.println("1.User created");
	}
	
	@Test(dependsOnMethods = {"deleteUser"})
	public void modifyUser()
	{
		System.out.println("2.User modified");
	}
	
	@Test
	public void deleteUser()
	{
		System.out.println("3.User Deleted");
	}

}
