package com.qa.testcases;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.DriverManager;
import com.qa.base.TestBase;
import com.qa.locators.PageLocators;
import com.qa.pageobjects.PageObjects;
public class Test1 extends TestBase {

	@Test()
	public void Draw_a_horizontal_and_vertical_line_which_intercepts() throws InterruptedException, IOException
	{
		PageObjects.SelectDrawalineOption();
		PageObjects.Drawhorizontalline();
		PageObjects.Drawverticalline();
		Thread.sleep(5000);
	}
	
}
