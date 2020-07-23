package org.base;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static WebDriver driver;
@Test
 public void test1() {
	Assert.assertTrue(driver.getCurrentUrl().contains("https"));
	Assert.assertTrue(driver.getTitle().contains("Face"));
	WebElement user = driver.findElement(By.id("email"));
    user.sendKeys("Soundarya");
}

@Test
public void test2() {
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("9677");
	Assert.assertEquals("9677", pass.getAttribute("value"));
}
	
@Test
public void test3() {
	WebElement login = driver.findElement(By.id("u_0_b"));
	login.click();
}
	
@BeforeClass
    public static void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\welcome\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	
}
	
@Before
  public  void start() {
	Date d = new Date();
	System.out.println(d);
}
	
@After
	  public  void end() {
		Date d = new Date();
		System.out.println(d);
}
		
@AfterClass
   public static void quit() {
     driver.quit();

		
}


}

	



