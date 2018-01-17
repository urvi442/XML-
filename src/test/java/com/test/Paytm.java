package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Paytm {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/div/div/div/div[2]/ul/li/div/div/input")).sendKeys("9765987037");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://paytm.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
