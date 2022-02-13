package com.qa.pageobjects;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.constants.Constants;
import com.qa.locators.PageLocators;
import com.qa.utilities.TestUtility;


public class PageObjects extends PageLocators{
                 
	 public void SelectDrawalineOption() throws InterruptedException
  	{
     	TestUtility.clickOn(DrawaLineOption);
     	 
  	}
	 
	public void Drawhorizontalline() throws InterruptedException
	{

		TestUtility.Drawaline(Imagepath,50,0);
	}
	
	public void Drawverticalline() throws InterruptedException
	{

		TestUtility.Drawaline(Imagepath,0,50);
	}
	
}
