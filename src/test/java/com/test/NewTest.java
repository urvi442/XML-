package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
 WebDriver driver;
	@Test
  public void f() {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click(); 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
