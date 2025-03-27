package com.selenium.practise;

import genericUtility.DataFromPropertiesFile;

public class Fetch_PropertiesExcel {

	public static void main(String[] args) throws Exception {
		//fetching the data from properties file
		
		DataFromPropertiesFile propUtil = new DataFromPropertiesFile();
		String url = propUtil.fetchDataFromPropertiesFile("url");
		String un = propUtil.fetchDataFromPropertiesFile("username");
		String pwd = propUtil.fetchDataFromPropertiesFile("password");

	}

}
