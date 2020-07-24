package project.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterProject {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\workspace\\SeleniumProjectTask\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement soundar=driver.findElement(By.id("email"));
		soundar.sendKeys("8072200625");
		WebElement soundar1=driver.findElement(By.id("pass"));
		soundar1.sendKeys("Sm@8072200625");
		WebElement clicke=driver.findElement(By.id("u_0_b"));
		clicke.click();
		
		
		
		
}
}
