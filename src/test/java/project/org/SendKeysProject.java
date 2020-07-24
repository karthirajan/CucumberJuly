package project.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysProject {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\workspace\\SeleniumProjectTask\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement soundar=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		soundar.sendKeys("pallipalayam");
		WebElement search=driver.findElement(By.xpath("//input[@class='gNO89b'][1]"));
		search.click();
	}

}
