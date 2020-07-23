package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLaunch {
public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\welcome\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        
        WebElement loBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loBtn.click();
}
}
