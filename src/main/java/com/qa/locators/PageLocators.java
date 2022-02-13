package com.qa.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.utilities.TestUtility;
public class PageLocators extends TestBase {
	public PageLocators()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".button.line") 
	protected WebElement DrawaLineOption;
	
	@FindBy(css="#imageView")
	protected WebElement Imagepath;
}
