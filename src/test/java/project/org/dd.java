package project.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dd {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\SeleniumProjectTask\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement s=driver.findElement(By.xpath("//a[@class='button button-orange'][1]"));
		WebElement t=driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		 Actions soundar = new Actions(driver);
		soundar.dragAndDrop(s, t).perform();
		
	}

}
