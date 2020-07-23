package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchBrowser {
public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\welcome\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        String url = driver.getCurrentUrl();
        System.out.println(url);
        
        String title = driver.getTitle();
        System.out.println(title);
        
        WebElement userName = driver.findElement(By.id("email"));
        userName.sendKeys("soundarya1496@gmail.com");
        
        WebElement passTxt = driver.findElement(By.name("pass"));
        passTxt.sendKeys("9677901327");
        
        WebElement loginBtn = driver.findElement(By.id("loginbutton"));
        loginBtn.click();
        

        
         

}
}
