package com.selenium.practise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchFilpkart {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\04846Y744\\Desktop\\Selenium\\Section 3\\FilpkartTestData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		//System.out.println(URL);
		String UN = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN, Keys.TAB, pwd);
		
		

	}

	public void chnagesDone()
	{
		System.out.println("Changes done successfully in clone");
	}

}
